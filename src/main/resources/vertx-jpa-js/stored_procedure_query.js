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

/** @module vertx-jpa-js/stored_procedure_query */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JStoredProcedureQuery = Java.type('io.vertx.ext.jpa.StoredProcedureQuery');

/**
 @class
*/
var StoredProcedureQuery = function(j_val) {

  var j_storedProcedureQuery = j_val;
  var that = this;

  /**

   @public
   @param hintName {string} 
   @param value {Object} 
   @return {StoredProcedureQuery}
   */
  this.setHint = function(hintName, value) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      j_storedProcedureQuery["setHint(java.lang.String,java.lang.Object)"](hintName, utils.convParamTypeUnknown(value));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param position {number} 
   @param value {Object} 
   @return {StoredProcedureQuery}
   */
  this.setParameter = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      j_storedProcedureQuery["setParameter(java.lang.String,java.lang.Object)"](__args[0], utils.convParamTypeUnknown(__args[1]));
      return that;
    }  else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] !== 'function') {
      j_storedProcedureQuery["setParameter(int,java.lang.Object)"](__args[0], utils.convParamTypeUnknown(__args[1]));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param flushMode {Object} 
   @return {StoredProcedureQuery}
   */
  this.setFlushMode = function(flushMode) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_storedProcedureQuery["setFlushMode(io.vertx.ext.jpa.FlushModeType)"](io.vertx.ext.jpa.FlushModeType.valueOf(flushMode));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param completionHandler {function} 
   @return {StoredProcedureQuery}
   */
  this.execute = function(completionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_storedProcedureQuery["execute(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        completionHandler(ar.result(), null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   */
  this.hasMoreResults = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_storedProcedureQuery["hasMoreResults(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   */
  this.getUpdateCount = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_storedProcedureQuery["getUpdateCount(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_storedProcedureQuery;
};

StoredProcedureQuery._jclass = utils.getJavaClass("io.vertx.ext.jpa.StoredProcedureQuery");
StoredProcedureQuery._jtype = {
  accept: function(obj) {
    return StoredProcedureQuery._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(StoredProcedureQuery.prototype, {});
    StoredProcedureQuery.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
StoredProcedureQuery._create = function(jdel) {
  var obj = Object.create(StoredProcedureQuery.prototype, {});
  StoredProcedureQuery.apply(obj, arguments);
  return obj;
}
module.exports = StoredProcedureQuery;