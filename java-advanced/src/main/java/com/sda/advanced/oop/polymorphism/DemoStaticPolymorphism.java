package com.sda.advanced.oop.polymorphism;

// static - method overloading
public class DemoStaticPolymorphism {

    public static void main(String[] args) {
        Human human = new Human();

        // compile time polymorphism

        // method overloading = same name, different signature
        human.run();
        human.run(15);
    }
}
