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

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.impl.JpaProviderImpl;

/**
 * An asynchronous client interface for interacting with a JDBC compliant
 * database`using JPA
 *
 * @author <a href="mailto:pflima92@gmail.com">Paulo Lima</a>
 */
@VertxGen
public interface JpaProvider {

	/**
	 * The default data source provider is C3P0
	 */
	String DEFAULT_PROVIDER_CLASS = "io.vertx.ext.jdbc.spi.impl.C3P0DataSourceProvider";

	/**
	 * The name of the default data source
	 */
	String DEFAULT_DS_NAME = "DEFAULT_DS";

	@GenIgnore
	static JpaProvider createShared(Vertx vertx, PersistenceUnitOptions config, String datasourceName) {

		return new JpaProviderImpl(vertx, config);
	}

	@GenIgnore
	static JpaProvider create(Vertx vertx, JsonObject config) {

		return new JpaProviderImpl(vertx, new PersistenceUnitOptions(config));
	}

	@GenIgnore
	static JpaProvider create(Vertx vertx, PersistenceUnitOptions config) {

		return new JpaProviderImpl(vertx, config);
	}

	@Fluent
	JpaProvider getEntityManager(Handler<AsyncResult<EntityManager>> resultHandler);
}
