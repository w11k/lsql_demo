package com.lsql_demo.db.schema_public;

import com.lsql_demo.db.structural_fields.*;
import java.util.*;

@SuppressWarnings({"Duplicates", "WeakerAccess"})
public final class Person_Row implements com.w11k.lsql.TableRow, Last_Name_String, Id_Integer, First_Name_String, Age_Integer {

    // static methods ----------

    @SuppressWarnings("unchecked")
    public static <T extends 
            Last_Name_String
            & Id_Integer
            & First_Name_String
            & Age_Integer> Person_Row from(T source) {
        Object target = new Person_Row();
        target = ((Last_Name_String) target).withLastName(source.getLastName());
        target = ((Id_Integer) target).withId(source.getId());
        target = ((First_Name_String) target).withFirstName(source.getFirstName());
        target = ((Age_Integer) target).withAge(source.getAge());
        return (Person_Row) target;
    }

    // constructors ----------

    @SuppressWarnings("ConstantConditions")
    public Person_Row() {
        this.lastName = null;
        this.id = null;
        this.firstName = null;
        this.age = null;
    }

    @SuppressWarnings("NullableProblems")
    private Person_Row(
            java.lang.String lastName,
            java.lang.Integer id,
            java.lang.String firstName,
            java.lang.Integer age) {
        this.lastName = lastName;
        this.id = id;
        this.firstName = firstName;
        this.age = age;
    }

    @SuppressWarnings("unused")
    public Person_Row(java.util.Map<String, Object> from) {
        this.lastName = (java.lang.String) from.get("last_name");
        this.id = (java.lang.Integer) from.get("id");
        this.firstName = (java.lang.String) from.get("first_name");
        this.age = (java.lang.Integer) from.get("age");
    }

    // fields ----------

    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_LAST_NAME = "last_name";

    @SuppressWarnings("unused")
    public static final String FIELD_LAST_NAME = "lastName";

    @javax.annotation.Nonnull public final java.lang.String lastName;

    @javax.annotation.Nonnull public java.lang.String getLastName() {
        return this.lastName;
    }

    public Person_Row withLastName(@javax.annotation.Nonnull java.lang.String lastName) {
        return new Person_Row(lastName,id,firstName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_ID = "id";

    @SuppressWarnings("unused")
    public static final String FIELD_ID = "id";

    @javax.annotation.Nonnull public final java.lang.Integer id;

    @javax.annotation.Nonnull public java.lang.Integer getId() {
        return this.id;
    }

    public Person_Row withId(@javax.annotation.Nonnull java.lang.Integer id) {
        return new Person_Row(lastName,id,firstName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_FIRST_NAME = "first_name";

    @SuppressWarnings("unused")
    public static final String FIELD_FIRST_NAME = "firstName";

    @javax.annotation.Nonnull public final java.lang.String firstName;

    @javax.annotation.Nonnull public java.lang.String getFirstName() {
        return this.firstName;
    }

    public Person_Row withFirstName(@javax.annotation.Nonnull java.lang.String firstName) {
        return new Person_Row(lastName,id,firstName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_AGE = "age";

    @SuppressWarnings("unused")
    public static final String FIELD_AGE = "age";

    @javax.annotation.Nullable public final java.lang.Integer age;

    @javax.annotation.Nullable public java.lang.Integer getAge() {
        return this.age;
    }

    public Person_Row withAge(@javax.annotation.Nullable java.lang.Integer age) {
        return new Person_Row(lastName,id,firstName,age);
    }

    // class methods ----------

    @SuppressWarnings("unchecked")
    public <T extends 
            Last_Name_String
            & Id_Integer
            & First_Name_String
            & Age_Integer> T as(T targetStart) {
        Object target = targetStart;
        target = ((Last_Name_String) target).withLastName(this.getLastName());
        target = ((Id_Integer) target).withId(this.getId());
        target = ((First_Name_String) target).withFirstName(this.getFirstName());
        target = ((Age_Integer) target).withAge(this.getAge());
        return (T) target;
    }

    @SuppressWarnings("unchecked")
    public <T extends 
            Last_Name_String
            & Id_Integer
            & First_Name_String
            & Age_Integer> T as(Class<? extends T> targetClass) {
        try {
            Object target = targetClass.newInstance();
            return this.as((T) target);
        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public java.util.Map<String, Object> toInternalMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("last_name", this.lastName);
        map.put("id", this.id);
        map.put("first_name", this.firstName);
        map.put("age", this.age);
        return map;
    }

    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("lastName", this.lastName);
        map.put("id", this.id);
        map.put("firstName", this.firstName);
        map.put("age", this.age);
        return map;
    }

    // Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_Row that = (Person_Row) o;
        return     Objects.equals(lastName, that.lastName) && 
            Objects.equals(id, that.id) && 
            Objects.equals(firstName, that.firstName) && 
            Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, id, firstName, age);
    }

    @Override
    public String toString() {
        return "Person_Row{" + "lastName=" + lastName
            + ", " + "id=" + id
            + ", " + "firstName=" + firstName
            + ", " + "age=" + age + "}";
    }

}
