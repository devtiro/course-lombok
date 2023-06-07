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
    private TestDataUtil(){
    }
    public static Author createTestAuthor() {
        return new Author(
                "Aria",
                "Montgomery",
                36
        );
    }

    public static Book createTestBook() {
        return new Book(
                "The Enigma of Eternity",
                2005,
                createTestAuthor()
        );
    }
}
