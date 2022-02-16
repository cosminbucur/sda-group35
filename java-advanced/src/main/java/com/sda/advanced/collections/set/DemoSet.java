package com.sda.advanced.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

    public static void main(String[] args) {
        // tree set - orders items (natural order / custom order)
        Set<String> cities = new TreeSet<>();

        // create
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Berlin");
        cities.add("Milan");

        // read
        cities.contains("Paris");

        // delete
        cities.remove("Milan");

        cities.isEmpty();

        // create and add items to a list
        List<String> citiesFromRomania = List.of("Bucharest", "Brasov");
        cities.addAll(citiesFromRomania);
    }
}
