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

import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.ext.jpa.impl.EntityTransactionImpl;

@VertxGen
public interface EntityTransaction {

  @GenIgnore
  public static EntityTransaction create(javax.persistence.EntityTransaction object) {
    return new EntityTransactionImpl(object);
  }

  /**
   * Start a resource transaction.
   * 
   * @throws IllegalStateException
   *           if <code>isActive()</code> is true
   */
  void begin();

  /**
   * Commit the current resource transaction, writing any unflushed changes to
   * the database.
   * 
   * @throws IllegalStateException
   *           if <code>isActive()</code> is false
   * @throws RollbackException
   *           if the commit fails
   */
  void commit();

  /**
   * Roll back the current resource transaction.
   * 
   * @throws IllegalStateException
   *           if <code>isActive()</code> is false
   * @throws PersistenceException
   *           if an unexpected error condition is encountered
   */
  void rollback();

  /**
   * Mark the current resource transaction so that the only possible outcome of
   * the transaction is for the transaction to be rolled back.
   * 
   * @throws IllegalStateException
   *           if <code>isActive()</code> is false
   */
  void setRollbackOnly();

  /**
   * Determine whether the current resource transaction has been marked for
   * rollback.
   * 
   * @return boolean indicating whether the transaction has been marked for
   *         rollback
   * @throws IllegalStateException
   *           if <code>isActive()</code> is false
   */
  boolean getRollbackOnly();

  /**
   * Indicate whether a resource transaction is in progress.
   * 
   * @return boolean indicating whether transaction is in progress
   * @throws PersistenceException
   *           if an unexpected error condition is encountered
   */
  boolean isActive();
}