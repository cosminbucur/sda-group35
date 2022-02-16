package com.sda.advanced.functional.lambda.twoparam;

import java.util.ArrayList;

public class DemoTwoParam {

    public static void main(String[] args) {
        // interface = (input) -> { body }
        // interface = implementation
        TwoParam twoParam = (string1, string2) -> {
            // concatenate strings and transform to uppercase
            return string1.concat(string2).toUpperCase();
        };
        String result = twoParam.doSomething("paul", "ana");
        System.out.println(result);
    }
}
