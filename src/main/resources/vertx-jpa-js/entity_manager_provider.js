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

/** @module vertx-jpa-js/entity_manager_provider */
var utils = require('vertx-js/util/utils');
var EntityManagerExt = require('vertx-jpa-js/entity_manager_ext');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JEntityManagerProvider = Java.type('io.vertx.ext.jpa.EntityManagerProvider');

/**
 An asynchronous client interface for interacting with a JDBC compliant
 database`using JPA

 @class
*/
var EntityManagerProvider = function(j_val) {

  var j_entityManagerProvider = j_val;
  var that = this;

  /**

   @public
   @param resultHandler {function} 
   @return {EntityManagerProvider}
   */
  this.getEntityManager = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_entityManagerProvider["getEntityManager(io.vertx.core.Handler)"](function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(EntityManagerExt, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_entityManagerProvider;
};

EntityManagerProvider._jclass = utils.getJavaClass("io.vertx.ext.jpa.EntityManagerProvider");
EntityManagerProvider._jtype = {
  accept: function(obj) {
    return EntityManagerProvider._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(EntityManagerProvider.prototype, {});
    EntityManagerProvider.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
EntityManagerProvider._create = function(jdel) {
  var obj = Object.create(EntityManagerProvider.prototype, {});
  EntityManagerProvider.apply(obj, arguments);
  return obj;
}
module.exports = EntityManagerProvider;