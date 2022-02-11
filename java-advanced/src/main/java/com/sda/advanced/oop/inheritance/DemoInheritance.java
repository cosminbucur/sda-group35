package com.sda.advanced.oop.inheritance;

public class DemoInheritance {

    // prove inheritance
    public static void main(String[] args) {
        // inherit state
        Car car = new Car();
        car.color = "blue";

        // inherit behavior
        car.drive();
        int speed = car.getSpeed();
    }
}
