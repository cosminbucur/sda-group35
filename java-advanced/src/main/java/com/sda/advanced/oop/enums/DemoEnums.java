package com.sda.advanced.oop.enums;

public class DemoEnums {

    public static void main(String[] args) {
        System.out.println("mars");
        System.out.println("Mars");
        System.out.println("MARS");

        Planets input = Planets.MARS;
        if (input.equals(Planets.MARS)) {
            System.out.println("do this");
        }
    }
}
