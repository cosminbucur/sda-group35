package com.sda.advanced.functional.method_reference.instance1;

public class DemoInstance1 {

    public static void main(String[] args) {
        // call stun with method reference
        Elise elise = new Elise();

        // call gank with lambda
        // interface = implementation
        Jungler jungler = () -> {
            System.out.println("ganking");
        };
        jungler.gank();

        // use instance method reference
        Jungler jungler1 = elise::stun;
        jungler1.gank();
    }
}
