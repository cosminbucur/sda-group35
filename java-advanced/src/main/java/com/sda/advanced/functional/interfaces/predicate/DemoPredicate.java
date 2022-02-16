package com.sda.advanced.functional.interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicate {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
        // filter names starting with A

        Predicate<String> startWithAPredicate = (name) -> name.startsWith("A");

        List<String> result = names.stream()
                .filter((name) -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
