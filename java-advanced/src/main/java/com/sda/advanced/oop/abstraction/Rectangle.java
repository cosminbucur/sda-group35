package com.sda.advanced.oop.abstraction;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        // call parent constructor
        super(color);

        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        // access parent property
        System.out.println("color from parent: " + super.color);

        return "length=" + length + " times " + width + " + width";
    }
}
