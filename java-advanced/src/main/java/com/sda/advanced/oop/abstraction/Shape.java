package com.sda.advanced.oop.abstraction;

// abstract class
public abstract class Shape {

    String color;
    int angleCount;

    Shape() {
    }

    Shape(String color) {
        this.color = color;
    }

    Shape(String color, int angleCount) {
        this.color = color;
        this.angleCount = angleCount;
    }

    // abstract method
    public abstract double getArea();

    public abstract String toString();

    // concrete method
    public String getColor() {
        return this.color;
    }
}
