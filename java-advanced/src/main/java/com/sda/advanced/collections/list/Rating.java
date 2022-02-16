package com.sda.advanced.collections.list;

public class Rating {

    int value;

    public Rating(int value) {
        // corner case
        if (value < 1 || value >= 6) {
            throw new RuntimeException("rating must be between 1 and 5");
        }

        this.value = value;
    }
}
