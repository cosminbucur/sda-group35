package com.sda.advanced.functional.lambda.oneparam;

public class DemoOneParam {

    public static void main(String[] args) {
        // interface = (input) -> { body }

        // add 5 to any number
        OneParam oneParam = (number) -> 5 + number;
        int result = oneParam.doSomething(2);
        System.out.println(result);
    }
}
