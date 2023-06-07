package com.devtiro.lombok;

import com.devtiro.lombok.domain.Author;
import com.devtiro.lombok.domain.Book;

/**
 * Utility class for generating test data.
 */
public final class TestDataUtil {
    /**
     * Private default constructor as a utility class.
     */
    private TestDataUtil() {
    }

    public static Author createTestAuthor() {
        return Author.builder()
                .givenName("Aria")
                .familyName("Montgomery")
                .age(36)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .title("The Enigma of Eternity")
                .yearPublished(2005)
                .author(createTestAuthor())
                .build();
    }
}
