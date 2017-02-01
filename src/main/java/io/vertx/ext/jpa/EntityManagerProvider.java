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
package io.vertx.ext.jpa;

import java.util.UUID;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.impl.EntityManagerProviderImpl;

/**
 * An asynchronous client interface for interacting with a JDBC compliant
 * database`using JPA
 *
 * @author <a href="mailto:pflima92@gmail.com">Paulo Lima</a>
 */
@VertxGen
public interface EntityManagerProvider {

  /**
   * The default data source provider is C3P0
   */
  String DEFAULT_EMF_PROVIDER_CLASS = "io.vertx.ext.jpa.spi.impl.HibernateEntityManagerFactoryProvider";

  /**
   * The name of the default data source
   */
  String DEFAULT_DS_NAME = "DEFAULT_DS";

  @GenIgnore
  static EntityManagerProvider createNonShared(Vertx vertx, JsonObject config) {

    return create(vertx, config, UUID.randomUUID().toString());
  }

  @GenIgnore
  static EntityManagerProvider createShared(Vertx vertx, JsonObject config) {

    return create(vertx, config, DEFAULT_DS_NAME);
  }

  @GenIgnore
  static EntityManagerProvider createShared(Vertx vertx, JsonObject config, String datasourceName) {

    return create(vertx, config, datasourceName);
  }

  @GenIgnore
  static EntityManagerProvider create(Vertx vertx, JsonObject config, String dataSourceName) {

    return new EntityManagerProviderImpl(vertx, config, dataSourceName);
  }

  @Fluent
  EntityManagerProvider getEntityManager(Handler<AsyncResult<EntityManagerExt>> resultHandler);
}