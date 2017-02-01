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

/** @module vertx-jpa-js/entity_transaction */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JEntityTransaction = Java.type('io.vertx.ext.jpa.EntityTransaction');

/**
 @class
*/
var EntityTransaction = function(j_val) {

  var j_entityTransaction = j_val;
  var that = this;

  /**
   Start a resource transaction.

   @public

   */
  this.begin = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_entityTransaction["begin()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Commit the current resource transaction, writing any unflushed changes to
   the database.

   @public

   */
  this.commit = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_entityTransaction["commit()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Roll back the current resource transaction.

   @public

   */
  this.rollback = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_entityTransaction["rollback()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Mark the current resource transaction so that the only possible outcome of
   the transaction is for the transaction to be rolled back.

   @public

   */
  this.setRollbackOnly = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_entityTransaction["setRollbackOnly()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine whether the current resource transaction has been marked for
   rollback.

   @public

   @return {boolean} boolean indicating whether the transaction has been marked for rollback
   */
  this.getRollbackOnly = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_entityTransaction["getRollbackOnly()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Indicate whether a resource transaction is in progress.

   @public

   @return {boolean} boolean indicating whether transaction is in progress
   */
  this.isActive = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_entityTransaction["isActive()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_entityTransaction;
};

EntityTransaction._jclass = utils.getJavaClass("io.vertx.ext.jpa.EntityTransaction");
EntityTransaction._jtype = {
  accept: function(obj) {
    return EntityTransaction._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(EntityTransaction.prototype, {});
    EntityTransaction.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
EntityTransaction._create = function(jdel) {
  var obj = Object.create(EntityTransaction.prototype, {});
  EntityTransaction.apply(obj, arguments);
  return obj;
}
module.exports = EntityTransaction;