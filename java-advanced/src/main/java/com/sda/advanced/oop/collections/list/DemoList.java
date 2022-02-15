package com.sda.advanced.oop.collections.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        // create list
        // interface = new implementation
        List<Rating> ratings = new ArrayList<>();

        // 1 - 5
        Rating goodRating = new Rating(5);
        Rating averageRating = new Rating(3);
        Rating badRating = new Rating(1);
        Rating rating2 = new Rating(4);

        // ADD
        // add 3 ratings
            // good
            // average
            // bad
        ratings.add(goodRating);
        ratings.add(averageRating);
        ratings.add(badRating);
        ratings.add(rating2);

        // print rating values from list
        System.out.println(ratings);

        // ITERATE
        // get value from each rating and print value
        printListItems(ratings);

        ratings.remove(rating2);
        printListItems(ratings);
    }

    public static void printListItems(List<Rating> ratings) {
        for (int i = 0; i < ratings.size(); i++) {
            // get value from each rating
            Rating rating = ratings.get(i);
            System.out.println(rating.value);
        }
    }
}
