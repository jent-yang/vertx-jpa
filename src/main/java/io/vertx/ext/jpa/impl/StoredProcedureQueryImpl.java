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

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.jpa.StoredProcedureQuery;

public class StoredProcedureQueryImpl implements StoredProcedureQuery {

  private final javax.persistence.StoredProcedureQuery _spq;

  public StoredProcedureQueryImpl(javax.persistence.StoredProcedureQuery spq) {
    _spq = spq;
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.StoredProcedureQuery#execute(io.vertx.core.Handler)
   */
  @Override
  public void execute(Handler<AsyncResult<Boolean>> completionHandler) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.StoredProcedureQuery#hasMoreResults(io.vertx.core.Handler)
   */
  @Override
  public void hasMoreResults(Handler<AsyncResult<Boolean>> handler) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see io.vertx.ext.jpa.StoredProcedureQuery#getUpdateCount(io.vertx.core.Handler)
   */
  @Override
  public void getUpdateCount(Handler<AsyncResult<Integer>> handler) {
    // TODO Auto-generated method stub
    
  }

 
}
