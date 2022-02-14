package com.sda.advanced.oop.exceptions.checked;

public class Database {

    // open

    // this method throws checked exception higher
    public void openConnection(String url) throws DatabaseConnectionException {
        if (url.isEmpty() || url.isBlank()) {
            // throw checked exception
            throw new DatabaseConnectionException("failed to connect to database");
        }

        // connection ok
        System.out.println("database connected");
    }

    // save
    public void save(String object) {
        System.out.println(object + " saved");
    }
}
