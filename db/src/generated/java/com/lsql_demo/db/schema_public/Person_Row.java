package com.lsql_demo.db.schema_public;

import com.lsql_demo.db.structural_fields.*;
import java.util.*;

@SuppressWarnings({"Duplicates", "WeakerAccess"})
public final class Person_Row implements com.w11k.lsql.TableRow, First_Name_String, Last_Name_String, Id_Integer {

    // static methods ----------

    @SuppressWarnings("unchecked")
    public static <T extends 
            First_Name_String
            & Last_Name_String
            & Id_Integer> Person_Row from(T source) {
        Object target = new Person_Row();
        target = ((First_Name_String) target).withFirstName(source.getFirstName());
        target = ((Last_Name_String) target).withLastName(source.getLastName());
        target = ((Id_Integer) target).withId(source.getId());
        return (Person_Row) target;
    }

    // constructors ----------

    @SuppressWarnings("ConstantConditions")
    public Person_Row() {
        this.firstName = null;
        this.lastName = null;
        this.id = null;
    }

    @SuppressWarnings("NullableProblems")
    private Person_Row(
            java.lang.String firstName,
            java.lang.String lastName,
            java.lang.Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @SuppressWarnings("unused")
    public Person_Row(java.util.Map<String, Object> from) {
        this.firstName = (java.lang.String) from.get("firstName");
        this.lastName = (java.lang.String) from.get("lastName");
        this.id = (java.lang.Integer) from.get("id");
    }

    // fields ----------

    @SuppressWarnings("unused")
    public static final String FIELD_firstName = "firstName";

    @javax.annotation.Nonnull public final java.lang.String firstName;

    @javax.annotation.Nonnull public java.lang.String getFirstName() {
        return this.firstName;
    }

    public Person_Row withFirstName(@javax.annotation.Nonnull java.lang.String firstName) {
        return new Person_Row(firstName,lastName,id);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_lastName = "lastName";

    @javax.annotation.Nonnull public final java.lang.String lastName;

    @javax.annotation.Nonnull public java.lang.String getLastName() {
        return this.lastName;
    }

    public Person_Row withLastName(@javax.annotation.Nonnull java.lang.String lastName) {
        return new Person_Row(firstName,lastName,id);
    }
    @SuppressWarnings("unused")
    public static final String FIELD_id = "id";

    @javax.annotation.Nonnull public final java.lang.Integer id;

    @javax.annotation.Nonnull public java.lang.Integer getId() {
        return this.id;
    }

    public Person_Row withId(@javax.annotation.Nonnull java.lang.Integer id) {
        return new Person_Row(firstName,lastName,id);
    }

    // class methods ----------

    @SuppressWarnings("unchecked")
    public <T extends 
            First_Name_String
            & Last_Name_String
            & Id_Integer> T as(T targetStart) {
        Object target = targetStart;
        target = ((First_Name_String) target).withFirstName(this.getFirstName());
        target = ((Last_Name_String) target).withLastName(this.getLastName());
        target = ((Id_Integer) target).withId(this.getId());
        return (T) target;
    }

    @SuppressWarnings("unchecked")
    public <T extends 
            First_Name_String
            & Last_Name_String
            & Id_Integer> T as(Class<? extends T> targetClass) {
        try {
            Object target = targetClass.newInstance();
            return this.as((T) target);
        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("firstName", this.firstName);
        map.put("lastName", this.lastName);
        map.put("id", this.id);
        return map;
    }

    // Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_Row that = (Person_Row) o;
        return     Objects.equals(firstName, that.firstName) && 
            Objects.equals(lastName, that.lastName) && 
            Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "Person_Row{" + "firstName=" + firstName
            + ", " + "lastName=" + lastName
            + ", " + "id=" + id + "}";
    }

}
