package com.devtiro.lombok.domain;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 */
public class Author {

    private String givenName;

    private String familyName;

    private Integer age;

    public Author() {
    }

    public Author(final String givenName, final String familyName, final Integer age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(givenName, author.givenName) && Objects.equals(familyName, author.familyName) && Objects.equals(age, author.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(givenName, familyName, age);
    }

    @Override
    public String toString() {
        return "Author(" +
                "givenName=" + givenName +
                ", familyName=" + familyName +
                ", age=" + age +
                ')';
    }
}
