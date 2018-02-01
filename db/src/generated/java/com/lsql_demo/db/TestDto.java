package com.lsql_demo.db;

import com.lsql_demo.db.structural_fields.*;
import java.util.*;

@SuppressWarnings({"Duplicates", "WeakerAccess"})
public final class TestDto implements com.w11k.lsql.TableRow, First_Name_String, Last_Name_String {

    // static methods ----------

    @SuppressWarnings("unchecked")
    public static <T extends 
            First_Name_String
            & Last_Name_String> TestDto from(T source) {
        Object target = new TestDto();
        target = ((First_Name_String) target).withFirstName(source.getFirstName());
        target = ((Last_Name_String) target).withLastName(source.getLastName());
        return (TestDto) target;
    }

    @SuppressWarnings("unused")
    public static TestDto fromInternalMap(java.util.Map<String, Object> internalMap) {
        return new TestDto((java.lang.String) internalMap.get("firstName"), (java.lang.String) internalMap.get("lastName"));
    }

    @SuppressWarnings("unused")
    public static TestDto fromMap(java.util.Map<String, Object> map) {
        return new TestDto((java.lang.String) map.get("firstName"), (java.lang.String) map.get("lastName"));
    }

    // constructors ----------

    @SuppressWarnings("ConstantConditions")
    public TestDto() {
        this.firstName = null;
        this.lastName = null;
    }

    @SuppressWarnings("NullableProblems")
    private TestDto(
            java.lang.String firstName,
            java.lang.String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // fields ----------

    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_FIRSTNAME = "firstName";

    @SuppressWarnings("unused")
    public static final String FIELD_FIRSTNAME = "firstName";

    @javax.annotation.Nullable public final java.lang.String firstName;

    @javax.annotation.Nullable public java.lang.String getFirstName() {
        return this.firstName;
    }

    public TestDto withFirstName(@javax.annotation.Nullable java.lang.String firstName) {
        return new TestDto(firstName,lastName);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_LASTNAME = "lastName";

    @SuppressWarnings("unused")
    public static final String FIELD_LASTNAME = "lastName";

    @javax.annotation.Nullable public final java.lang.String lastName;

    @javax.annotation.Nullable public java.lang.String getLastName() {
        return this.lastName;
    }

    public TestDto withLastName(@javax.annotation.Nullable java.lang.String lastName) {
        return new TestDto(firstName,lastName);
    }

    // class methods ----------

    @SuppressWarnings("unchecked")
    public <T extends 
            First_Name_String
            & Last_Name_String> T as(T targetStart) {
        Object target = targetStart;
        target = ((First_Name_String) target).withFirstName(this.getFirstName());
        target = ((Last_Name_String) target).withLastName(this.getLastName());
        return (T) target;
    }

    @SuppressWarnings("unchecked")
    public <T extends 
            First_Name_String
            & Last_Name_String> T as(Class<? extends T> targetClass) {
        try {
            Object target = targetClass.newInstance();
            return this.as((T) target);
        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public java.util.Map<String, Object> toInternalMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("firstName", this.firstName);
        map.put("lastName", this.lastName);
        return map;
    }

    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("firstName", this.firstName);
        map.put("lastName", this.lastName);
        return map;
    }

    // Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDto that = (TestDto) o;
        return     Objects.equals(firstName, that.firstName) && 
            Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "TestDto{" + "firstName=" + firstName
            + ", " + "lastName=" + lastName + "}";
    }

}
