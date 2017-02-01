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
package io.vertx.ext.jpa.spi.impl;

public class HibernateDialectProvider {

  public static String dialectFromUrl(String url) {

    if (url.startsWith("jdbc:h2")) {
      return "org.hibernate.dialect.H2Dialect";
    } else if (url.startsWith("jdbc:oracle")) {
      return "org.hibernate.dialect.Oracle12cDialect";
    } else if (url.startsWith("jdbc:mysql")) {
      return "org.hibernate.dialect.MySQLDialect";
    } else if (url.startsWith("jdbc:mariadb")) {
      return "org.hibernate.dialect.MySQLDialect";
    } else if (url.startsWith("jdbc:postgresql")) {
      return "org.hibernate.dialect.PostgreSQLDialect";
    }
    return "";
  }
}