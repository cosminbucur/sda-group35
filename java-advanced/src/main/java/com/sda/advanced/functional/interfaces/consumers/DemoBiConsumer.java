package com.sda.advanced.functional.interfaces.consumers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class DemoBiConsumer {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println(name + " is " + age + " years old");
            System.out.printf("%s is %d years old", name, age);
        };

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alex", 25);
        ages.put("Ana", 27);
        ages.put("Paul", 23);

        ages.forEach((name, age) -> System.out.printf("%s is %d years old \n", name, age));
    }
}
