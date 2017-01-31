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
	
	protected <R> Handler<AsyncResult<EntityManager>> connHandler(Handler<AsyncResult<R>> h1, Handler<EntityManager> h2){
		return res -> {
			if (res.succeeded()) {
		        final EntityManager connection = res.result();
		        h2.handle(connection);
		      } else {
		        h1.handle(Future.failedFuture(res.cause()));
		      }
		};
	}

}
