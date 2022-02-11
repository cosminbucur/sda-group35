package com.sda.advanced.oop.abstraction;

public class Circle extends Shape {

    int radius;

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "radius= " + radius;
    }
}
