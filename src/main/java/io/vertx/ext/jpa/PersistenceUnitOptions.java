package io.vertx.ext.jpa;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter=true)
public class PersistenceUnitOptions {
	
	private static final String EMPTY = "";
	public static final int DEFAULT_MAX_STATEMENTS_PER_CONNECTION = 0;
	public static final int DEFAULT_MAX_IDLE_TIME = 0;
	public static final int DEFAULT_INITIAL_POOL = 1;
	public static final int DEFAULT_MAX_POOL = 15;
	public static final int DEFAULT_MIN_POOL = 1;
	public static final int DEFAULT_EMBEDDED_PORT = 9092;
	public static final String DEFAULT_H2_DRIVER = "org.h2.Driver";
	public static final String DETAULT_URL = "jdbc:h2:file:C:\\aplic\\gateway\\database;";

	private String url;
	private String driverClass;
	private String username;
	private String password;
	private Integer embeddedPort;
	private Integer maxPool;
	private Integer minPool;
	private Integer initialPool;
	private Integer maxIdleTime;
	private Integer maxStatementsPerConnection;
	private Boolean showCommands;
	private Boolean testConnection;

	public PersistenceUnitOptions() {
		init();
	}

	public PersistenceUnitOptions(PersistenceUnitOptions other) {
		this();
		url = other.getUrl();
		driverClass = other.getDriverClass();
		username = other.getUsername();
		password = other.getPassword();
		embeddedPort = other.getEmbeddedPort();
		maxPool = other.getMaxPool();
		minPool = other.getMinPool();
		initialPool = other.getInitialPool();
		maxIdleTime = other.getMaxIdleTime();
		maxStatementsPerConnection = other.getMaxStatementsPerConnection();
		showCommands = other.getShowCommands();
		testConnection = other.getTestConnection();
	}

	public PersistenceUnitOptions(JsonObject json) {
		this();
		PersistenceUnitOptionsConverter.fromJson(json, this);
	}

	public String getDriverClass() {
		return driverClass;
	}

	public Integer getEmbeddedPort() {
		return embeddedPort;
	}

	public Integer getInitialPool() {
		return initialPool;
	}

	public Integer getMaxIdleTime() {
		return maxIdleTime;
	}

	public Integer getMaxPool() {
		return maxPool;
	}

	public Integer getMaxStatementsPerConnection() {
		return maxStatementsPerConnection;
	}

	public Integer getMinPool() {
		return minPool;
	}

	public String getPassword() {
		return password;
	}

	public Boolean getShowCommands() {
		return showCommands;
	}

	public Boolean getTestConnection() {
		return testConnection;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	private void init() {

		url = DETAULT_URL;
		driverClass = DEFAULT_H2_DRIVER;
		username = EMPTY;
		password = EMPTY;
		embeddedPort = DEFAULT_EMBEDDED_PORT;
		maxPool = DEFAULT_MAX_POOL;
		minPool = DEFAULT_MIN_POOL;
		initialPool = DEFAULT_INITIAL_POOL;
		maxIdleTime = DEFAULT_MAX_IDLE_TIME;
		maxStatementsPerConnection = DEFAULT_MAX_STATEMENTS_PER_CONNECTION;
		showCommands = false;
		testConnection = true;
	}

	public PersistenceUnitOptions setDriverClass(String driverClass) {
		this.driverClass = driverClass;
		return this;
	}

	public PersistenceUnitOptions setEmbeddedPort(Integer embeddedPort) {
		this.embeddedPort = embeddedPort;
		return this;
	}

	public PersistenceUnitOptions setInitialPool(Integer initialPool) {
		this.initialPool = initialPool;
		return this;
	}

	public PersistenceUnitOptions setMaxIdleTime(Integer maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
		return this;
	}

	public PersistenceUnitOptions setMaxPool(Integer maxPool) {
		this.maxPool = maxPool;
		return this;
	}

	public PersistenceUnitOptions setMaxStatementsPerConnection(Integer maxStatementsPerConnection) {
		this.maxStatementsPerConnection = maxStatementsPerConnection;
		return this;
	}

	public PersistenceUnitOptions setMinPool(Integer minPool) {
		this.minPool = minPool;
		return this;
	}

	public PersistenceUnitOptions setPassword(String password) {
		this.password = password;
		return this;
	}

	public PersistenceUnitOptions setShowCommands(Boolean showCommands) {
		this.showCommands = showCommands;
		return this;
	}

	public PersistenceUnitOptions setTestConnection(Boolean testConnection) {
		this.testConnection = testConnection;
		return this;
	}

	public PersistenceUnitOptions setUrl(String url) {
		this.url = url;
		return this;
	}

	public PersistenceUnitOptions setUsername(String username) {
		this.username = username;
		return this;
	}

}
