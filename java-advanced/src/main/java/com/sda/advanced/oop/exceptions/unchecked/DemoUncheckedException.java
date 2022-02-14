package com.sda.advanced.oop.exceptions.unchecked;

public class DemoUncheckedException {

    public static void main(String[] args) {
        // car
        Car car = new Car();

        // increaseSpeed x 3 > 200 km/h -> exception
        car.increaseSpeed();    // 70
        car.increaseSpeed();    // 140
        car.increaseSpeed();    // 210
    }
}
