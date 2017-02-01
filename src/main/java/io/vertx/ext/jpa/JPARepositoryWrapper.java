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

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class JPARepositoryWrapper<E, P> {

  protected final EntityManagerProvider provider;

  public JPARepositoryWrapper(Vertx vertx, JsonObject config) {

    provider = EntityManagerProvider.createNonShared(vertx, config);
  }

  protected <R> Handler<AsyncResult<EntityManagerExt>> connHandler(Handler<AsyncResult<R>> h1, Handler<EntityManagerExt> h2) {
    return res -> {
      if (res.succeeded()) {
        final EntityManagerExt connection = res.result();
        h2.handle(connection);
      } else {
        h1.handle(Future.failedFuture(res.cause()));
      }
    };
  }

}
