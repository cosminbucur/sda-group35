package com.sda.advanced.oop.generics;

public class DemoGenerics {

    public static void main(String[] args) {
        // box
            // some type
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.add("test");
        System.out.println(stringBox.getItem());

        Car car = new Car();
        GenericBox<Car> carBox = new GenericBox<>();
        carBox.add(car);
        System.out.println(carBox.getItem());

        carBox.delete();
        System.out.println(carBox.getItem());
    }
}
