package io.vertx.ext.jpa.spi.impl;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import io.vertx.ext.jpa.PersistenceUnitOptions;
import io.vertx.ext.jpa.spi.EntityManagerProvider;

public class HibernateEntityManagerProvider implements EntityManagerProvider {
	
	private EntityManagerFactory entityManagerFactory;
	
	private PersistenceUnitOptions options;

	protected Properties createProperties() {

		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.url", options.getUrl());
		properties.setProperty("hibernate.connection.driver_class", options.getDriverClass());
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", HibernateDialectProvider.dialectFromUrl(options.getUrl()));
		properties.setProperty("hibernate.show_sql", String.valueOf(options.getShowCommands()));
		properties.setProperty("hibernate.connection.username", options.getUsername());
		properties.setProperty("hibernate.connection.password", options.getPassword());
		properties.setProperty("hibernate.c3p0.max_size", String.valueOf(options.getMaxPool()));
		properties.setProperty("hibernate.c3p0.min_size", String.valueOf(options.getMinPool()));
		properties.setProperty("hibernate.c3p0.max_statements", String.valueOf(options.getMaxStatementsPerConnection()));
		properties.setProperty("hibernate.c3p0.idle_test_period", String.valueOf(options.getMaxIdleTime()));
		properties.setProperty("hibernate.c3p0.testConnectionOnCheckout", String.valueOf(options.getTestConnection()));
		properties.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
		return properties;
	}

}
