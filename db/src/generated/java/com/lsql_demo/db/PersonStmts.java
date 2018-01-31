package com.lsql_demo.db;

import com.lsql_demo.db.structural_fields.*;
import com.lsql_demo.db.personstmts.*;
import java.util.*;

public class PersonStmts {

    // Statement: loadPersonById ----------------------------

    private final String sql_loadPersonById = "SELECT * \n FROM person \n WHERE id = /*=*/ 1 /**/;";

    /**    
     * SELECT *<br>
     * FROM person<br>
     * WHERE id = &#42;&#47;=&#47;&#42; 1 &#42;&#47;&#47;&#42;;<br>
    */
    public loadPersonById loadPersonById() {
        return new loadPersonById();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class loadPersonById extends com.w11k.lsql.TypedStatementQuery<LoadPersonById> implements com.w11k.lsql.TableRow, Id_Number {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public loadPersonById() {
            super(lSql, sql_loadPersonById);
            this.id = null;
        }

        @SuppressWarnings("NullableProblems")
        private loadPersonById(
                java.lang.Number id) {
            super(lSql, sql_loadPersonById);
            this.id = id;
    }

        @SuppressWarnings("unused")
        public loadPersonById(java.util.Map<String, Object> from) {
            super(lSql, sql_loadPersonById);
            this.id = (java.lang.Number) from.get("id");
        }

        // fields ----------

        @javax.annotation.Nullable public final java.lang.Number id;

        @javax.annotation.Nullable public java.lang.Number getId() {
            return this.id;
        }

        public loadPersonById withId(@javax.annotation.Nullable java.lang.Number id) {
            return new loadPersonById(id);
        }

        // class methods ----------

        public java.util.Map<String, Object> toMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("id", this.id);
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            loadPersonById that = (loadPersonById) o;
            return     Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "loadPersonById{" + "id=" + id + "}";
        }

        protected LoadPersonById createTypedRow(com.w11k.lsql.Row row) {
            return new LoadPersonById(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toMap();
        }

        public String getStatementFileName() {
            return "PersonStmts.sql";
        }

        public String getStatementName() {
            return "loadPersonById";
        }

    }

    private final com.w11k.lsql.LSql lSql;

    @com.google.inject.Inject
    public PersonStmts(com.w11k.lsql.LSql lSql) {
        this.lSql = lSql;
    }

}
