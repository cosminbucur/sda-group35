package com.sda.advanced.concurrency.runnable;

import java.util.Arrays;
import java.util.List;

public class DemoRunnable {

    public static void main(String[] args) {
        // task
        Runnable task = () -> System.out.println("running");

        // worker
        Thread worker = new Thread(task);

        final List<String> names = Arrays.asList("paul", "ana");
        Runnable printNames = () -> {
            System.out.println("hello from runnable");
            names.forEach(name -> System.out.println(name));
        };
        Thread worker2 = new Thread(printNames);

        worker.start();
        worker2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
