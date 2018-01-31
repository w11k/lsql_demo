package com.lsql_demo;

import com.lsql_demo.db.PersonStmts;
import com.lsql_demo.db.personstmts.LoadPersonById;
import com.lsql_demo.db.schema_public.Person_Row;
import com.lsql_demo.db.schema_public.Person_Table;
import com.w11k.lsql.LSql;
import com.w11k.lsql.dialects.PostgresConfig;
import com.w11k.lsql.jdbc.ConnectionProviders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public final class App {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lsql_demo", "lsql_demo", "lsql_demo");
        connection.setAutoCommit(true);
        LSql lSql = new LSql(PostgresConfig.class, ConnectionProviders.fromInstance(connection));

        Person_Table personTable = new Person_Table(lSql);

        personTable.insert(new Person_Row()
                .withFirstName("Foo")
                .withLastName("Bar"));

        PersonStmts personStmts = new PersonStmts(lSql);
        List<LoadPersonById> loadPersonById = personStmts.loadPersonById()
                .withId(1)
                .toList();

        System.out.println("loadPersonById = " + loadPersonById);
    }

}
