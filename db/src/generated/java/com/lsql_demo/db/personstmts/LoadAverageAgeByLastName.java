package com.lsql_demo.db.personstmts;

import com.lsql_demo.db.structural_fields.*;
import java.util.*;

@SuppressWarnings({"Duplicates", "WeakerAccess"})
public final class LoadAverageAgeByLastName implements com.w11k.lsql.TableRow, Last_Name_String, Age_Integer {

    // static methods ----------

    @SuppressWarnings("unchecked")
    public static <T extends 
            Last_Name_String
            & Age_Integer> LoadAverageAgeByLastName from(T source) {
        Object target = new LoadAverageAgeByLastName();
        target = ((Last_Name_String) target).withLastName(source.getLastName());
        target = ((Age_Integer) target).withAge(source.getAge());
        return (LoadAverageAgeByLastName) target;
    }

    // constructors ----------

    @SuppressWarnings("ConstantConditions")
    public LoadAverageAgeByLastName() {
        this.lastName = null;
        this.age = null;
    }

    @SuppressWarnings("NullableProblems")
    private LoadAverageAgeByLastName(
            java.lang.String lastName,
            java.lang.Integer age) {
        this.lastName = lastName;
        this.age = age;
    }

    @SuppressWarnings("unused")
    public LoadAverageAgeByLastName(java.util.Map<String, Object> from) {
        this.lastName = (java.lang.String) from.get("lastName");
        this.age = (java.lang.Integer) from.get("age");
    }

    // fields ----------

    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_LASTNAME = "lastName";

    @SuppressWarnings("unused")
    public static final String FIELD_LASTNAME = "lastName";

    @javax.annotation.Nonnull public final java.lang.String lastName;

    @javax.annotation.Nonnull public java.lang.String getLastName() {
        return this.lastName;
    }

    public LoadAverageAgeByLastName withLastName(@javax.annotation.Nonnull java.lang.String lastName) {
        return new LoadAverageAgeByLastName(lastName,age);
    }
    @SuppressWarnings("unused")
    public static final String INTERNAL_FIELD_AGE = "age";

    @SuppressWarnings("unused")
    public static final String FIELD_AGE = "age";

    @javax.annotation.Nonnull public final java.lang.Integer age;

    @javax.annotation.Nonnull public java.lang.Integer getAge() {
        return this.age;
    }

    public LoadAverageAgeByLastName withAge(@javax.annotation.Nonnull java.lang.Integer age) {
        return new LoadAverageAgeByLastName(lastName,age);
    }

    // class methods ----------

    @SuppressWarnings("unchecked")
    public <T extends 
            Last_Name_String
            & Age_Integer> T as(T targetStart) {
        Object target = targetStart;
        target = ((Last_Name_String) target).withLastName(this.getLastName());
        target = ((Age_Integer) target).withAge(this.getAge());
        return (T) target;
    }

    @SuppressWarnings("unchecked")
    public <T extends 
            Last_Name_String
            & Age_Integer> T as(Class<? extends T> targetClass) {
        try {
            Object target = targetClass.newInstance();
            return this.as((T) target);
        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public java.util.Map<String, Object> toInternalMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("lastName", this.lastName);
        map.put("age", this.age);
        return map;
    }

    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("lastName", this.lastName);
        map.put("age", this.age);
        return map;
    }

    // Object methods ----------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoadAverageAgeByLastName that = (LoadAverageAgeByLastName) o;
        return     Objects.equals(lastName, that.lastName) && 
            Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, age);
    }

    @Override
    public String toString() {
        return "LoadAverageAgeByLastName{" + "lastName=" + lastName
            + ", " + "age=" + age + "}";
    }

}
