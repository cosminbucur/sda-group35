package com.sda.advanced.functional.lambda.noparam;

public class DemoNoParam {

    public static void main(String[] args) {
        // interface = (input) -> { body }
        NoParam noParam = () -> {
            return "some string";
        };

        NoParam noParamSimple = () -> "some string";

        String result = noParam.doSomething();
        System.out.println(result);
    }
}
