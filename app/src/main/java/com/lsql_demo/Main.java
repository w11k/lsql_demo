package com.lsql_demo;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lsql_demo.db.LSqlDbModule;
import com.w11k.lsql.LSql;
import com.w11k.lsql.dialects.PostgresConfig;
import com.w11k.lsql.jdbc.ConnectionProviders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/lsql_demo", "lsql_demo", "lsql_demo");
        connection.setAutoCommit(true);

        LSql lSql = new LSql(PostgresConfig.class, ConnectionProviders.fromInstance(connection));

        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(LSql.class).toInstance(lSql);

                install(new LSqlDbModule());
                bind(App.class).asEagerSingleton();
            }
        });

        App app = injector.getInstance(App.class);
        app.run();
    }

}
