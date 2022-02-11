package com.sda.advanced.oop.interfaces;

public class Rectangle implements Drawable {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public String toString() {
        return "length=" + length + " times " + width + " + width";
    }

    @Override
    public void draw() {
        System.out.println("drawing");
    }

    @Override
    public void cut() {
        System.out.println("cutting");
    }

    @Override
    public void paste() {

    }

    @Override
    public void undo() {

    }
}
