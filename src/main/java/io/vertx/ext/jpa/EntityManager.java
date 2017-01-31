package io.vertx.ext.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.impl.EntityManagerImpl;

@VertxGen
public interface EntityManager {

	@GenIgnore
	public static EntityManager create(javax.persistence.EntityManager em){
		
		return new EntityManagerImpl(em);
	} 
	
	@Fluent
	EntityManager persist(Object entity, Handler<AsyncResult<Void>> handler);

	@Fluent
	<T> EntityManager merge(T entity, Handler<AsyncResult<T>> handler);

	@Fluent
	EntityManager getTransaction(Handler<AsyncResult<EntityTransaction>> handler);
	
	@Fluent
	EntityManager remove(Object entity, Handler<AsyncResult<Void>> handler);
	
	@Fluent
	<T> EntityManager find(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler);
	
	@Fluent
	 <T> EntityManager find(Class<T> entityClass, Object primaryKey,
             JsonObject properties, Handler<AsyncResult<T>> handler);
	
	@Fluent
	<T> EntityManager find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Handler<AsyncResult<T>> handler);
	
	@Fluent
	 <T> EntityManager find(Class<T> entityClass, Object primaryKey, LockModeType lockMode,
            JsonObject properties, Handler<AsyncResult<T>> handler);
	
	@Fluent
	<T> EntityManager getReference(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler);
	
	@Fluent
	EntityManager flush();

	@Fluent
	EntityManager setFlushMode(FlushModeType flushMode);
	
	@Fluent
	EntityManager getFlushMode(Handler<AsyncResult<FlushModeType>> handler);
	
	@Fluent
	EntityManager lock(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler);

	@Fluent
	EntityManager lock(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler);
	
	@Fluent
	EntityManager refresh(Object entity, Handler<AsyncResult<Void>> handler);
	
	@Fluent
	EntityManager refresh(Object entity, JsonObject properties, Handler<AsyncResult<Void>> handler);
	
	@Fluent
	EntityManager refresh(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler);
	
	@Fluent
	EntityManager refresh(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler);
	
	@Fluent
	EntityManager clear(Handler<AsyncResult<Void>> handler);

	@Fluent
	EntityManager detach(Object entity, Handler<AsyncResult<Void>> handler);

	@Fluent
	EntityManager contains(Object entity, Handler<AsyncResult<Boolean>> handler);
	
	@Fluent
	EntityManager getLockMode(Handler<AsyncResult<LockModeType>> handler);
	
	@Fluent
	EntityManager setProperty(String propertyName, Object value);
	
	@Fluent
	EntityManager getProperties(Handler<AsyncResult<JsonObject>> handler);
	
	@Fluent
	EntityManager createQuery(String qlString, Handler<AsyncResult<Query>> handler);
	
	@Fluent
	<T> EntityManager createQuery(CriteriaQuery<T> criteriaQuery, Handler<AsyncResult<TypedQuery<T>>> handler);
	
	@Fluent
	EntityManager createQuery(CriteriaUpdate updateQuery, Handler<AsyncResult<Query>> handler);

	@Fluent
	EntityManager createQuery(CriteriaDelete deleteQuery, Handler<AsyncResult<Query>> handler);
	
	@Fluent
	<T> EntityManager createQuery(String qlString, Class<T> resultClass, Handler<AsyncResult<TypedQuery<T>>> handler);
	
	@Fluent
	EntityManager createNamedQuery(String name, Handler<AsyncResult<Query>> handler);
	
	@Fluent
	<T> EntityManager createNamedQuery(String name, Class<T> resultClass, Handler<AsyncResult<TypedQuery<T>>> handler);
	
	@Fluent
	EntityManager createNativeQuery(String sqlString, Handler<AsyncResult<Query>> handler);
	
	@Fluent
	EntityManager createNativeQuery(String sqlString, Class<?> resultClass, Handler<AsyncResult<Query>> handler);
	
	@Fluent
	EntityManager createNativeQuery(String sqlString, String resultSetMapping, Handler<AsyncResult<Query>> handler);
	
	@Fluent
	EntityManager createNamedStoredProcedureQuery(String name, Handler<AsyncResult<StoredProcedureQuery>> handler);

	@Fluent
	EntityManager createStoredProcedureQuery(String procedureName, Handler<AsyncResult<StoredProcedureQuery>> handler);
	
	@Fluent
	EntityManager joinTransaction();
	
	@Fluent
	EntityManager isJoinedToTransaction(Handler<AsyncResult<Boolean>> handler);
	
	@Fluent
	EntityManager close();
	
	@Fluent
	EntityManager isOpen(Handler<AsyncResult<Boolean>> result);
	
	@GenIgnore
	EntityManagerFactory getEntityManagerFactory();
	
	@GenIgnore
	CriteriaBuilder getCriteriaBuilder();
	
	@Fluent
	EntityManager getMetamodel(Handler<AsyncResult<Metamodel>> handler);
	
	@Fluent
	EntityManager createEntityGraph(String graphName, Handler<AsyncResult<EntityGraph<?>>> handler);

	@Fluent
	EntityManager getEntityGraph(String graphName, Handler<AsyncResult<EntityGraph<?>>> handler);

	@Fluent
	<T> EntityManager getEntityGraphs(Handler<AsyncResult<List<EntityGraph<T>>>> handler);
}