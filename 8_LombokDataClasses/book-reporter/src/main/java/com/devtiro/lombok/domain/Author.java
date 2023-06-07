package com.devtiro.lombok.domain;

import lombok.*;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 *
 * Demonstrating on-variable @Getter and @Setter.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private String givenName;

    private String familyName;

    private Integer age;

}
