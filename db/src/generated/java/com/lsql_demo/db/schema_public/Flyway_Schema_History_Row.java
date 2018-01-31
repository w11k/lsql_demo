package com.lsql_demo.db.schema_public;

import com.lsql_demo.db.structural_fields.*;
import java.util.*;

@SuppressWarnings({"Duplicates", "WeakerAccess"})
public final class Flyway_Schema_History_Row implements com.w11k.lsql.TableRow, Execution_Time_Integer, Installed_On_Org_Joda_Time_Datetime, Installed_Rank_Integer, Success_Boolean, Checksum_Integer, Description_String, Installed_By_String, Type_String, Version_String, Script_String {

    // static methods ----------

    @SuppressWarnings("unchecked")
    public static <T extends 
            Execution_Time_Integer
            & Installed_On_Org_Joda_Time_Datetime
            & Installed_Rank_Integer
            & Success_Boolean
            & Checksum_Integer
            & Description_String
            & Installed_By_String
            & Type_String
            & Version_String
            & Script_String> Flyway_Schema_History_Row from(T source) {
        Object target = new Flyway_Schema_History_Row();
        target = ((Execution_Time_Integer) target).withExecutionTime(source.getExecutionTime());
        target = ((Installed_On_Org_Joda_Time_Datetime) target).withInstalledOn(source.getInstalledOn());
        target = ((Installed_Rank_Integer) target).withInstalledRank(source.getInstalledRank());
        target = ((Success_Boolean) target).withSuccess(source.isSuccess());
        target = ((Checksum_Integer) target).withChecksum(source.getChecksum());
        target = ((Description_String) target).withDescription(source.getDescription());
        target = ((Installed_By_String) target).withInstalledBy(source.getInstalledBy());
        target = ((Type_String) target).withType(source.getType());
        target = ((Version_String) target).withVersion(source.getVersion());
        target = ((Script_String) target).withScript(source.getScript());
        return (Flyway_Schema_History_Row) target;
    }

    // constructors ----------

    @SuppressWarnings("ConstantConditions")
    public Flyway_Schema_History_Row() {
        this.executionTime = null;
        this.installedOn = null;
        this.installedRank = null;
        this.success = null;
        this.checksum = null;
        this.description = null;
        this.installedBy = null;
        this.type = null;
        this.version = null;
        this.script = null;
    }

    @SuppressWarnings("NullableProblems")
    private Flyway_Schema_History_Row(
            java.lang.Integer executionTime,
            org.joda.time.DateTime installedOn,
            java.lang.Integer installedRank,
            java.lang.Boolean success,
            java.lang.Integer checksum,
            java.lang.String description,
            java.lang.String installedBy,
            java.lang.String type,
            java.lang.String version,
            java.lang.String script) {
        this.executionTime = executionTime;
        this.installedOn = installedOn;
        this.installedRank = installedRank;
        this.success = success;
        this.checksum = checksum;
        this.description = description;
        this.installedBy = installedBy;
        this.type = type;
        this.version = version;
        this.script = script;
    }

    @SuppressWarnings("unused")
    public Flyway_Schema_History_Row(java.util.Map<String, Object> from) {
        this.executionTime = (java.lang.Integer) from.get("executionTime");
        this.installedOn = (org.joda.time.DateTime) from.get("installedOn");
        this.installedRank = (java.lang.Integer) from.get("installedRank");
        this.success = (java.lang.Boolean) from.get("success");
        this.checksum = (java.lang.Integer) from.get("checksum");
        this.description = (java.lang.String) from.get("description");
        this.installedBy = (java.lang.String) from.get("installedBy");
        this.type = (java.lang.String) from.get("type");
        this.version = (java.lang.String) from.get("version");
        this.script = (java.lang.String) from.get("script");
    }

    // fields ----------

    @SuppressWarnings("unused")
    public static final String FIELD_executionTime = "executionTime";

    @javax.annotation.Nonnull public final java.lang.Integer executionTime;

    @javax.annotation.Nonnull public java.lang.Integer getExecutionTime() {
        return this.executionTime;
    }

    public Flyway_Schema_History_Row withExecutionTime(@javax.annotation.Nonnull java.lang.Integer executionTime) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_installedOn = "installedOn";

    @javax.annotation.Nonnull public final org.joda.time.DateTime installedOn;

    @javax.annotation.Nonnull public org.joda.time.DateTime getInstalledOn() {
        return this.installedOn;
    }

    public Flyway_Schema_History_Row withInstalledOn(@javax.annotation.Nonnull org.joda.time.DateTime installedOn) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_installedRank = "installedRank";

    @javax.annotation.Nonnull public final java.lang.Integer installedRank;

    @javax.annotation.Nonnull public java.lang.Integer getInstalledRank() {
        return this.installedRank;
    }

    public Flyway_Schema_History_Row withInstalledRank(@javax.annotation.Nonnull java.lang.Integer installedRank) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_success = "success";

    @javax.annotation.Nonnull public final java.lang.Boolean success;

    @javax.annotation.Nonnull public java.lang.Boolean isSuccess() {
        return this.success;
    }

    public Flyway_Schema_History_Row withSuccess(@javax.annotation.Nonnull java.lang.Boolean success) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_checksum = "checksum";

    @javax.annotation.Nullable public final java.lang.Integer checksum;

    @javax.annotation.Nullable public java.lang.Integer getChecksum() {
        return this.checksum;
    }

    public Flyway_Schema_History_Row withChecksum(@javax.annotation.Nullable java.lang.Integer checksum) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_description = "description";

    @javax.annotation.Nonnull public final java.lang.String description;

    @javax.annotation.Nonnull public java.lang.String getDescription() {
        return this.description;
    }

    public Flyway_Schema_History_Row withDescription(@javax.annotation.Nonnull java.lang.String description) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_installedBy = "installedBy";

    @javax.annotation.Nonnull public final java.lang.String installedBy;

    @javax.annotation.Nonnull public java.lang.String getInstalledBy() {
        return this.installedBy;
    }

    public Flyway_Schema_History_Row withInstalledBy(@javax.annotation.Nonnull java.lang.String installedBy) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_type = "type";

    @javax.annotation.Nonnull public final java.lang.String type;

    @javax.annotation.Nonnull public java.lang.String getType() {
        return this.type;
    }

    public Flyway_Schema_History_Row withType(@javax.annotation.Nonnull java.lang.String type) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_version = "version";

    @javax.annotation.Nullable public final java.lang.String version;

    @javax.annotation.Nullable public java.lang.String getVersion() {
        return this.version;
    }

    public Flyway_Schema_History_Row withVersion(@javax.annotation.Nullable java.lang.String version) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_script = "script";

    @javax.annotation.Nonnull public final java.lang.String script;

    @javax.annotation.Nonnull public java.lang.String getScript() {
        return this.script;
    }

    public Flyway_Schema_History_Row withScript(@javax.annotation.Nonnull java.lang.String script) {
        return new Flyway_Schema_History_Row(executionTime,installedOn,installedRank,success,checksum,description,installedBy,type,version,script);
    }

    // class methods ----------

    @SuppressWarnings("unchecked")
    public <T extends 
            Execution_Time_Integer
            & Installed_On_Org_Joda_Time_Datetime
            & Installed_Rank_Integer
            & Success_Boolean
            & Checksum_Integer
            & Description_String
            & Installed_By_String
            & Type_String
            & Version_String
            & Script_String> T as(T targetStart) {
        Object target = targetStart;
        target = ((Execution_Time_Integer) target).withExecutionTime(this.getExecutionTime());
        target = ((Installed_On_Org_Joda_Time_Datetime) target).withInstalledOn(this.getInstalledOn());
        target = ((Installed_Rank_Integer) target).withInstalledRank(this.getInstalledRank());
        target = ((Success_Boolean) target).withSuccess(this.isSuccess());
        target = ((Checksum_Integer) target).withChecksum(this.getChecksum());
        target = ((Description_String) target).withDescription(this.getDescription());
        target = ((Installed_By_String) target).withInstalledBy(this.getInstalledBy());
        target = ((Type_String) target).withType(this.getType());
        target = ((Version_String) target).withVersion(this.getVersion());
        target = ((Script_String) target).withScript(this.getScript());
        return (T) target;
    }

    @SuppressWarnings("unchecked")
    public <T extends 
            Execution_Time_Integer
            & Installed_On_Org_Joda_Time_Datetime
            & Installed_Rank_Integer
            & Success_Boolean
            & Checksum_Integer
            & Description_String
            & Installed_By_String
            & Type_String
            & Version_String
            & Script_String> T as(Class<? extends T> targetClass) {
        try {
            Object target = targetClass.newInstance();
            return this.as((T) target);
        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("executionTime", this.executionTime);
        map.put("installedOn", this.installedOn);
        map.put("installedRank", this.installedRank);
        map.put("success", this.success);
        map.put("checksum", this.checksum);
        map.put("description", this.description);
        map.put("installedBy", this.installedBy);
        map.put("type", this.type);
        map.put("version", this.version);
        map.put("script", this.script);
        return map;
    }

    // Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flyway_Schema_History_Row that = (Flyway_Schema_History_Row) o;
        return     Objects.equals(executionTime, that.executionTime) && 
            Objects.equals(installedOn, that.installedOn) && 
            Objects.equals(installedRank, that.installedRank) && 
            Objects.equals(success, that.success) && 
            Objects.equals(checksum, that.checksum) && 
            Objects.equals(description, that.description) && 
            Objects.equals(installedBy, that.installedBy) && 
            Objects.equals(type, that.type) && 
            Objects.equals(version, that.version) && 
            Objects.equals(script, that.script);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionTime, installedOn, installedRank, success, checksum, description, installedBy, type, version, script);
    }

    @Override
    public String toString() {
        return "Flyway_Schema_History_Row{" + "executionTime=" + executionTime
            + ", " + "installedOn=" + installedOn
            + ", " + "installedRank=" + installedRank
            + ", " + "success=" + success
            + ", " + "checksum=" + checksum
            + ", " + "description=" + description
            + ", " + "installedBy=" + installedBy
            + ", " + "type=" + type
            + ", " + "version=" + version
            + ", " + "script=" + script + "}";
    }

}
