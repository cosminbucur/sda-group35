package com.sda.advanced.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

    // sort a list of cars using comparable by year of fabrication
    public static void main(String[] args) {
        // create a list
        List<Car> carList = new ArrayList<>();
        Car audi = new Car(2018);
        Car dacia = new Car(2019);
        Car bmw = new Car(2017);

        // var 1
        carList.add(audi);
        carList.add(dacia);
        carList.add(bmw);

        // var 2
//        List.of(audi, dacia, bmw);

        // use compareTo()
        int result = audi.compareTo(dacia);
        System.out.println(result); // -1

        // sort cars
        // utility class
        for (Car car : carList) {
            System.out.println(car);
        }

        Collections.sort(carList);

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
