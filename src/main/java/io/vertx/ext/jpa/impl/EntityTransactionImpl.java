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