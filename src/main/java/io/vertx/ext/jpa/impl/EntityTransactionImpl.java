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

import io.vertx.ext.jpa.EntityTransaction;

public class EntityTransactionImpl implements EntityTransaction {

  private final javax.persistence.EntityTransaction _et;

  public EntityTransactionImpl(javax.persistence.EntityTransaction et) {
    _et = et;
  }

  @Override
  public void begin() {

    _et.begin();
  }

  @Override
  public void commit() {

    _et.commit();
  }

  @Override
  public void rollback() {

    _et.rollback();
  }

  @Override
  public void setRollbackOnly() {

    _et.rollback();
  }

  @Override
  public boolean getRollbackOnly() {

    return _et.getRollbackOnly();
  }

  @Override
  public boolean isActive() {

    return _et.isActive();
  }
}