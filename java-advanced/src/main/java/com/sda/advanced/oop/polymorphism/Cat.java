package com.sda.advanced.oop.polymorphism;

// IS-A - inheritance
public class Cat extends Animal {

    public Cat(String color) {
        super(color);
        System.out.println("create cat with color: " + color);
    }

    @Override
    public void walk() {
        System.out.println("the " + super.color + " cat is walking");
    }
}
