package com.devtiro.lombok.domain;

import lombok.*;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 *
 * Demonstrating on-variable @Getter and @Setter.
 */
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

}
