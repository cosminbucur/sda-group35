package com.sda.advanced.oop.exceptions.checked;

// custom checked exception
public class DatabaseConnectionException extends Exception {

    public DatabaseConnectionException(String message) {
        super(message);
    }
}
