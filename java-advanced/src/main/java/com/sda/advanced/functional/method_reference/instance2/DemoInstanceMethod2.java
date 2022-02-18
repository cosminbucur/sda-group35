package com.sda.advanced.functional.method_reference.instance2;

import java.util.Arrays;
import java.util.List;

public class DemoInstanceMethod2 {

    public static void main(String[] args) {
        // create 3 boats (color, length)
        // sort with method reference
        Boat boat1 = new Boat("blue", 10);
        Boat boat2 = new Boat("red", 9);
        Boat boat3 = new Boat("orange", 11);
        List<Boat> boats = Arrays.asList(boat1, boat2, boat3);

        BoatComparator boatComparator = new BoatComparator();

        // no lambda
        boats.stream()
                .sorted(boatComparator);

        // lambda
        boats.stream()
                .sorted((first, second) -> boatComparator.compare(first, second));

        // method reference
        boats.stream()
                .sorted(boatComparator::compare);
    }
}
