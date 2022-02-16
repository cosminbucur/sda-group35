package com.sda.advanced.functional.interfaces.operators;

import java.util.Arrays;
import java.util.List;

public class DemoOperators {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("bob", "josh", "megan");

        names.replaceAll(name -> name.toUpperCase());

        names.forEach(x -> System.out.println(x));
    }
}
