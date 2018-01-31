package com.lsql_demo.db.schema_public;

public class Flyway_Schema_History_Table extends com.w11k.lsql.TypedTable<Flyway_Schema_History_Row, java.lang.Integer>  {

    @com.google.inject.Inject
    public Flyway_Schema_History_Table(com.w11k.lsql.LSql lSql) {
        super(lSql, "flywaySchemaHistory", Flyway_Schema_History_Row.class);
    }

    public static final String NAME = "flywaySchemaHistory";

}
