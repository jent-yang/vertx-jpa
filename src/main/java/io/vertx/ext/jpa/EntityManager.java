package io.vertx.ext.jpa;

import java.util.List;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

@VertxGen
interface EntityManager {

	@Fluent
	EntityManager persist(Object entity);

	@Fluent
	<T> EntityManager merge(T entity, Handler<AsyncResult<T>> resultHandler);

	@Fluent
	EntityManager remove(Object entity);

	@Fluent
	<T> EntityManager find(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> resultHandler);

	@Fluent
	<T> EntityManager find(Class<T> entityClass, Object primaryKey, JsonObject properties);

	@Fluent
	<T> EntityManager find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Handler<AsyncResult<T>> resultHandler);

	@Fluent
	<T> EntityManager find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<T>> resultHandler);

	@Fluent
	<T> EntityManager getReference(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> resultHandler);

	@Fluent
	EntityManager flush();

	@Fluent
	EntityManager setFlushMode(FlushModeType flushMode);

	FlushModeType getFlushMode();

	@Fluent
	EntityManager lock(Object entity, LockModeType lockMode);

	@Fluent
	EntityManager lock(Object entity, LockModeType lockMode, JsonObject properties);

	@Fluent
	<T> EntityManager refresh(Object entity, Handler<AsyncResult<T>> resultHandler);

	@Fluent
	EntityManager refresh(Object entity, JsonObject properties);

	@Fluent
	EntityManager refresh(Object entity, LockModeType lockMode);

	@Fluent
	EntityManager refresh(Object entity, LockModeType lockMode, JsonObject properties);

	@Fluent
	EntityManager clear();

	@Fluent
	EntityManager detach(Object entity);

	@Fluent
	EntityManager contains(Object entity, Handler<AsyncResult<Boolean>> resultHandle);

	@GenIgnore
	LockModeType getLockMode(Object entity);

	@Fluent
	EntityManager setProperty(String propertyName, Object value);

	@GenIgnore
	JsonObject getProperties();

	@GenIgnore
	Query createQuery(String qlString);

	@GenIgnore
	<T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery);

	@GenIgnore
	Query createQuery(CriteriaUpdate updateQuery);

	@GenIgnore
	Query createQuery(CriteriaDelete deleteQuery);

	@GenIgnore
	<T> TypedQuery<T> createQuery(String qlString, Class<T> resultClass);

	@GenIgnore
	Query createNamedQuery(String name);

	@GenIgnore
	<T> TypedQuery<T> createNamedQuery(String name, Class<T> resultClass);

	@GenIgnore
	Query createNativeQuery(String sqlString);

	@GenIgnore
	Query createNativeQuery(String sqlString, Class resultClass);

	@GenIgnore
	Query createNativeQuery(String sqlString, String resultSetMapping);

	@GenIgnore
	StoredProcedureQuery createNamedStoredProcedureQuery(String name);

	@GenIgnore
	StoredProcedureQuery createStoredProcedureQuery(String procedureName);

	@GenIgnore
	StoredProcedureQuery createStoredProcedureQuery(String procedureName, Class... resultClasses);

	@GenIgnore
	StoredProcedureQuery createStoredProcedureQuery(String procedureName, String... resultSetMappings);

	@Fluent
	EntityManager joinTransaction();

	@Fluent
	EntityManager isJoinedToTransaction(Handler<AsyncResult<Boolean>> resultHandler);

	@GenIgnore
	<T> T unwrap(Class<T> cls);

	@GenIgnore
	Object getDelegate();

	@Fluent
	EntityManager close();

	@Fluent
	EntityManager isOpen(Handler<AsyncResult<Boolean>> resultHandler);

	@Fluent
	EntityManager getTransaction(Handler<AsyncResult<EntityTransaction>> resultHandler);

	@Fluent
	EntityManager getEntityManagerFactory(Handler<AsyncResult<EntityManagerFactory>> resultHandler);

	@GenIgnore
	CriteriaBuilder getCriteriaBuilder();

	@GenIgnore
	Metamodel getMetamodel();

	@GenIgnore
	<T> EntityGraph<T> createEntityGraph(Class<T> rootType);

	@GenIgnore
	EntityGraph<?> createEntityGraph(String graphName);

	@GenIgnore
	EntityGraph<?> getEntityGraph(String graphName);

	@GenIgnore
	<T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> entityClass);
}