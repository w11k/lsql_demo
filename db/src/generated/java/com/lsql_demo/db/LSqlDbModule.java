package com.lsql_demo.db;

public class LSqlDbModule implements com.google.inject.Module {

    @Override
    public void configure(com.google.inject.Binder binder) {
        binder.bind(com.lsql_demo.db.schema_public.Flyway_Schema_History_Table.class).in(com.google.inject.Scopes.SINGLETON);
        binder.bind(com.lsql_demo.db.schema_public.Person_Table.class).in(com.google.inject.Scopes.SINGLETON);
        binder.bind(com.lsql_demo.db.com.lsql_demo.PersonStmts.class).in(com.google.inject.Scopes.SINGLETON);
    }

}
