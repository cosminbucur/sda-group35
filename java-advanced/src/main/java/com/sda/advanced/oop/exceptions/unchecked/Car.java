package com.sda.advanced.oop.exceptions.unchecked;

public class Car {

    private int speed;

    public void increaseSpeed() {
        this.speed += 70;
        if (this.speed > 200) {
            // throw a new runtime exception
            throw new CarCrashedException(this);
        }
    }

    public int getSpeed() {
        return speed;
    }
}
