package com.devtiro.lombok.domain;

import lombok.*;

import java.util.Objects;

/**
 * A Book written by an {@link Author}.
 *
 * Demonstrating on-class @Getter and @Setter.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;

    private Integer yearPublished;

    private Author author;

}
