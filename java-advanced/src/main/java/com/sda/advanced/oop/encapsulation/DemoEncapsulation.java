package com.sda.advanced.oop.encapsulation;

public class DemoEncapsulation {

    public static void main(String[] args) {
        // type reference = new constructor
        Printer printer1 = new Printer("blue", 20);
        Printer printer2 = new Printer("red", 50);
        Printer printer = new Printer("white");

        // printer = instance of Printer
        // setColor = method call

        // non-static method call (reference.method)
        String colorOfPrinter = printer.getColor();
        int numberOfPages = printer.getNumberOfPages();

        // static method call (class.method)
        Printer.start();
    }
}
