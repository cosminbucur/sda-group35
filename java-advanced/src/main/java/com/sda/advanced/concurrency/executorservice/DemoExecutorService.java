package com.sda.advanced.concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService {

    public static void main(String[] args) {
        System.out.println("Inside: " + Thread.currentThread().getName());

        // create threads
        System.out.println("Create Executor service...");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating tasks");
        Runnable task = () -> System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Submit the specified task to the executor service");
        executorService.submit(task);

        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}
