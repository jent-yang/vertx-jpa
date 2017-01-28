package io.vertx.ext.jpa.impl;

import io.vertx.core.Vertx;
import io.vertx.ext.jpa.JpaService;
import io.vertx.ext.jpa.PersistenceUnitOptions;

public class JpaServiceImpl implements JpaService {
	
	private final Vertx vertx;
	
	private PersistenceUnitOptions options;
	
	public JpaServiceImpl(Vertx vertx, PersistenceUnitOptions options) {
		this.vertx = vertx;
		this.options = options;
		init();
	}

	private void init() {
	}

	@Override
	public JpaService getEntityManager() {
		
		return this;
	}
}
