package com.lsql_demo.db.schema_public;

public class Person_Table extends com.w11k.lsql.TypedTable<Person_Row, java.lang.Integer>  {

    @com.google.inject.Inject
    public Person_Table(com.w11k.lsql.LSql lSql) {
        super(lSql, "person", Person_Row.class);
    }

    public static final String NAME = "person";

}
