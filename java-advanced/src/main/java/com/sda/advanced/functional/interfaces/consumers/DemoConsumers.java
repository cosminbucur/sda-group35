package com.sda.advanced.functional.interfaces.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumers {

    public static void main(String[] args) {
        // given name, print hello <name>
        // consumer = (input) -> { body }
        // interface = implementation
        Consumer<String> consumer = (name) -> System.out.println("hello " + name);
        consumer.accept("ana");

        // Arrays - utility class for arrays
        List<String> nameList = Arrays.asList("Ana", "Paul", "Alex");

        nameList.forEach(consumer);

        nameList.forEach(name -> System.out.println("hello " + name));

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
