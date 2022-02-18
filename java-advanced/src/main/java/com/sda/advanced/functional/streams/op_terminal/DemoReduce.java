package com.sda.advanced.functional.streams.op_terminal;

import java.util.Arrays;
import java.util.List;

public class DemoReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5);

        // sum numbers
        Integer result = numbers.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);
    }
}
