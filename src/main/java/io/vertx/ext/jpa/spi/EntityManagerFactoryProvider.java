package io.vertx.ext.jpa.spi;

import javax.persistence.EntityManagerFactory;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public interface EntityManagerFactoryProvider {
	
	EntityManagerFactoryProvider setVertx(Vertx vertx);
	
	EntityManagerFactoryProvider setConfig(JsonObject config);
	
	Future<EntityManagerFactory> getEntityManagerFactory(String datasourceName);
}