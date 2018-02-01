package com.lsql_demo.db.personstmts;

import com.lsql_demo.db.structural_fields.*;
import java.util.*;

@SuppressWarnings({"Duplicates", "WeakerAccess"})
public final class LoadPersonById implements com.w11k.lsql.TableRow, Id_Integer, First_Name_String, Last_Name_String, Age_Integer {

    // static methods ----------

    @SuppressWarnings("unchecked")
    public static <T extends 
            Id_Integer
            & First_Name_String
            & Last_Name_String
            & Age_Integer> LoadPersonById from(T source) {
        Object target = new LoadPersonById();
        target = ((Id_Integer) target).withId(source.getId());
        target = ((First_Name_String) target).withFirstName(source.getFirstName());
        target = ((Last_Name_String) target).withLastName(source.getLastName());
        target = ((Age_Integer) target).withAge(source.getAge());
        return (LoadPersonById) target;
    }

    // constructors ----------

    @SuppressWarnings("ConstantConditions")
    public LoadPersonById() {
        this.id = null;
        this.firstName = null;
        this.lastName = null;
        this.age = null;
    }

    @SuppressWarnings("NullableProblems")
    private LoadPersonById(
            java.lang.Integer id,
            java.lang.String firstName,
            java.lang.String lastName,
            java.lang.Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @SuppressWarnings("unused")
    public LoadPersonById(java.util.Map<String, Object> from) {
        this.id = (java.lang.Integer) from.get("id");
        this.firstName = (java.lang.String) from.get("firstName");
        this.lastName = (java.lang.String) from.get("lastName");
        this.age = (java.lang.Integer) from.get("age");
    }

    // fields ----------

    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_ID = "id";

    @SuppressWarnings("unused")
    public static final String FIELD_ID = "id";

    @javax.annotation.Nonnull public final java.lang.Integer id;

    @javax.annotation.Nonnull public java.lang.Integer getId() {
        return this.id;
    }

    public LoadPersonById withId(@javax.annotation.Nonnull java.lang.Integer id) {
        return new LoadPersonById(id,firstName,lastName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_FIRSTNAME = "firstName";

    @SuppressWarnings("unused")
    public static final String FIELD_FIRSTNAME = "firstName";

    @javax.annotation.Nonnull public final java.lang.String firstName;

    @javax.annotation.Nonnull public java.lang.String getFirstName() {
        return this.firstName;
    }

    public LoadPersonById withFirstName(@javax.annotation.Nonnull java.lang.String firstName) {
        return new LoadPersonById(id,firstName,lastName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_LASTNAME = "lastName";

    @SuppressWarnings("unused")
    public static final String FIELD_LASTNAME = "lastName";

    @javax.annotation.Nonnull public final java.lang.String lastName;

    @javax.annotation.Nonnull public java.lang.String getLastName() {
        return this.lastName;
    }

    public LoadPersonById withLastName(@javax.annotation.Nonnull java.lang.String lastName) {
        return new LoadPersonById(id,firstName,lastName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_AGE = "age";

    @SuppressWarnings("unused")
    public static final String FIELD_AGE = "age";

    @javax.annotation.Nullable public final java.lang.Integer age;

    @javax.annotation.Nullable public java.lang.Integer getAge() {
        return this.age;
    }

    public LoadPersonById withAge(@javax.annotation.Nullable java.lang.Integer age) {
        return new LoadPersonById(id,firstName,lastName,age);
    }

    // class methods ----------

    @SuppressWarnings("unchecked")
    public <T extends 
            Id_Integer
            & First_Name_String
            & Last_Name_String
            & Age_Integer> T as(T targetStart) {
        Object target = targetStart;
        target = ((Id_Integer) target).withId(this.getId());
        target = ((First_Name_String) target).withFirstName(this.getFirstName());
        target = ((Last_Name_String) target).withLastName(this.getLastName());
        target = ((Age_Integer) target).withAge(this.getAge());
        return (T) target;
    }

    @SuppressWarnings("unchecked")
    public <T extends 
            Id_Integer
            & First_Name_String
            & Last_Name_String
            & Age_Integer> T as(Class<? extends T> targetClass) {
        try {
            Object target = targetClass.newInstance();
            return this.as((T) target);
        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public java.util.Map<String, Object> toInternalMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("id", this.id);
        map.put("firstName", this.firstName);
        map.put("lastName", this.lastName);
        map.put("age", this.age);
        return map;
    }

    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("id", this.id);
        map.put("firstName", this.firstName);
        map.put("lastName", this.lastName);
        map.put("age", this.age);
        return map;
    }

    // Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoadPersonById that = (LoadPersonById) o;
        return     Objects.equals(id, that.id) && 
            Objects.equals(firstName, that.firstName) && 
            Objects.equals(lastName, that.lastName) && 
            Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "LoadPersonById{" + "id=" + id
            + ", " + "firstName=" + firstName
            + ", " + "lastName=" + lastName
            + ", " + "age=" + age + "}";
    }

}
