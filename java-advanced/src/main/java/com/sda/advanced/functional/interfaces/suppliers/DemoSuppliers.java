package com.sda.advanced.functional.interfaces.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSuppliers {

    public static void main(String[] args) {
        // generate double
        Supplier<Double> supplier = () -> {
            return 9d;
        };
        supplier.get();

        // generate random number
        Supplier<Integer> randomInteger = () -> new Random().nextInt();
        Integer result = randomInteger.get();
        System.out.println(result);

        // exception supplier
        Supplier<Exception> exceptionSupplier = () -> new RuntimeException("something wrong");
    }
}
