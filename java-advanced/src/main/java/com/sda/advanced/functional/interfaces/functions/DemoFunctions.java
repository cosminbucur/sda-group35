package com.sda.advanced.functional.interfaces.functions;

import java.util.function.Function;

public class DemoFunctions {

    public static void main(String[] args) {
        // interface = implementation

        // multiply by 2
        Function<Integer, Integer> functionNoLambda = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * 2;
            }
        };
        Function<Integer, Integer> function = (x) -> x * 2;
        Integer result = function.apply(5);
    }
}
