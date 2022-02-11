package com.sda.advanced.oop.encapsulation;

public class Printer {

    // private fields
    private final String color;
    private int numberOfPages;

    // default constructor (hidden)

    public Printer(String color) {
        this.color = color;
        this.numberOfPages = 30;
    }

    // explicit constructor prevents default constructor
    public Printer(String color, int numberOfPages) {
        this.color = color;
        this.numberOfPages = numberOfPages;
    }

    // static method
    static void start() {
        System.out.println("starting...");
    }

    // no setters

    // getters
    public String getColor() {
        return this.color;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
