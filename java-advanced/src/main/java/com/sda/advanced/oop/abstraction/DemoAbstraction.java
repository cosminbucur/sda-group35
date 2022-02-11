package com.sda.advanced.oop.abstraction;

public class DemoAbstraction {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("blue", 2, 3);
        rectangle.getColor();
        System.out.println(rectangle.getArea());

        Shape square = new Square(3);
        System.out.println(square.getArea());
    }
}
