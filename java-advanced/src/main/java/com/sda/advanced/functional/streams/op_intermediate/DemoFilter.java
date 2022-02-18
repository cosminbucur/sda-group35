package com.sda.advanced.functional.streams.op_intermediate;

import java.util.ArrayList;
import java.util.List;

public class DemoFilter {

    public static void main(String[] args) {
        List<String> versions = new ArrayList<>();
        versions.add("Lollipop");
        versions.add("KitKat");
        versions.add("Jelly Bean");
        versions.add("Ice Cream Sandwich");
        versions.add("Honeycomb");
        versions.add("Gingerbread");

        // length > 10 characters
        versions.stream()   // Stream<String>
                .filter(version -> version.length() > 10)   // Stream<String>
                .forEach(version -> System.out.println(version));
//                .forEach(System.out::println);

        // contains E, first element
        versions.stream()
                .map(version -> version.toLowerCase())
                .filter(version -> version.contains("e"))
                .findFirst()
                .get();

        // length > 8, starts with G
        versions.stream()
                .filter(version -> version.length() > 8)
                .filter(version -> version.startsWith("G"));
    }
}
