package com.sda.advanced.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparator {

    // given movies, compare by name, by rating
    public static void main(String[] args) {
        // E... - var args (variable arguments)

        // Class.method - static method
        // reference.method - non-static method
        Movie movie1 = new Movie("movie 2", 2, 1987);
        Movie movie2 = new Movie("movie 1", 1, 1977);
        Movie movie3 = new Movie("movie 3", 3, 1998);

        // create immutable list
        List<Movie> movieList = List.of(
                new Movie("movie 2", 2, 1987),
                movie2,
                movie3
        );

        // create mutable list
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        TitleComparator titleComparator = new TitleComparator();
        titleComparator.compare(movie1, movie2); // 1

        // sort by rating descending
        System.out.println("before sort: " + movies);
        Collections.sort(movies, new RatingComparator());
        System.out.println("after sort: " + movies);

        // sort by title
        System.out.println("before sort: " + movies);
        Collections.sort(movies, new TitleComparator());
        System.out.println("after sort: " + movies);



    }
}
