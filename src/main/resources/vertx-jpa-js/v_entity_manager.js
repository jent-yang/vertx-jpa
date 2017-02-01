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

/** @module vertx-jpa-js/v_entity_manager */
var utils = require('vertx-js/util/utils');
var EntityTransaction = require('vertx-jpa-js/entity_transaction');
var StoredProcedureQuery = require('vertx-jpa-js/stored_procedure_query');
var Query = require('vertx-jpa-js/query');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JVEntityManager = Java.type('io.vertx.ext.jpa.VEntityManager');

/**
 @class
*/
var VEntityManager = function(j_val) {

  var j_vEntityManager = j_val;
  var that = this;

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {VEntityManager}
   */
  this.persist = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_vEntityManager["persist(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
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
   @return {VEntityManager}
   */
  this.merge = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_vEntityManager["merge(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
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
   @return {VEntityManager}
   */
  this.getTransaction = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["getTransaction(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.remove = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_vEntityManager["remove(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
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
   @return {VEntityManager}
   */
  this.find = function(classname, primaryKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] !== 'function' && typeof __args[2] === 'function') {
      j_vEntityManager["find(java.lang.String,java.lang.Object,io.vertx.core.Handler)"](classname, utils.convParamTypeUnknown(primaryKey), function(ar) {
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
   @return {VEntityManager}
   */
  this.getReference = function(classname, primaryKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] !== 'function' && typeof __args[2] === 'function') {
      j_vEntityManager["getReference(java.lang.String,java.lang.Object,io.vertx.core.Handler)"](classname, utils.convParamTypeUnknown(primaryKey), function(ar) {
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
      j_vEntityManager["flush(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.getFlushMode = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["getFlushMode(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.lock = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_vEntityManager["lock(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 4 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_vEntityManager["lock(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.json.JsonObject,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), utils.convParamJsonObject(__args[2]), function(ar) {
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
   @return {VEntityManager}
   */
  this.refresh = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_vEntityManager["refresh(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] !== 'function' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_vEntityManager["refresh(java.lang.Object,io.vertx.core.json.JsonObject,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), utils.convParamJsonObject(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_vEntityManager["refresh(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 4 && typeof __args[0] !== 'function' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_vEntityManager["refresh(java.lang.Object,javax.persistence.LockModeType,io.vertx.core.json.JsonObject,io.vertx.core.Handler)"](utils.convParamTypeUnknown(__args[0]), javax.persistence.LockModeType.valueOf(__args[1]), utils.convParamJsonObject(__args[2]), function(ar) {
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
   @return {VEntityManager}
   */
  this.clear = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["clear(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.detach = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_vEntityManager["detach(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
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
   @return {VEntityManager}
   */
  this.contains = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_vEntityManager["contains(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
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
   @return {VEntityManager}
   */
  this.getLockMode = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["getLockMode(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.getProperties = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["getProperties(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.createQuery = function(qlString, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_vEntityManager["createQuery(java.lang.String,io.vertx.core.Handler)"](qlString, function(ar) {
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
   @return {VEntityManager}
   */
  this.createNamedQuery = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_vEntityManager["createNamedQuery(java.lang.String,io.vertx.core.Handler)"](name, function(ar) {
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
   @return {VEntityManager}
   */
  this.createNativeQuery = function(sqlString, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_vEntityManager["createNativeQuery(java.lang.String,io.vertx.core.Handler)"](sqlString, function(ar) {
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
   @return {VEntityManager}
   */
  this.createNamedStoredProcedureQuery = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_vEntityManager["createNamedStoredProcedureQuery(java.lang.String,io.vertx.core.Handler)"](name, function(ar) {
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
   @return {VEntityManager}
   */
  this.isJoinedToTransaction = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["isJoinedToTransaction(io.vertx.core.Handler)"](function(ar) {
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
      j_vEntityManager["close(io.vertx.core.Handler)"](function(ar) {
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
   @return {VEntityManager}
   */
  this.isOpen = function(result) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_vEntityManager["isOpen(io.vertx.core.Handler)"](function(ar) {
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
  this._jdel = j_vEntityManager;
};

VEntityManager._jclass = utils.getJavaClass("io.vertx.ext.jpa.VEntityManager");
VEntityManager._jtype = {
  accept: function(obj) {
    return VEntityManager._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(VEntityManager.prototype, {});
    VEntityManager.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
VEntityManager._create = function(jdel) {
  var obj = Object.create(VEntityManager.prototype, {});
  VEntityManager.apply(obj, arguments);
  return obj;
}
module.exports = VEntityManager;