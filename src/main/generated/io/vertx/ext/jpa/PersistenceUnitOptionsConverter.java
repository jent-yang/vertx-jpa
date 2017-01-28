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

package io.vertx.ext.jpa;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.jpa.PersistenceUnitOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.jpa.PersistenceUnitOptions} original class using Vert.x codegen.
 */
public class PersistenceUnitOptionsConverter {

  public static void fromJson(JsonObject json, PersistenceUnitOptions obj) {
    if (json.getValue("driverClass") instanceof String) {
      obj.setDriverClass((String)json.getValue("driverClass"));
    }
    if (json.getValue("embeddedPort") instanceof Number) {
      obj.setEmbeddedPort(((Number)json.getValue("embeddedPort")).intValue());
    }
    if (json.getValue("initialPool") instanceof Number) {
      obj.setInitialPool(((Number)json.getValue("initialPool")).intValue());
    }
    if (json.getValue("maxIdleTime") instanceof Number) {
      obj.setMaxIdleTime(((Number)json.getValue("maxIdleTime")).intValue());
    }
    if (json.getValue("maxPool") instanceof Number) {
      obj.setMaxPool(((Number)json.getValue("maxPool")).intValue());
    }
    if (json.getValue("maxStatementsPerConnection") instanceof Number) {
      obj.setMaxStatementsPerConnection(((Number)json.getValue("maxStatementsPerConnection")).intValue());
    }
    if (json.getValue("minPool") instanceof Number) {
      obj.setMinPool(((Number)json.getValue("minPool")).intValue());
    }
    if (json.getValue("password") instanceof String) {
      obj.setPassword((String)json.getValue("password"));
    }
    if (json.getValue("showCommands") instanceof Boolean) {
      obj.setShowCommands((Boolean)json.getValue("showCommands"));
    }
    if (json.getValue("testConnection") instanceof Boolean) {
      obj.setTestConnection((Boolean)json.getValue("testConnection"));
    }
    if (json.getValue("url") instanceof String) {
      obj.setUrl((String)json.getValue("url"));
    }
    if (json.getValue("username") instanceof String) {
      obj.setUsername((String)json.getValue("username"));
    }
  }

  public static void toJson(PersistenceUnitOptions obj, JsonObject json) {
    if (obj.getDriverClass() != null) {
      json.put("driverClass", obj.getDriverClass());
    }
    if (obj.getEmbeddedPort() != null) {
      json.put("embeddedPort", obj.getEmbeddedPort());
    }
    if (obj.getInitialPool() != null) {
      json.put("initialPool", obj.getInitialPool());
    }
    if (obj.getMaxIdleTime() != null) {
      json.put("maxIdleTime", obj.getMaxIdleTime());
    }
    if (obj.getMaxPool() != null) {
      json.put("maxPool", obj.getMaxPool());
    }
    if (obj.getMaxStatementsPerConnection() != null) {
      json.put("maxStatementsPerConnection", obj.getMaxStatementsPerConnection());
    }
    if (obj.getMinPool() != null) {
      json.put("minPool", obj.getMinPool());
    }
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    if (obj.getShowCommands() != null) {
      json.put("showCommands", obj.getShowCommands());
    }
    if (obj.getTestConnection() != null) {
      json.put("testConnection", obj.getTestConnection());
    }
    if (obj.getUrl() != null) {
      json.put("url", obj.getUrl());
    }
    if (obj.getUsername() != null) {
      json.put("username", obj.getUsername());
    }
  }
}