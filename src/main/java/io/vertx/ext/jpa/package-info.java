/*
 * Copyright (c) 2011-2014 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
/**
 * = Vert.x JPA
 *
 * This client allows you to interact with any JDBC compliant database using an asynchronous API from your Vert.x
 * application.
 *
 * The client API is represented with the interface {@link io.vertx.ext.jpa.EntityManagerProvider}.
 *
 * To use this project, add the following dependency to the _dependencies_ section of your build descriptor:
 *
 * * Maven (in your `pom.xml`):
 *
 * [source,xml,subs="+attributes"]
 * ----
 * <dependency>
 *   <groupId>${maven.groupId}</groupId>
 *   <artifactId>${maven.artifactId}</artifactId>
 *   <version>${maven.version}</version>
 * </dependency>
 * ----
 *
 * * Gradle (in your `build.gradle` file):
 *
 * [source,groovy,subs="+attributes"]
 * ----
 * compile '${maven.groupId}:${maven.artifactId}:${maven.version}'
 * ----
 *
 * == Use as OSGi bundle
 *
 * Vert.x JPA client can be used as an OSGi bundle. However notice that you would need to deploy all dependencies
 * first. Some connection pool requires the JPA driver to be loaded from the classpath, and so cannot be packaged /
 * deployed as bundle.
 */
@Document(fileName = "index.adoc")
@ModuleGen(name = "vertx-jpa", groupPackage = "io.vertx")
package io.vertx.ext.jpa;

import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.docgen.Document;
