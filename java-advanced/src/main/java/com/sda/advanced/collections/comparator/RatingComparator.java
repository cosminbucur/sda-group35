package com.sda.advanced.collections.comparator;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie first, Movie second) {
        if (first.getRating() < second.getRating()) {
            return 1;
        } else if (first.getRating() > second.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}
