package com.sda.advanced.concurrency.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoDone {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "hello from callable";
        });

        while (!future.isDone()) {
            System.out.println("task is still running...");
            Thread.sleep(200);
        }

        System.out.println("task completed, retrieving the result");
        String result = future.get();
        System.out.println(result);

        executorService.shutdown();
    }
}
