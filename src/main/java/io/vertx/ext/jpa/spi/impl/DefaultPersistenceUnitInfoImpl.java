package io.vertx.ext.jpa.spi.impl;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import javax.persistence.SharedCacheMode;
import javax.persistence.ValidationMode;
import javax.persistence.spi.ClassTransformer;
import javax.persistence.spi.PersistenceUnitTransactionType;
import javax.sql.DataSource;

import io.vertx.ext.jpa.spi.SmartPersistanceUnitInfo;

public class DefaultPersistenceUnitInfoImpl implements SmartPersistanceUnitInfo {
	
	private final String persistenceUnitName;

	private String persistenceProviderClassName;

	private PersistenceUnitTransactionType transactionType;

	private DataSource nonJtaDataSource;

	private DataSource jtaDataSource;

	private final List<String> mappingFileNames = new LinkedList<>();

	private List<URL> jarFileUrls = new LinkedList<>();

	private URL persistenceUnitRootUrl;

	private final List<String> managedClassNames = new LinkedList<>();

	private final List<String> managedPackages = new LinkedList<>();

	private boolean excludeUnlistedClasses = false;

	private SharedCacheMode sharedCacheMode = SharedCacheMode.UNSPECIFIED;

	private ValidationMode validationMode = ValidationMode.AUTO;

	private Properties properties = new Properties();

	private String persistenceXMLSchemaVersion = "2.0";

	private String persistenceProviderPackageName;
	
	public DefaultPersistenceUnitInfoImpl(String persistenceUnitName) {
		this.persistenceUnitName = persistenceUnitName;
	}

	@Override
	public void addAnnotatedClassName(Class<?> clazz) {
		
		managedClassNames.add(clazz.getName());
	}

	@Override
	public void addAnnotatedClassName(String className) {

		managedClassNames.add(className);
	}

	public void addJarFileUrl(URL jarFileUrl) {
		jarFileUrls.add(jarFileUrl);
	}

	/**
	 * Add a managed class name to the persistence provider's metadata.
	 *
	 * @see javax.persistence.spi.PersistenceUnitInfo#getManagedClassNames()
	 * @see #addManagedPackage
	 *
	 * @param managedClassName
	 *            the managed class name
	 */
	public void addManagedClassName(String managedClassName) {
		managedClassNames.add(managedClassName);
	}

	/**
	 * Add a managed package to the persistence provider's metadata.
	 * <p>
	 * Note: This refers to annotated {@code package-info.java} files. It does
	 * <i>not</i> trigger entity scanning in the specified package; this is
	 * rather the job of
	 *
	 * @param packageName
	 *            the package name
	 */
	public void addManagedPackage(String packageName) {
		managedPackages.add(packageName);
	}

	public void addMappingFileName(String mappingFileName) {
		mappingFileNames.add(mappingFileName);
	}

	public void addProperty(String name, String value) {
		if (properties == null) {
			properties = new Properties();
		}
		properties.setProperty(name, value);
	}

	/**
	 * This implementation throws an UnsupportedOperationException.
	 */
	@Override
	public void addTransformer(ClassTransformer classTransformer) {
		throw new UnsupportedOperationException("addTransformer not supported");
	}

	@Override
	public boolean excludeUnlistedClasses() {
		return excludeUnlistedClasses;
	}

	@Override
	public ClassLoader getClassLoader() {
		return null;
	}

	/**
	 * This implementation throws an UnsupportedOperationException.
	 */
	@Override
	public ClassLoader getNewTempClassLoader() {
		return null;
	}

	@Override
	public PersistenceUnitTransactionType getTransactionType() {
		if (transactionType != null) {
			return transactionType;
		} else {
			return jtaDataSource != null ? PersistenceUnitTransactionType.JTA : PersistenceUnitTransactionType.RESOURCE_LOCAL;
		}
	}

	public String getPersistenceProviderClassName() {
		return persistenceProviderClassName;
	}

	public void setPersistenceProviderClassName(String persistenceProviderClassName) {
		this.persistenceProviderClassName = persistenceProviderClassName;
	}

	public DataSource getNonJtaDataSource() {
		return nonJtaDataSource;
	}

	public void setNonJtaDataSource(DataSource nonJtaDataSource) {
		this.nonJtaDataSource = nonJtaDataSource;
	}

	public DataSource getJtaDataSource() {
		return jtaDataSource;
	}

	public void setJtaDataSource(DataSource jtaDataSource) {
		this.jtaDataSource = jtaDataSource;
	}

	public List<URL> getJarFileUrls() {
		return jarFileUrls;
	}

	public void setJarFileUrls(List<URL> jarFileUrls) {
		this.jarFileUrls = jarFileUrls;
	}

	public URL getPersistenceUnitRootUrl() {
		return persistenceUnitRootUrl;
	}

	public void setPersistenceUnitRootUrl(URL persistenceUnitRootUrl) {
		this.persistenceUnitRootUrl = persistenceUnitRootUrl;
	}

	public boolean isExcludeUnlistedClasses() {
		return excludeUnlistedClasses;
	}

	public void setExcludeUnlistedClasses(boolean excludeUnlistedClasses) {
		this.excludeUnlistedClasses = excludeUnlistedClasses;
	}

	public SharedCacheMode getSharedCacheMode() {
		return sharedCacheMode;
	}

	public void setSharedCacheMode(SharedCacheMode sharedCacheMode) {
		this.sharedCacheMode = sharedCacheMode;
	}

	public ValidationMode getValidationMode() {
		return validationMode;
	}

	public void setValidationMode(ValidationMode validationMode) {
		this.validationMode = validationMode;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getPersistenceXMLSchemaVersion() {
		return persistenceXMLSchemaVersion;
	}

	public void setPersistenceXMLSchemaVersion(String persistenceXMLSchemaVersion) {
		this.persistenceXMLSchemaVersion = persistenceXMLSchemaVersion;
	}

	public String getPersistenceProviderPackageName() {
		return persistenceProviderPackageName;
	}

	public void setPersistenceProviderPackageName(String persistenceProviderPackageName) {
		this.persistenceProviderPackageName = persistenceProviderPackageName;
	}

	public String getPersistenceUnitName() {
		return persistenceUnitName;
	}

	public List<String> getMappingFileNames() {
		return mappingFileNames;
	}

	public List<String> getManagedClassNames() {
		return managedClassNames;
	}

	public List<String> getManagedPackages() {
		return managedPackages;
	}

	public void setTransactionType(PersistenceUnitTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "PersistenceUnitInfo: name '" + persistenceUnitName + "', root URL [" + persistenceUnitRootUrl + "]";
	}
}