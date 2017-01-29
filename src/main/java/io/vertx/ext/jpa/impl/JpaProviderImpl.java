package io.vertx.ext.jpa.impl;

import java.util.Objects;

import javax.persistence.spi.PersistenceProvider;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.jpa.EntityManager;
import io.vertx.ext.jpa.JpaProvider;
import io.vertx.ext.jpa.PersistenceUnitOptions;

public class JpaProviderImpl implements JpaProvider {
	
	private final Vertx vertx;
	private final PersistenceUnitOptions options;
	
	private PersistenceProvider persistenceProvider;
	
	public JpaProviderImpl(Vertx vertx, PersistenceUnitOptions options) {
		Objects.requireNonNull(vertx);
		Objects.requireNonNull(options);
		this.vertx = vertx;
		this.options = options;
		init();
	}

	private void init() {
	}

	@Override
	public JpaProvider getEntityManager(Handler<AsyncResult<EntityManager>> resultHandler) {
		
		return this;
	}
}
