package com.sda.advanced.oop.exceptions.checked;

public class DemoUncheckedException {

    public static void main(String[] args) {
        // open database
        Database database = new Database();

        try {
            // code that might fail
            database.openConnection("");
        } catch (DatabaseConnectionException e) {
            // exception handling
            System.out.println("retry connection with a correct url");
        }

        // save object
        database.save("important object");
    }
}
