package com.sda.advanced.oop.polymorphism;

public class DemoDynamicPolymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal("white");
        animal.walk();

        // reference of type Animal = object of type Dog
        // parent = child
        Animal dog = new Dog("brown");
        dog.walk();
        Animal dog2 = new Dog("white");
        dog2.walk();

        Animal cat = new Cat("orange");
        cat.walk();
    }
}
