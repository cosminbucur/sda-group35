package com.sda.advanced.optional;

import java.util.Optional;

public class DemoWhyOptional {

    public static void main(String[] args) {
        Database database = new Database();
        String name = database.findById(4);

        if (name != null) {
            System.out.println(name + " is hired");
        }

        // wrong optional
        Optional<String> optionalName = database.findByKey(4);

        if (optionalName.isPresent()) {
            String foundName = optionalName.get();
            System.out.println(foundName);
        }

        // right optional
//        String realName = database.findByKey(4)
//                .orElseThrow(() -> new RuntimeException("name not found"));

        String unknownName = database.findByKey(4)
                .orElse("unknown");

        String ana = database.findByKey(3)
                .orElse("unknown");
    }
}
