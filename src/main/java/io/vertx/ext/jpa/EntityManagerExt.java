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

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

@VertxGen
public interface EntityManagerExt extends javax.persistence.EntityManager {

  @Fluent
  EntityManagerExt persist(Object entity, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt merge(Object entity, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt getTransaction(Handler<AsyncResult<EntityTransaction>> handler);

  @Fluent
  EntityManagerExt remove(Object entity, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt find(String classname, Object primaryKey, Handler<AsyncResult<JsonObject>> resultHandler);

  @GenIgnore
  <T> T find(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler);

  @GenIgnore
  <T> T find(Class<T> entityClass, Object primaryKey, JsonObject properties, Handler<AsyncResult<T>> handler);

  @GenIgnore
  <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Handler<AsyncResult<T>> handler);

  @GenIgnore
  <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<T>> handler);

  @Fluent
  EntityManagerExt getReference(String classname, Object primaryKey, Handler<AsyncResult<JsonObject>> resultHandler);

  @GenIgnore
  <T> T getReference(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler);

  void flush(Handler<AsyncResult<Void>> completionHandler);

  @Fluent
  EntityManagerExt getFlushMode(Handler<AsyncResult<FlushModeType>> handler);

  @Fluent
  EntityManagerExt lock(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt lock(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt refresh(Object entity, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt refresh(Object entity, JsonObject properties, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt refresh(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt refresh(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt clear(Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt detach(Object entity, Handler<AsyncResult<Void>> handler);

  @Fluent
  EntityManagerExt contains(Object entity, Handler<AsyncResult<Boolean>> handler);

  @Fluent
  EntityManagerExt getLockMode(Handler<AsyncResult<LockModeType>> handler);

  @Fluent
  EntityManagerExt getProperties(Handler<AsyncResult<JsonObject>> handler);

  @Fluent
  EntityManagerExt createQuery(String qlString, Handler<AsyncResult<Query>> handler);

  @Fluent
  EntityManagerExt createNamedQuery(String name, Handler<AsyncResult<Query>> handler);

  @Fluent
  EntityManagerExt createNativeQuery(String sqlString, Handler<AsyncResult<Query>> handler);

  @Fluent
  EntityManagerExt createNamedStoredProcedureQuery(String name, Handler<AsyncResult<StoredProcedureQuery>> handler);

  @Fluent
  EntityManagerExt isJoinedToTransaction(Handler<AsyncResult<Boolean>> handler);

  void close(Handler<AsyncResult<Void>> completionHandler);

  @Fluent
  EntityManagerExt isOpen(Handler<AsyncResult<Boolean>> result);
}