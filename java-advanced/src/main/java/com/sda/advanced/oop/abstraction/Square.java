package com.sda.advanced.oop.abstraction;

public class Square extends Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "length=" + length;
    }
}
