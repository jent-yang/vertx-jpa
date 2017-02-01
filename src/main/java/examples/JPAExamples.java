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
package examples;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.EntityManagerProvider;
import io.vertx.ext.jpa.JPARepositoryWrapper;

/**
 * 
 * @author <a href="mailto:pflima92@gmail.com">Paulo Lima</a>
 */
public class JPAExamples extends JPARepositoryWrapper<Void, Void> {

  public JPAExamples(Vertx vertx, JsonObject options) {
    super(vertx, options);
  }

  public void exampleCreateDefault(Vertx vertx, JsonObject config) {

    EntityManagerProvider provider = EntityManagerProvider.createNonShared(vertx, config);
  }

  public void examplePersist(EntityManagerProvider provider, Handler<AsyncResult<Void>> resultHandler) {

    provider.getEntityManager(connHandler(resultHandler, entityManager -> {

    }));
  }
}