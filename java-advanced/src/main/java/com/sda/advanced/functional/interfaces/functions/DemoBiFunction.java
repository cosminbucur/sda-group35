package com.sda.advanced.functional.interfaces.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class DemoBiFunction {

    public static void main(String[] args) {
        // employees

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Anna", 30000);
        salaries.put("Rachel", 70000);

        // increase salaries for all except john 10000

        BiFunction<String, Integer, Integer> biFunction =
                (name, salary) -> {
                    if (!name.equals("John")) {
                        salary += 10000;
                    }
                    return salary;
                };

        BiFunction<String, Integer, Integer> biFunction2 =
        (name, salary) -> {
//            return !name.equals("John") ? salary += 10000 : salary;
            return name.equals("John") ? salary : salary + 10000;
        };

        BiFunction<String, Integer, Integer> biFunction3 =
        (name, salary) -> name.equals("John") ? salary : salary + 10000;

        // increase all except john's salary
        salaries.replaceAll(biFunction3);

        // print map elements
        salaries.forEach((name, salary) -> System.out.println(name + ": " + salary));
    }
}
