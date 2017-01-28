package io.vertx.kotlin.ext.jpa

import io.vertx.ext.jpa.PersistenceUnitOptions

fun PersistenceUnitOptions(
  driverClass: String? = null,
  embeddedPort: Int? = null,
  initialPool: Int? = null,
  maxIdleTime: Int? = null,
  maxPool: Int? = null,
  maxStatementsPerConnection: Int? = null,
  minPool: Int? = null,
  password: String? = null,
  showCommands: Boolean? = null,
  testConnection: Boolean? = null,
  url: String? = null,
  username: String? = null): PersistenceUnitOptions = io.vertx.ext.jpa.PersistenceUnitOptions().apply {

  if (driverClass != null) {
    this.setDriverClass(driverClass)
  }
  if (embeddedPort != null) {
    this.setEmbeddedPort(embeddedPort)
  }
  if (initialPool != null) {
    this.setInitialPool(initialPool)
  }
  if (maxIdleTime != null) {
    this.setMaxIdleTime(maxIdleTime)
  }
  if (maxPool != null) {
    this.setMaxPool(maxPool)
  }
  if (maxStatementsPerConnection != null) {
    this.setMaxStatementsPerConnection(maxStatementsPerConnection)
  }
  if (minPool != null) {
    this.setMinPool(minPool)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (showCommands != null) {
    this.setShowCommands(showCommands)
  }
  if (testConnection != null) {
    this.setTestConnection(testConnection)
  }
  if (url != null) {
    this.setUrl(url)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

