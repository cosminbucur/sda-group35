package com.sda.advanced.oop.polymorphism;

public class Animal {

    protected String color;

    public Animal(String color) {
        this.color = color;
        System.out.println("create animal with color: " + color);
    }

    public void walk() {
        System.out.println("walk like an animal");
    }
}
