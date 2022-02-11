package com.sda.advanced.oop.interfaces;

public class DemoInterfaces {

    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable drawable = new Rectangle(3, 4);

        // call public method
        circle.cut();

        // call default method
        circle.defaultMethod();

        // access interface constants
        System.out.println(Drawable.finalProperty);
        System.out.println(Circle.finalProperty);
    }
}
