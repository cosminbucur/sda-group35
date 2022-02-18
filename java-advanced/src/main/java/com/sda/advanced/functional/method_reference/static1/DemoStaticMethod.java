package com.sda.advanced.functional.method_reference.static1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoStaticMethod {

    public static void main(String[] args) {
        // regular call
        Darius.dealDamage(100, 40);

        // static method reference
        BiFunction<Integer, Integer, Integer> realDamage = Darius::dealDamage;
        Integer result = realDamage.apply(100, 40);
        System.out.println(result);

        Function<Integer, Integer> healUp = Darius::healUp;
        Integer currentHeal = healUp.apply(50);
        System.out.println(currentHeal);
    }
}
