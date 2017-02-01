/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/** @module vertx-jpa-js/entity_manager_ext */
var utils = require('vertx-js/util/utils');
var EntityTransaction = require('vertx-jpa-js/entity_transaction');
var StoredProcedureQuery = require('vertx-jpa-js/stored_procedure_query');
var Query = require('vertx-jpa-js/query');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JEntityManagerExt = Java.type('io.vertx.ext.jpa.EntityManagerExt');

/**
 @class
*/
var EntityManagerExt = function(j_val) {

  var j_entityManagerExt = j_val;
  var that = this;

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.persist = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManagerExt["persist(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.merge = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManagerExt["merge(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.getTransaction = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["getTransaction(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(EntityTransaction, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.remove = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManagerExt["remove(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param classname {string} 
   @param primaryKey {Object} 
   @param resultHandler {function} 
   @return {EntityManagerExt}
   */
  this.find = function(classname, primaryKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] !== 'function' && typeof __args[2] === 'function') {
      j_entityManagerExt["find(java.lang.String,java.lang.Object,io.vertx.core.Handler)"](classname, utils.convParamTypeUnknown(primaryKey), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param classname {string} 
   @param primaryKey {Object} 
   @param resultHandler {function} 
   @return {EntityManagerExt}
   */
  this.getReference = function(classname, primaryKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] !== 'function' && typeof __args[2] === 'function') {
      j_entityManagerExt["getReference(java.lang.String,java.lang.Object,io.vertx.core.Handler)"](classname, utils.convParamTypeUnknown(primaryKey), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param completionHandler {function} 
   */
  this.flush = function(completionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["flush(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        completionHandler(null, null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.getFlushMode = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["getFlushMode(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnEnum(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param entity {Object} 
   @param lockMode {Object} 
   @param properties {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.lock = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_entityManagerExt["lock(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 4 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_entityManagerExt["lock(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.json.JsonObject,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), utils.convParamJsonObject(__args[2]), function(ar) {
      if (ar.succeeded()) {
        __args[3](null, null);
      } else {
        __args[3](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param entity {Object} 
   @param lockMode {Object} 
   @param properties {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.refresh = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManagerExt["refresh(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] !== 'function' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_entityManagerExt["refresh(java.lang.Object,io.vertx.core.json.JsonObject,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), utils.convParamJsonObject(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_entityManagerExt["refresh(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 4 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_entityManagerExt["refresh(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.json.JsonObject,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), utils.convParamJsonObject(__args[2]), function(ar) {
      if (ar.succeeded()) {
        __args[3](null, null);
      } else {
        __args[3](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.clear = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["clear(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.detach = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManagerExt["detach(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.contains = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManagerExt["contains(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.getLockMode = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["getLockMode(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnEnum(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.getProperties = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["getProperties(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param qlString {string} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.createQuery = function(qlString, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_entityManagerExt["createQuery(java.lang.String,io.vertx.core.Handler)"](qlString, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(Query, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param name {string} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.createNamedQuery = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_entityManagerExt["createNamedQuery(java.lang.String,io.vertx.core.Handler)"](name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(Query, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param sqlString {string} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.createNativeQuery = function(sqlString, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_entityManagerExt["createNativeQuery(java.lang.String,io.vertx.core.Handler)"](sqlString, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(Query, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param name {string} 
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.createNamedStoredProcedureQuery = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_entityManagerExt["createNamedStoredProcedureQuery(java.lang.String,io.vertx.core.Handler)"](name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(StoredProcedureQuery, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {EntityManagerExt}
   */
  this.isJoinedToTransaction = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["isJoinedToTransaction(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param completionHandler {function} 
   */
  this.close = function(completionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["close(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        completionHandler(null, null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param result {function} 
   @return {EntityManagerExt}
   */
  this.isOpen = function(result) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerExt["isOpen(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        result(ar.result(), null);
      } else {
        result(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_entityManagerExt;
};

EntityManagerExt._jclass = utils.getJavaClass("io.vertx.ext.jpa.EntityManagerExt");
EntityManagerExt._jtype = {
  accept: function(obj) {
    return EntityManagerExt._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(EntityManagerExt.prototype, {});
    EntityManagerExt.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
EntityManagerExt._create = function(jdel) {
  var obj = Object.create(EntityManagerExt.prototype, {});
  EntityManagerExt.apply(obj, arguments);
  return obj;
}
module.exports = EntityManagerExt;