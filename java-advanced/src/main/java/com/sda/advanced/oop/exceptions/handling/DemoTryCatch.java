package com.sda.advanced.oop.exceptions.handling;

public class DemoTryCatch {

    public static void main(String[] args) {
        tryCatch();

        tryCatchMultiple();
    }

    private static void tryCatch() {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("handle arithmetic exception");
        } catch (Exception e) {
            System.out.println("handle any other exception");
        } finally {
            System.out.println("runs every time");
        }
    }

    private static void tryCatchMultiple() {
        int[] intArray = {3, 6, 4};
        int y = 2;

        try {
            int x = intArray[4] / y;
        } catch (ArithmeticException e) {
            System.out.println("handle arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("handle ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("handle any other exception");
        }
    }
}
