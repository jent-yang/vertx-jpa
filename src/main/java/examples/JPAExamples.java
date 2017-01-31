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