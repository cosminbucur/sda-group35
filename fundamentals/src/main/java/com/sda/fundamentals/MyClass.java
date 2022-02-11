package com.sda.fundamentals;

public class MyClass {

    // int = data type
    // number = variable name
    // 2 = value;
    int number = 2;

    // getLetterCount = method name
    // int = return type
    // { } = method body
    // String = parameter type
    // input = param name
    // int getLetterCount(String input) = method signature
    int getLetterCount(String input) {
        // transform input
        int length = input.length();

        // return result
        return length;
    }
}
