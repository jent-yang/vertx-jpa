/*
 * Copyright (c) 2011-2014 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.jpa.impl;

import java.util.Objects;
import java.util.concurrent.ExecutorService;

import javax.persistence.EntityManagerFactory;

import io.vertx.core.AsyncResult;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.impl.VertxInternal;
import io.vertx.core.json.JsonObject;
import io.vertx.core.shareddata.LocalMap;
import io.vertx.core.shareddata.Shareable;
import io.vertx.ext.jpa.EntityManagerExt;
import io.vertx.ext.jpa.EntityManagerProvider;
import io.vertx.ext.jpa.spi.EntityManagerFactoryProvider;

public class EntityManagerProviderImpl implements EntityManagerProvider {

  private static final String DS_LOCAL_MAP_NAME = "__vertx.EntityManagerProvider.providers";

  private final Vertx vertx;

  private String datasourceName;
  private JsonObject config;
  private EmfProvidereHolder holder;

  public EntityManagerProviderImpl(Vertx vertx, JsonObject config, String dataSourceName) {

    Objects.requireNonNull(vertx);
    Objects.requireNonNull(config);
    Objects.requireNonNull(dataSourceName);

    this.vertx = vertx;
    this.config = config;
    this.datasourceName = dataSourceName;
    this.holder = lookupHolder();
    setupCloseHook();
  }

  private void setupCloseHook() {
    Context ctx = Vertx.currentContext();
    if (ctx != null && ctx.owner() == vertx) {
      ctx.addCloseHook(holder::close);
    }
  }

  @Override
  public EntityManagerProvider getEntityManager(Handler<AsyncResult<EntityManagerExt>> resultHandler) {

    synchronized (vertx) {

      Future<EntityManagerExt> future = Future.future();
      vertx.executeBlocking(f1 -> {

        holder.entityManagerFactory().setHandler(res -> {
          if (res.succeeded()) {

            EntityManagerFactory emf = res.result();
            future.complete(new EntityManagerImpl(emf.createEntityManager()));
          } else {

            future.fail(res.cause());
          }
        });
      }, future.completer());
      future.setHandler(resultHandler);
    }
    return this;
  }

  private EmfProvidereHolder lookupHolder() {

    synchronized (vertx) {
      LocalMap<String, EmfProvidereHolder> map = vertx.sharedData().getLocalMap(DS_LOCAL_MAP_NAME);
      EmfProvidereHolder theHolder = map.get(datasourceName);
      if (theHolder == null) {
        theHolder = new EmfProvidereHolder((VertxInternal) vertx, config, map, datasourceName);
      } else {
        theHolder.incRefCount();
      }
      return theHolder;
    }

  }

  private class EmfProvidereHolder implements Shareable {

    ExecutorService exec;
    private int refCount = 1;
    private final String name;
    private final JsonObject config;
    private final VertxInternal vertx;
    private final LocalMap<String, EmfProvidereHolder> map;
    private final EntityManagerFactoryProvider emfProvider;
    private EntityManagerFactory emf;

    public EmfProvidereHolder(VertxInternal vertx, JsonObject config, LocalMap<String, EmfProvidereHolder> map, String name) {
      this.name = name;
      this.config = config;
      this.vertx = vertx;
      this.map = map;
      this.emfProvider = initializeProvider().setConfig(config).setVertx(vertx);
    }

    private EntityManagerFactoryProvider initializeProvider() {

      EntityManagerFactoryProvider provider = null;
      String providerClass = config.getString("provider_class", DEFAULT_EMF_PROVIDER_CLASS);

      try {
        // Try with the TCCL
        Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(providerClass);
        provider = (EntityManagerFactoryProvider) clazz.newInstance();
        return provider;
      } catch (ClassNotFoundException e) {
        // Next try.
      } catch (InstantiationException | IllegalAccessException e) {
        throw new RuntimeException(e);
      }

      try {
        // Try with the classloader of the current class.
        Class<?> clazz = this.getClass().getClassLoader().loadClass(providerClass);
        provider = (EntityManagerFactoryProvider) clazz.newInstance();
        return provider;
      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        throw new RuntimeException(e);
      }
    }

    Future<EntityManagerFactory> entityManagerFactory() {

      if (emf == null) {

        Future<EntityManagerFactory> f1 = Future.future();
        emfProvider.getEntityManagerFactory(datasourceName).setHandler(res -> {
          if (res.succeeded()) {
            emf = res.result();
            f1.complete(emf);
          } else {
            f1.fail(res.cause());
          }
        });
        return f1;
      }
      return Future.succeededFuture(emf);
    }

    void close(Handler<AsyncResult<Void>> completionHandler) {
      synchronized (vertx) {
        if (--refCount == 0) {
          Future<Void> f1 = Future.future();
          Future<Void> f2 = Future.future();
          if (completionHandler != null) {
            CompositeFuture.all(f1, f2).<Void>map(f -> null).setHandler(completionHandler);
          }
          if (emf != null) {
            vertx.executeBlocking(future -> {
              emf.close();
              future.complete();
            }, f2.completer());
          } else {
            f2.complete();
          }
          try {
            if (exec != null) {
              exec.shutdown();
            }
            if (map != null) {
              map.remove(name);
              if (map.isEmpty()) {
                map.close();
              }
            }
            f1.complete();
          } catch (Throwable t) {
            f1.fail(t);
          }
        } else {
          if (completionHandler != null) {
            completionHandler.handle(Future.succeededFuture());
          }
        }
      }
    }

    void incRefCount() {
      refCount++;
    }
  }
}