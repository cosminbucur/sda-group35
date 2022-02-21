package com.sda.advanced.functional.interfaces.functions;

import java.util.function.IntToDoubleFunction;

public class DemoPrimitiveFunctions {
    // int array
    // transform to double (times 2)

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        // int to double
        double[] result = transformArray(array, value -> value * 2);
        System.out.println(result);
    }

    private static double[] transformArray(int[] array, IntToDoubleFunction function) {
        double[] transformedArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            transformedArray[i] = function.applyAsDouble(array[i]);
        }
        return transformedArray;
    }
}
