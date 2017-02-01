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

/** @module vertx-jpa-js/query */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JQuery = Java.type('io.vertx.ext.jpa.Query');

/**
 @class
*/
var Query = function(j_val) {

  var j_query = j_val;
  var that = this;

  /**

   @public
   @param handler {function} 
   @return {Query}
   */
  this.getResultList = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_query["getResultList(io.vertx.core.Handler)"](function(ar) {
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
   @param handler {function} 
   @return {Query}
   */
  this.getSingleResult = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_query["getSingleResult(io.vertx.core.Handler)"](function(ar) {
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
   @param handler {function} 
   @return {Query}
   */
  this.executeUpdate = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_query["executeUpdate(io.vertx.core.Handler)"](function(ar) {
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
   @param maxResult {number} 
   @return {Query}
   */
  this.setMaxResults = function(maxResult) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_query["setMaxResults(int)"](maxResult);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param startPosition {number} 
   @return {Query}
   */
  this.setFirstResult = function(startPosition) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_query["setFirstResult(int)"](startPosition);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param hintName {string} 
   @param value {Object} 
   @return {Query}
   */
  this.setHint = function(hintName, value) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      j_query["setHint(java.lang.String,java.lang.Object)"](hintName, utils.convParamTypeUnknown(value));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param position {number} 
   @param value {Object} 
   @return {Query}
   */
  this.setParameter = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      j_query["setParameter(java.lang.String,java.lang.Object)"](__args[0], utils.convParamTypeUnknown(__args[1]));
      return that;
    }  else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] !== 'function') {
      j_query["setParameter(int,java.lang.Object)"](__args[0], utils.convParamTypeUnknown(__args[1]));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param flushMode {Object} 
   @return {Query}
   */
  this.setFlushMode = function(flushMode) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_query["setFlushMode(io.vertx.ext.jpa.FlushModeType)"](io.vertx.ext.jpa.FlushModeType.valueOf(flushMode));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param lockMode {Object} 
   @return {Query}
   */
  this.setLockMode = function(lockMode) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_query["setLockMode(io.vertx.ext.jpa.LockModeType)"](io.vertx.ext.jpa.LockModeType.valueOf(lockMode));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_query;
};

Query._jclass = utils.getJavaClass("io.vertx.ext.jpa.Query");
Query._jtype = {
  accept: function(obj) {
    return Query._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Query.prototype, {});
    Query.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Query._create = function(jdel) {
  var obj = Object.create(Query.prototype, {});
  Query.apply(obj, arguments);
  return obj;
}
module.exports = Query;