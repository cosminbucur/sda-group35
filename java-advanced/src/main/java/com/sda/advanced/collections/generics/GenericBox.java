package com.sda.advanced.collections.generics;

// generic class = can hold any type
public class GenericBox<T> {

    // has a
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public void delete() {
        this.item = null;
    }

    public T getItem() {
        return item;
    }
}
