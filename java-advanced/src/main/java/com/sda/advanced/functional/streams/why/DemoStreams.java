package com.sda.advanced.functional.streams.why;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreams {

    // Get the unique names in uppercase of the first
    // 15 book authors that are 50 years old or over
    public static void main(String[] args) {
        // add books to a library
        List<Book> library = new ArrayList<>();

        // create a stream and apply some changes

        // convert list to Stream<Book>
        Stream<Book> streamOfBooks = library.stream();     // book1, book2, book3

        // get the authors from books
        Stream<Author> authorStream = streamOfBooks
                .map(book -> book.getAuthor());             // author1, author2, author3

        // filter authors by age
        Stream<Author> filteredAuthors = authorStream
                .filter(author -> author.getAge() >= 50);   // author1, author2

        Stream<Author> limitedStream = filteredAuthors.limit(15);   // author1, author2

        // get the names of the authors
        Stream<String> authorNames = limitedStream
                .map(author -> author.getName());       // alex, ana, alex

        Stream<String> distinctAuthorNames = authorNames.distinct();    // alex, ana

        Stream<String> upperCaseAuthorNames = distinctAuthorNames
                .map(name -> name.toUpperCase());// ALEX, ANA

        List<String> result = upperCaseAuthorNames.
                collect(Collectors.toList());
    }

    public static void oneLine() {
        List<Book> library = new ArrayList<>();

        List<String> result = library.stream()
                .map(book -> book.getAuthor())
                .filter(author -> author.getAge() >= 50)
                .limit(15)
                .map(author -> author.getName())
                .distinct()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        library.forEach(book -> System.out.println(book));
        library.forEach(book -> System.out.println(book.getTitle()));
        library.forEach(book -> System.out.println(book.getAuthor().getName()));
    }
}
