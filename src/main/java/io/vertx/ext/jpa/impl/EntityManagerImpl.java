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

import java.util.List;
import java.util.Map;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.EntityManagerExt;

public class EntityManagerImpl implements EntityManagerExt {

  private final javax.persistence.EntityManager _em;

  public EntityManagerImpl(javax.persistence.EntityManager em) {
    this._em = em;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#persist(java.lang.Object)
   */
  @Override
  public void persist(Object entity) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#merge(java.lang.Object)
   */
  @Override
  public <T> T merge(T entity) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#remove(java.lang.Object)
   */
  @Override
  public void remove(Object entity) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#find(java.lang.Class, java.lang.Object)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#find(java.lang.Class, java.lang.Object, java.util.Map)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, Map<String, Object> properties) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#find(java.lang.Class, java.lang.Object, javax.persistence.LockModeType)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#find(java.lang.Class, java.lang.Object, javax.persistence.LockModeType, java.util.Map)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Map<String, Object> properties) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getReference(java.lang.Class, java.lang.Object)
   */
  @Override
  public <T> T getReference(Class<T> entityClass, Object primaryKey) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#flush()
   */
  @Override
  public void flush() {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#setFlushMode(javax.persistence.FlushModeType)
   */
  @Override
  public void setFlushMode(FlushModeType flushMode) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getFlushMode()
   */
  @Override
  public FlushModeType getFlushMode() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#lock(java.lang.Object, javax.persistence.LockModeType)
   */
  @Override
  public void lock(Object entity, LockModeType lockMode) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#lock(java.lang.Object, javax.persistence.LockModeType, java.util.Map)
   */
  @Override
  public void lock(Object entity, LockModeType lockMode, Map<String, Object> properties) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#refresh(java.lang.Object)
   */
  @Override
  public void refresh(Object entity) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#refresh(java.lang.Object, java.util.Map)
   */
  @Override
  public void refresh(Object entity, Map<String, Object> properties) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#refresh(java.lang.Object, javax.persistence.LockModeType)
   */
  @Override
  public void refresh(Object entity, LockModeType lockMode) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#refresh(java.lang.Object, javax.persistence.LockModeType, java.util.Map)
   */
  @Override
  public void refresh(Object entity, LockModeType lockMode, Map<String, Object> properties) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#clear()
   */
  @Override
  public void clear() {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#detach(java.lang.Object)
   */
  @Override
  public void detach(Object entity) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#contains(java.lang.Object)
   */
  @Override
  public boolean contains(Object entity) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getLockMode(java.lang.Object)
   */
  @Override
  public LockModeType getLockMode(Object entity) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#setProperty(java.lang.String, java.lang.Object)
   */
  @Override
  public void setProperty(String propertyName, Object value) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getProperties()
   */
  @Override
  public Map<String, Object> getProperties() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createQuery(java.lang.String)
   */
  @Override
  public Query createQuery(String qlString) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createQuery(javax.persistence.criteria.CriteriaQuery)
   */
  @Override
  public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createQuery(javax.persistence.criteria.CriteriaUpdate)
   */
  @Override
  public Query createQuery(CriteriaUpdate updateQuery) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createQuery(javax.persistence.criteria.CriteriaDelete)
   */
  @Override
  public Query createQuery(CriteriaDelete deleteQuery) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createQuery(java.lang.String, java.lang.Class)
   */
  @Override
  public <T> TypedQuery<T> createQuery(String qlString, Class<T> resultClass) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createNamedQuery(java.lang.String)
   */
  @Override
  public Query createNamedQuery(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createNamedQuery(java.lang.String, java.lang.Class)
   */
  @Override
  public <T> TypedQuery<T> createNamedQuery(String name, Class<T> resultClass) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createNativeQuery(java.lang.String)
   */
  @Override
  public Query createNativeQuery(String sqlString) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createNativeQuery(java.lang.String, java.lang.Class)
   */
  @Override
  public Query createNativeQuery(String sqlString, Class resultClass) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createNativeQuery(java.lang.String, java.lang.String)
   */
  @Override
  public Query createNativeQuery(String sqlString, String resultSetMapping) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createNamedStoredProcedureQuery(java.lang.String)
   */
  @Override
  public StoredProcedureQuery createNamedStoredProcedureQuery(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createStoredProcedureQuery(java.lang.String)
   */
  @Override
  public StoredProcedureQuery createStoredProcedureQuery(String procedureName) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createStoredProcedureQuery(java.lang.String, java.lang.Class[])
   */
  @Override
  public StoredProcedureQuery createStoredProcedureQuery(String procedureName, Class... resultClasses) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createStoredProcedureQuery(java.lang.String, java.lang.String[])
   */
  @Override
  public StoredProcedureQuery createStoredProcedureQuery(String procedureName, String... resultSetMappings) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#joinTransaction()
   */
  @Override
  public void joinTransaction() {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#isJoinedToTransaction()
   */
  @Override
  public boolean isJoinedToTransaction() {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#unwrap(java.lang.Class)
   */
  @Override
  public <T> T unwrap(Class<T> cls) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getDelegate()
   */
  @Override
  public Object getDelegate() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#close()
   */
  @Override
  public void close() {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#isOpen()
   */
  @Override
  public boolean isOpen() {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getTransaction()
   */
  @Override
  public EntityTransaction getTransaction() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getEntityManagerFactory()
   */
  @Override
  public EntityManagerFactory getEntityManagerFactory() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getCriteriaBuilder()
   */
  @Override
  public CriteriaBuilder getCriteriaBuilder() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getMetamodel()
   */
  @Override
  public Metamodel getMetamodel() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createEntityGraph(java.lang.Class)
   */
  @Override
  public <T> EntityGraph<T> createEntityGraph(Class<T> rootType) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#createEntityGraph(java.lang.String)
   */
  @Override
  public EntityGraph<?> createEntityGraph(String graphName) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getEntityGraph(java.lang.String)
   */
  @Override
  public EntityGraph<?> getEntityGraph(String graphName) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see javax.persistence.EntityManager#getEntityGraphs(java.lang.Class)
   */
  @Override
  public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> entityClass) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#persist(java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt persist(Object entity, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#merge(java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt merge(Object entity, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#getTransaction(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt getTransaction(Handler<AsyncResult<io.vertx.ext.jpa.EntityTransaction>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#remove(java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt remove(Object entity, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#find(java.lang.String, java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt find(String classname, Object primaryKey, Handler<AsyncResult<JsonObject>> resultHandler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#find(java.lang.Class, java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#find(java.lang.Class, java.lang.Object, io.vertx.core.json.JsonObject, io.vertx.core.Handler)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, JsonObject properties, Handler<AsyncResult<T>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#find(java.lang.Class, java.lang.Object, javax.persistence.LockModeType, io.vertx.core.Handler)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Handler<AsyncResult<T>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#find(java.lang.Class, java.lang.Object, javax.persistence.LockModeType, io.vertx.core.json.JsonObject, io.vertx.core.Handler)
   */
  @Override
  public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, JsonObject properties,
      Handler<AsyncResult<T>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#getReference(java.lang.String, java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt getReference(String classname, Object primaryKey, Handler<AsyncResult<JsonObject>> resultHandler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#getReference(java.lang.Class, java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public <T> T getReference(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#flush(io.vertx.core.Handler)
   */
  @Override
  public void flush(Handler<AsyncResult<Void>> completionHandler) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#getFlushMode(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt getFlushMode(Handler<AsyncResult<FlushModeType>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#lock(java.lang.Object, javax.persistence.LockModeType, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt lock(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#lock(java.lang.Object, javax.persistence.LockModeType, io.vertx.core.json.JsonObject, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt lock(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#refresh(java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt refresh(Object entity, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#refresh(java.lang.Object, io.vertx.core.json.JsonObject, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt refresh(Object entity, JsonObject properties, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#refresh(java.lang.Object, javax.persistence.LockModeType, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt refresh(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#refresh(java.lang.Object, javax.persistence.LockModeType, io.vertx.core.json.JsonObject, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt refresh(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#clear(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt clear(Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#detach(java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt detach(Object entity, Handler<AsyncResult<Void>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#contains(java.lang.Object, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt contains(Object entity, Handler<AsyncResult<Boolean>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#getLockMode(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt getLockMode(Handler<AsyncResult<LockModeType>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#getProperties(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt getProperties(Handler<AsyncResult<JsonObject>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#createQuery(java.lang.String, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt createQuery(String qlString, Handler<AsyncResult<io.vertx.ext.jpa.Query>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#createNamedQuery(java.lang.String, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt createNamedQuery(String name, Handler<AsyncResult<io.vertx.ext.jpa.Query>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#createNativeQuery(java.lang.String, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt createNativeQuery(String sqlString, Handler<AsyncResult<io.vertx.ext.jpa.Query>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#createNamedStoredProcedureQuery(java.lang.String, io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt createNamedStoredProcedureQuery(String name, Handler<AsyncResult<io.vertx.ext.jpa.StoredProcedureQuery>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#isJoinedToTransaction(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt isJoinedToTransaction(Handler<AsyncResult<Boolean>> handler) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#close(io.vertx.core.Handler)
   */
  @Override
  public void close(Handler<AsyncResult<Void>> completionHandler) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.EntityManager#isOpen(io.vertx.core.Handler)
   */
  @Override
  public EntityManagerExt isOpen(Handler<AsyncResult<Boolean>> result) {
    // TODO Auto-generated method stub
    return null;
  }

}
