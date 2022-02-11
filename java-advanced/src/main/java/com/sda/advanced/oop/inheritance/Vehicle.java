package com.sda.advanced.oop.inheritance;

public class Vehicle {

    // --- state
    String color;
    int speed;
    int fabricationYear;
    boolean isRented;

    // --- behavior

    // command
    void drive() {
        System.out.println("generic drive");
    }

    // query
    int getSpeed() {
        return speed;
    }
}

