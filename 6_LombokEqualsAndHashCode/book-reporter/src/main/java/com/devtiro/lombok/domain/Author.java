package com.devtiro.lombok.domain;

import lombok.*;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 * <p>
 * Demonstrating on-variable @Getter and @Setter.
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Author {

    @Getter
    @Setter
    private String givenName;

    @Getter
    @Setter
    private String familyName;

    @Getter
    @Setter
    private Integer age;

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

    public String toString() {
        return "Author(givenName=" + this.givenName + ", familyName=" + this.familyName + ", age=" + this.age + ")";
    }
}
