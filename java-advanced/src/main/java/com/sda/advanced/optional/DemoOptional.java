package com.sda.advanced.optional;

import java.util.Optional;

public class DemoOptional {

    public static void main(String[] args) {
        // full optional
        Optional<String> myOptional = Optional.of("temp");

        // empty optional
        System.out.println(Optional.empty());

        // non empty optional
        String variable = "temp2";
        String nullVariable = null;
        Optional<String> optionalVariable = Optional.ofNullable(variable);  // value = "temp2"
        Optional<String> emptyOptional = Optional.ofNullable(nullVariable); // value = null
    }
}
