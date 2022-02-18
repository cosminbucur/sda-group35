package com.sda.advanced.functional.interfaces.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class DemoBinaryOperator {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        // X-A, Y-B, Z-C
        BinaryOperator<String> binaryOperator = (key, value) -> key + "-" + value;
        List<String> result = new ArrayList<>();
        // iterate map
        map.forEach((key, value) -> {
            // apply operator > add to list
            String operatorResult = binaryOperator.apply(key, value);
            result.add(operatorResult);
        });

    }
}
