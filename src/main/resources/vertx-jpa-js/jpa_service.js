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

/** @module vertx-jpa-js/jpa_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JJpaService = Java.type('io.vertx.ext.jpa.JpaService');

/**
 An asynchronous client interface for interacting with a JDBC compliant database`using JPA

 @class
*/
var JpaService = function(j_val) {

  var j_jpaService = j_val;
  var that = this;

  /**

   @public

   @return {JpaService}
   */
  this.getEntityManager = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jpaService["getEntityManager()"]();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jpaService;
};

JpaService._jclass = utils.getJavaClass("io.vertx.ext.jpa.JpaService");
JpaService._jtype = {
  accept: function(obj) {
    return JpaService._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JpaService.prototype, {});
    JpaService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JpaService._create = function(jdel) {
  var obj = Object.create(JpaService.prototype, {});
  JpaService.apply(obj, arguments);
  return obj;
}
module.exports = JpaService;