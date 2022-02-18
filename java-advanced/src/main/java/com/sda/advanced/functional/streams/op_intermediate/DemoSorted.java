package com.sda.advanced.functional.streams.op_intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoSorted {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("alex", 30),
                new User("dan", 40),
                new User("ana", 10),
                new User("vali", 20),
                new User("cristina", 50)
        );

        // sort by age
        List<User> result = users.stream()
                .sorted(Comparator.comparingInt(user -> user.getAge()))
                .collect(Collectors.toList());
    }
}

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
