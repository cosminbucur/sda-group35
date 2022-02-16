package com.sda.advanced.collections.comparable;

public class Car implements Comparable<Car> {

    private int fabricationYear;

    public Car(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    // 0 = equals
    // 1 = greater
    // -1 = smaller
    @Override
    public int compareTo(Car otherCar) {
        // 2 - 3 => -1
        // 3 - 3 => 0
        // 4 - 3 => 1
        // 5 - 7 => 2
        return this.fabricationYear - otherCar.fabricationYear;
    }

    // long way
//    public int compareTo(Car otherCar) {
//        if (this.fabricationYear > otherCar.fabricationYear) {
//            return 1;
//        } else if (this.fabricationYear == otherCar.fabricationYear) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fabricationYear=" + fabricationYear +
                '}';
    }
}
