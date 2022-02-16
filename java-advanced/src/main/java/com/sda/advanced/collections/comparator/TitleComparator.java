package com.sda.advanced.collections.comparator;

import java.util.Comparator;

public class TitleComparator implements Comparator<Movie> {
    
    @Override
    public int compare(Movie one, Movie two) {
        // compare two strings
        return one.getTitle().compareTo(two.getTitle());
    }
}
