package com.devtiro.lombok.domain;

import org.junit.jupiter.api.Test;

import static com.devtiro.lombok.TestDataUtil.createTestAuthor;
import static com.devtiro.lombok.TestDataUtil.createTestBook;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Book}.
 *
 * A lot of Developers typically wouldn't write these, but for
 * showing off Lombok, they are handy.
 */
public class BookTests {

    /**
     * Tests that we can create a new Book instance with a no args constructor.
     *
     * Technically, this test could never fail, but give a compile error.
     * Different route, same value.️
     */
    @Test
    public void testCanCreateABookWithNoArgumentsConstructor() {
        final Book book = new Book();
        assertThat(book).isNotNull();
    }

    /**
     * Tests that we can create a new Book instance with an all args constructor.
     *
     * Technically, this test could never fail, but give a compile error.
     * Different route, same value.️
     */
    @Test
    public void testCanCreateBookWithAllArgumentsConstructor() {
        final Author author = createTestAuthor();
        final Book book = new Book(
                "The Enigma of Eternity",
                2005,
                author
        );
        assertThat(book.getTitle()).isEqualTo("The Enigma of Eternity");
        assertThat(book.getYearPublished()).isEqualTo(2005);
        assertThat(book.getAuthor()).isEqualTo(author);
    }

    @Test
    public void testCanSetGetTitle() {
        final Book book = new Book();
        book.setTitle("The Hidden Key");
        assertThat(book.getTitle()).isEqualTo("The Hidden Key");
    }

    @Test
    public void testCanSetGetYearPublished() {
        final Book book = new Book();
        book.setYearPublished(2005);
        assertThat(book.getYearPublished()).isEqualTo(2005);
    }

    @Test
    public void testCanSetGetAuthor() {
        final Author author = createTestAuthor();
        final Book book = new Book();
        book.setAuthor(author);
        assertThat(book.getAuthor()).isEqualTo(author);
    }

    @Test
    public void testBookEqualsSame() {
        final Book bookA = createTestBook();
        final Book bookB = createTestBook();
        assertThat(bookA).isEqualTo(bookB);
    }

    @Test
    public void testThatToStringReturnsCorrectString() {
        final Book book = createTestBook();
        final String expected = "Book(title=The Enigma of Eternity, yearPublished=2005, author=Author(givenName=Aria, familyName=Montgomery, age=36))";
        assertThat(book.toString()).isEqualTo(expected);
    }
}
