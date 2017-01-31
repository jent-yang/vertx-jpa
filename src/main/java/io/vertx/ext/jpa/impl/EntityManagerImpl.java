package io.vertx.ext.jpa.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jpa.CriteriaBuilder;
import io.vertx.ext.jpa.CriteriaDelete;
import io.vertx.ext.jpa.CriteriaQuery;
import io.vertx.ext.jpa.CriteriaUpdate;
import io.vertx.ext.jpa.EntityGraph;
import io.vertx.ext.jpa.EntityManager;
import io.vertx.ext.jpa.EntityTransaction;
import io.vertx.ext.jpa.Metamodel;
import io.vertx.ext.jpa.Query;
import io.vertx.ext.jpa.StoredProcedureQuery;
import io.vertx.ext.jpa.TypedQuery;

public class EntityManagerImpl implements EntityManager {

	private final javax.persistence.EntityManager _em;

	public EntityManagerImpl(javax.persistence.EntityManager em) {
		this._em = em;
	}

	@Override
	public EntityManager persist(Object entity, Handler<AsyncResult<Void>> handler) {

		try {

			_em.persist(entity);
			handler.handle(Future.<Void>succeededFuture());
		} catch (Throwable t) {

			handler.handle(Future.failedFuture(t));
		}
		return this;
	}

	@Override
	public EntityManager getTransaction(Handler<AsyncResult<EntityTransaction>> handler) {

		handler.handle(Future.<EntityTransaction>succeededFuture(EntityTransaction.create(_em.getTransaction())));
		return this;
	}

	@Override
	public <T> EntityManager merge(T entity, Handler<AsyncResult<T>> handler) {

		try {

			T t = _em.merge(entity);
			handler.handle(Future.succeededFuture(t));
		} catch (Throwable t) {

			handler.handle(Future.failedFuture(t));
		}
		return this;
	}

	@Override
	public EntityManager remove(Object entity, Handler<AsyncResult<Void>> handler) {

		try {

			_em.remove(entity);
			handler.handle(Future.<Void>succeededFuture());
		} catch (Throwable t) {

			handler.handle(Future.failedFuture(t));
		}
		return this;
	}

	@Override
	public <T> EntityManager find(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler) {
		try {

			T t =_em.find(entityClass, primaryKey);
			handler.handle(Future.succeededFuture(t));
		} catch (Throwable t) {

			handler.handle(Future.failedFuture(t));
		}
		return this;
	}

	@Override
	public EntityManager close() {
		//TODO throw exception
		_em.close();
		return this;
	}

	@Override
	public <T> EntityManager find(Class<T> entityClass, Object primaryKey, JsonObject properties, Handler<AsyncResult<T>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Handler<AsyncResult<T>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, JsonObject properties,
			Handler<AsyncResult<T>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager getReference(Class<T> entityClass, Object primaryKey, Handler<AsyncResult<T>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager flush() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager setFlushMode(FlushModeType flushMode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getFlushMode(Handler<AsyncResult<FlushModeType>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager lock(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager lock(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager refresh(Object entity, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager refresh(Object entity, JsonObject properties, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager refresh(Object entity, LockModeType lockMode, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager refresh(Object entity, LockModeType lockMode, JsonObject properties, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager clear(Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager detach(Object entity, Handler<AsyncResult<Void>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager contains(Object entity, Handler<AsyncResult<Boolean>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getLockMode(Handler<AsyncResult<LockModeType>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager setProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getProperties(Handler<AsyncResult<JsonObject>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createQuery(String qlString, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager createQuery(CriteriaQuery<T> criteriaQuery, Handler<AsyncResult<TypedQuery<T>>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createQuery(CriteriaUpdate updateQuery, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createQuery(CriteriaDelete deleteQuery, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager createQuery(String qlString, Class<T> resultClass, Handler<AsyncResult<TypedQuery<T>>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createNamedQuery(String name, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager createNamedQuery(String name, Class<T> resultClass, Handler<AsyncResult<TypedQuery<T>>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createNativeQuery(String sqlString, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createNativeQuery(String sqlString, Class<?> resultClass, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createNativeQuery(String sqlString, String resultSetMapping, Handler<AsyncResult<Query>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createNamedStoredProcedureQuery(String name, Handler<AsyncResult<StoredProcedureQuery>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createStoredProcedureQuery(String procedureName, Handler<AsyncResult<StoredProcedureQuery>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager joinTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager isJoinedToTransaction(Handler<AsyncResult<Boolean>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager isOpen(Handler<AsyncResult<Boolean>> result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManagerFactory getEntityManagerFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CriteriaBuilder getCriteriaBuilder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getMetamodel(Handler<AsyncResult<Metamodel>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager createEntityGraph(String graphName, Handler<AsyncResult<EntityGraph<?>>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getEntityGraph(String graphName, Handler<AsyncResult<EntityGraph<?>>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> EntityManager getEntityGraphs(Handler<AsyncResult<List<EntityGraph<T>>>> handler) {
		// TODO Auto-generated method stub
		return null;
	}
}
