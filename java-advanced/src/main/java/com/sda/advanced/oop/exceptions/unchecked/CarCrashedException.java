package com.sda.advanced.oop.exceptions.unchecked;

// custom unchecked exception
public class CarCrashedException extends RuntimeException {

    // create a constructor with a message
    // this constructor calls parent constructor
    public CarCrashedException(Car car) {
        super(car + " crashed at speed " + car.getSpeed());
    }
}
