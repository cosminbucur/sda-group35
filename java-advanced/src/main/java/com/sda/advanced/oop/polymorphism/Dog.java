package com.sda.advanced.oop.polymorphism;

// IS-A - inheritance
public class Dog extends Animal {

    public Dog(String color) {
        super(color);
        System.out.println("create dog with color: " + color);
    }

    @Override
    public void walk() {
        System.out.println("the " + super.color + " dog is walking");
    }
}
