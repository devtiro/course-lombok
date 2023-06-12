package com.devtiro.lombok.domain;

import org.junit.jupiter.api.Test;

import static com.devtiro.lombok.TestDataUtil.createTestAuthor;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for Author.
 *
 * A lot of Developers typically wouldn't write these, but for
 * showing off Lombok, they are handy.
 */
public class AuthorTests {

    /**
     * Tests that we can create a new Author instance with a no args constructor.
     *
     * Technically, this test could never fail, but give a compile error.
     * Different route, same value.️
     */
    @Test
    public void testCanCreateAuthorWithNoArgumentsConstructor() {
        final Author author = new Author();
        assertThat(author).isNotNull();
    }

    /**
     * Tests that we can create a new Author instance with an all args constructor.
     *
     * Technically, this test could never fail, but give a compile error.
     * Different route, same value.️
     */
    @Test
    public void testCanCreateAuthorWithAllArgumentsConstructor() {
        final Author author = new Author(
                "Aria",
                "Montgomery",
                36
        );
        assertThat(author.getGivenName()).isEqualTo("Aria");
        assertThat(author.getFamilyName()).isEqualTo("Montgomery");
        assertThat(author.getAge()).isEqualTo(36);
    }

    @Test
    public void testCanSetGetGivenName() {
        final Author author = new Author();
        author.setGivenName("Aria");
        assertThat(author.getGivenName()).isEqualTo("Aria");
    }

    @Test
    public void testCanSetGetFamilyName() {
        final Author author = new Author();
        author.setFamilyName("Montgomery");
        assertThat(author.getFamilyName()).isEqualTo("Montgomery");
    }

    @Test
    public void testCanSetGetAge() {
        final Author author = new Author();
        author.setAge(36);
        assertThat(author.getAge()).isEqualTo(36);
    }

    @Test
    public void testAuthorEqualsSame() {
        final Author authorA = createTestAuthor();
        final Author authorB = createTestAuthor();
        assertThat(authorA).isEqualTo(authorB);
    }

    @Test
    public void testThatToStringReturnsCorrectString() {
        final Author author = createTestAuthor();
        final String expected = "Author(givenName=Aria, familyName=Montgomery, age=36)";
        assertThat(author.toString()).isEqualTo(expected);
    }
}
