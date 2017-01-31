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

/** @module vertx-jpa-js/entity_manager */
var utils = require('vertx-js/util/utils');
var EntityTransaction = require('vertx-jpa-js/entity_transaction');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JEntityManager = Java.type('io.vertx.ext.jpa.EntityManager');

/**
 @class
*/
var EntityManager = function(j_val) {

  var j_entityManager = j_val;
  var that = this;

  /**

   @public
   @param entity {Object} 
   @param handler {function} 
   @return {EntityManager}
   */
  this.persist = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManager["persist(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
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
   @return {EntityManager}
   */
  this.merge = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManager["merge(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnTypeUnknown(ar.result()), null);
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
   @return {EntityManager}
   */
  this.getTransaction = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManager["getTransaction(io.vertx.core.Handler)"](function(ar) {
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
   @return {EntityManager}
   */
  this.remove = function(entity, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_entityManager["remove(java.lang.Object,io.vertx.core.Handler)"](utils.convParamTypeUnknown(entity), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_entityManager;
};

EntityManager._jclass = utils.getJavaClass("io.vertx.ext.jpa.EntityManager");
EntityManager._jtype = {
  accept: function(obj) {
    return EntityManager._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(EntityManager.prototype, {});
    EntityManager.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
EntityManager._create = function(jdel) {
  var obj = Object.create(EntityManager.prototype, {});
  EntityManager.apply(obj, arguments);
  return obj;
}
module.exports = EntityManager;