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
package io.vertx.ext.jpa.spi.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitTransactionType;

import org.hibernate.jpa.HibernatePersistenceProvider;

import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;
import io.github.lukehutch.fastclasspathscanner.scanner.ScanResult;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.spi.EntityManagerFactoryProvider;
import io.vertx.ext.jpa.spi.SmartPersistanceUnitInfo;

public class HibernateEntityManagerFactoryProvider implements EntityManagerFactoryProvider {

  private static final int NUMBER_CLASSPATH_SCANNER_THREADS = 3;
  private Vertx vertx;
  private JsonObject config;

  @Override
  public EntityManagerFactoryProvider setConfig(JsonObject config) {
    this.config = config;
    return this;
  }

  @Override
  public EntityManagerFactoryProvider setVertx(Vertx vertx) {
    this.vertx = vertx;
    return this;
  }

  @Override
  public Future<EntityManagerFactory> getEntityManagerFactory(String datasourceName) {

    Properties properties = createProperties();

    PersistenceProvider provider = new HibernatePersistenceProvider();

    SmartPersistanceUnitInfo persistenceUnitInfo = new DefaultPersistenceUnitInfoImpl(datasourceName);
    persistenceUnitInfo.setProperties(properties);

    // Using RESOURCE_LOCAL for manage transactions on DAO side.
    persistenceUnitInfo.setTransactionType(PersistenceUnitTransactionType.RESOURCE_LOCAL);

    Map<Object, Object> configuration = new HashMap<>();
    properties.entrySet().stream().forEach(e -> configuration.put(e.getKey(), e.getValue()));

    synchronized (vertx) {

      Future<EntityManagerFactory> future = Future.future();
      vertx.executeBlocking(f1 -> {

        config.getJsonArray("annotated_classes", new JsonArray()).stream()
            .forEach(p -> scanAnnotatedClasses(p.toString(), persistenceUnitInfo));
        EntityManagerFactory emf = provider.createContainerEntityManagerFactory(persistenceUnitInfo, configuration);
        future.complete(emf);
      }, future.completer());
      return future;
    }
  }

  private void scanAnnotatedClasses(String scanSpec, SmartPersistanceUnitInfo spui) {

    // ClassAnnotationMatchProcessor processor = spui::addAnnotatedClassName;
    // TODO
    ScanResult scanResult = new FastClasspathScanner(scanSpec).scan(NUMBER_CLASSPATH_SCANNER_THREADS);
    scanResult.getNamesOfClassesWithAnnotation(Entity.class).stream().forEach(spui::addAnnotatedClassName);
  }

  private Properties createProperties() {
    Properties properties = new Properties();
    properties.setProperty("hibernate.connection.url", config.getString("url", "jdbc:h2:mem:test_mem;"));
    properties.setProperty("hibernate.connection.driver_class", config.getString("driver_class", "org.h2.Driver"));
    properties.setProperty("hibernate.hbm2ddl.auto", config.getString("hbm2ddl", "create"));
    properties.setProperty("hibernate.dialect",
        config.getString("dialect", HibernateDialectProvider.dialectFromUrl(config.getString("url", "jdbc:h2:mem:test_mem;"))));
    properties.setProperty("hibernate.show_sql", config.getBoolean("show_sql", true).toString());
    properties.setProperty("hibernate.connection.username", config.getString("username", ""));
    properties.setProperty("hibernate.connection.password", config.getString("password", ""));
    properties.setProperty("hibernate.c3p0.max_size", config.getInteger("max_size", 15).toString());
    properties.setProperty("hibernate.c3p0.min_size", config.getInteger("min_size", 3).toString());
    properties.setProperty("hibernate.c3p0.max_statements", config.getInteger("max_statements", 3).toString());
    properties.setProperty("hibernate.c3p0.idle_test_period", config.getLong("idle_test_period", 3000l).toString());
    properties.setProperty("hibernate.c3p0.testConnectionOnCheckout", config.getBoolean("testConnectionOnCheckout", true).toString());
    properties.setProperty("hibernate.temp.use_jdbc_metadata_defaults", config.getBoolean("use_jdbc_metadata_defaults", false).toString());
    return properties;
  }
}