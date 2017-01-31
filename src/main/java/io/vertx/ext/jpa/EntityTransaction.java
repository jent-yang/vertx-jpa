package io.vertx.ext.jpa;

import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.ext.jpa.impl.EntityTransactionImpl;

@VertxGen
public interface EntityTransaction {
	
	@GenIgnore
	public static EntityTransaction create(javax.persistence.EntityTransaction et){
		return new EntityTransactionImpl(et);
	}
	
	  /**
     * Start a resource transaction.
     * @throws IllegalStateException if <code>isActive()</code> is true
     */
    void begin();

    /**
     * Commit the current resource transaction, writing any
     * unflushed changes to the database.
     * @throws IllegalStateException if <code>isActive()</code> is false
     * @throws RollbackException if the commit fails
     */
    void commit();

    /**
     * Roll back the current resource transaction.
     * @throws IllegalStateException if <code>isActive()</code> is false
     * @throws PersistenceException if an unexpected error
     *         condition is encountered
     */
    void rollback();

    /**
     * Mark the current resource transaction so that the only
     * possible outcome of the transaction is for the transaction
     * to be rolled back.
     * @throws IllegalStateException if <code>isActive()</code> is false
     */
    void setRollbackOnly();

    /**
     * Determine whether the current resource transaction has been
     * marked for rollback.
     * @return boolean indicating whether the transaction has been
     *         marked for rollback
     * @throws IllegalStateException if <code>isActive()</code> is false
     */
    boolean getRollbackOnly();

    /**
     * Indicate whether a resource transaction is in progress.
     * @return boolean indicating whether transaction is
     *         in progress
     * @throws PersistenceException if an unexpected error
     *         condition is encountered
     */
    boolean isActive();
}