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

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.TemporalType;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.Query;

public class QueryImpl implements Query {

  private final javax.persistence.Query _q;

  public QueryImpl(javax.persistence.Query q) {
    _q = q;
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getResultList()
   */
  @Override
  @SuppressWarnings("rawtypes")
  public List getResultList() {
    return _q.getResultList();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getSingleResult()
   */
  @Override
  public Object getSingleResult() {
    return _q.getSingleResult();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#executeUpdate()
   */
  @Override
  public int executeUpdate() {
    return _q.executeUpdate();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setMaxResults(int)
   */
  @Override
  public javax.persistence.Query setMaxResults(int maxResult) {
    return _q.setMaxResults(maxResult);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getMaxResults()
   */
  @Override
  public int getMaxResults() {
    return _q.getMaxResults();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setFirstResult(int)
   */
  @Override
  public javax.persistence.Query setFirstResult(int startPosition) {
    return _q.setFirstResult(startPosition);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getFirstResult()
   */
  @Override
  public int getFirstResult() {
    return _q.getFirstResult();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setHint(java.lang.String, java.lang.Object)
   */
  @Override
  public javax.persistence.Query setHint(String hintName, Object value) {
    return _q.setHint(hintName, value);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getHints()
   */
  @Override
  public Map<String, Object> getHints() {
    return _q.getHints();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(javax.persistence.Parameter,
   * java.lang.Object)
   */
  @Override
  public <T> javax.persistence.Query setParameter(javax.persistence.Parameter<T> param, T value) {
    return _q.setParameter(param, value);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(javax.persistence.Parameter,
   * java.util.Calendar, javax.persistence.TemporalType)
   */
  @Override
  public javax.persistence.Query setParameter(javax.persistence.Parameter<Calendar> param, Calendar value, TemporalType temporalType) {
    return _q.setParameter(param, value, temporalType);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(javax.persistence.Parameter,
   * java.util.Date, javax.persistence.TemporalType)
   */
  @Override
  public javax.persistence.Query setParameter(javax.persistence.Parameter<Date> param, Date value, TemporalType temporalType) {
    return _q.setParameter(param, value, temporalType);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(java.lang.String,
   * java.lang.Object)
   */
  @Override
  public javax.persistence.Query setParameter(String name, Object value) {
    return _q.setParameter(name, value);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(java.lang.String,
   * java.util.Calendar, javax.persistence.TemporalType)
   */
  @Override
  public javax.persistence.Query setParameter(String name, Calendar value, TemporalType temporalType) {
    return _q.setParameter(name, value, temporalType);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(java.lang.String, java.util.Date,
   * javax.persistence.TemporalType)
   */
  @Override
  public javax.persistence.Query setParameter(String name, Date value, TemporalType temporalType) {
    return _q.setParameter(name, value, temporalType);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(int, java.lang.Object)
   */
  @Override
  public javax.persistence.Query setParameter(int position, Object value) {
    return _q.setParameter(position, value);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(int, java.util.Calendar,
   * javax.persistence.TemporalType)
   */
  @Override
  public javax.persistence.Query setParameter(int position, Calendar value, TemporalType temporalType) {
    return _q.setParameter(position, value, temporalType);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setParameter(int, java.util.Date,
   * javax.persistence.TemporalType)
   */
  @Override
  public javax.persistence.Query setParameter(int position, Date value, TemporalType temporalType) {
    return _q.setParameter(position, value, temporalType);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameters()
   */
  @Override
  public Set<javax.persistence.Parameter<?>> getParameters() {

    return _q.getParameters();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameter(java.lang.String)
   */
  @Override
  public javax.persistence.Parameter<?> getParameter(String name) {
    return _q.getParameter(name);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameter(java.lang.String,
   * java.lang.Class)
   */
  @Override
  public <T> javax.persistence.Parameter<T> getParameter(String name, Class<T> type) {
    return _q.getParameter(name, type);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameter(int)
   */
  @Override
  public javax.persistence.Parameter<?> getParameter(int position) {
    return _q.getParameter(position);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameter(int, java.lang.Class)
   */
  @Override
  public <T> javax.persistence.Parameter<T> getParameter(int position, Class<T> type) {
    return _q.getParameter(position, type);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#isBound(javax.persistence.Parameter)
   */
  @Override
  public boolean isBound(javax.persistence.Parameter<?> param) {
    return _q.isBound(param);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameterValue(javax.persistence.Parameter)
   */
  @Override
  public <T> T getParameterValue(javax.persistence.Parameter<T> param) {
    return _q.getParameterValue(param);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameterValue(java.lang.String)
   */
  @Override
  public Object getParameterValue(String name) {
    return _q.getParameterValue(name);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getParameterValue(int)
   */
  @Override
  public Object getParameterValue(int position) {
    return _q.getParameterValue(position);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setFlushMode(javax.persistence.FlushModeType)
   */
  @Override
  public javax.persistence.Query setFlushMode(FlushModeType flushMode) {
    return _q.setFlushMode(flushMode);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getFlushMode()
   */
  @Override
  public FlushModeType getFlushMode() {
    return _q.getFlushMode();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#setLockMode(javax.persistence.LockModeType)
   */
  @Override
  public javax.persistence.Query setLockMode(LockModeType lockMode) {
    return _q.setLockMode(lockMode);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#getLockMode()
   */
  @Override
  public LockModeType getLockMode() {
    return _q.getLockMode();
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.persistence.Query#unwrap(java.lang.Class)
   */
  @Override
  public <T> T unwrap(Class<T> cls) {
    return _q.unwrap(cls);
  }

  /*
   * (non-Javadoc)
   * 
   * @see io.vertx.ext.jpa.Query#getResultList(io.vertx.core.Handler)
   */
  @Override
  public void getResultList(Handler<AsyncResult<JsonArray>> resultHandler) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see io.vertx.ext.jpa.Query#getSingleResult(io.vertx.core.Handler)
   */
  @Override
  public void getSingleResult(Handler<AsyncResult<JsonObject>> resultHandler) {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see io.vertx.ext.jpa.Query#executeUpdate(io.vertx.core.Handler)
   */
  @Override
  public void executeUpdate(Handler<AsyncResult<Integer>> resultHandler) {
    // TODO Auto-generated method stub

  }

}
