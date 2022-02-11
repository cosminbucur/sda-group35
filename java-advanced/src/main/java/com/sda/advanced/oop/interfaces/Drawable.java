package com.sda.advanced.oop.interfaces;

// interface keyword
public interface Drawable {

    // all fields are constants (public, static, final)
    public int publicProperty = 10;
    int publicProperty2 = 20;

    static int staticProperty = 30;
    int staticProperty2 = 30;

    final int finalProperty = 40;
    int finalProperty2 = 40;

    public static final String TEMP = "0";
    String TEMP2 = "0";

    // no need to have public methods
    void draw();
    void cut();
    void paste();
    void undo();

    // default behavior for an interface, always returns the same
    // avoid breaking changes
    default void defaultMethod() {
        System.out.println("in default method");

        // call private method
        privateMethod();
    }

    // can have private methods
    private void privateMethod() {
        System.out.println("in private method");
    }
}
