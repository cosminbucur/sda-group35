package com.sda.advanced.optional;

import java.util.Map;
import java.util.Optional;

public class Database {

    private static Map<Integer, String> db = Map.of(
            1, "alex",
            2, "paul",
            3, "ana"
    );

    // find by id
    public String findById(int id) {
        return db.get(id);
    }

    public Optional<String> findByKey(int id) {
        String value = db.get(id);
        return Optional.ofNullable(value);
    }
}
