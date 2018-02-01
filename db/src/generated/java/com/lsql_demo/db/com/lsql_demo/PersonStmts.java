package com.lsql_demo.db.com.lsql_demo;

import com.lsql_demo.db.structural_fields.*;
import com.lsql_demo.db.com.lsql_demo.personstmts.*;
import java.util.*;

public class PersonStmts {

    // Statement: loadAverageAgeByLastName ----------------------------

    private final String sql_loadAverageAgeByLastName = "SELECT \n   last_name, \n   avg(age) AS age /*: integer*/ \n FROM person \n   WHERE last_name = /*=*/ 'Power' /**/ \n GROUP BY last_name;";

    /**    
     * SELECT<br>
     *   last_name,<br>
     *   avg(age) AS age &#42;&#47;: integer&#47;&#42;<br>
     * FROM person<br>
     *   WHERE last_name = &#42;&#47;=&#47;&#42; 'Power' &#42;&#47;&#47;&#42;<br>
     * GROUP BY last_name;<br>
    */
    public loadAverageAgeByLastName loadAverageAgeByLastName() {
        return new loadAverageAgeByLastName();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class loadAverageAgeByLastName extends com.w11k.lsql.TypedStatementQuery<LoadAverageAgeByLastName> implements com.w11k.lsql.TableRow, Last_Name_String {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public loadAverageAgeByLastName() {
            super(lSql, sql_loadAverageAgeByLastName);
            this.lastName = null;
        }

        @SuppressWarnings("NullableProblems")
        private loadAverageAgeByLastName(
                java.lang.String lastName) {
            super(lSql, sql_loadAverageAgeByLastName);
            this.lastName = lastName;
    }

        // fields ----------

        @javax.annotation.Nullable public final java.lang.String lastName;

        @javax.annotation.Nullable public java.lang.String getLastName() {
            return this.lastName;
        }

        public loadAverageAgeByLastName withLastName(@javax.annotation.Nullable java.lang.String lastName) {
            return new loadAverageAgeByLastName(lastName);
        }

        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("last_name", this.lastName);
            return map;
        }

        public java.util.Map<String, Object> toMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("lastName", this.lastName);
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            loadAverageAgeByLastName that = (loadAverageAgeByLastName) o;
            return     Objects.equals(lastName, that.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(lastName);
        }

        @Override
        public String toString() {
            return "loadAverageAgeByLastName{" + "lastName=" + lastName + "}";
        }

        protected LoadAverageAgeByLastName createTypedRow(com.w11k.lsql.Row row) {
            return LoadAverageAgeByLastName.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "PersonStmts.sql";
        }

        public String getStatementName() {
            return "loadAverageAgeByLastName";
        }

    }

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

        // fields ----------

        @javax.annotation.Nullable public final java.lang.Number id;

        @javax.annotation.Nullable public java.lang.Number getId() {
            return this.id;
        }

        public loadPersonById withId(@javax.annotation.Nullable java.lang.Number id) {
            return new loadPersonById(id);
        }

        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("id", this.id);
            return map;
        }

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
            return LoadPersonById.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
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
