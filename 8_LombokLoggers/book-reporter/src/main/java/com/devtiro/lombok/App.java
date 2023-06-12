package com.devtiro.lombok;

import com.devtiro.lombok.domain.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class App {

    /**
     * This "App" simply prints out the books and authors found in a JSON file
     * in resources.
     *
     * @param args Main args.
     * @throws IOException when cannot read books-authors.json file.
     */
    public static void main(String[] args) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();

        final URL booksAuthorsFile = App.class.getClassLoader().getResource("books-authors.json");
        final Book[] books = objectMapper.readValue(booksAuthorsFile, Book[].class);
        Arrays.stream(books).forEach(book ->
                System.out.println(book.toString())
        );
    }
}
