package com.sda.advanced.concurrency.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCancel {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // cancel task if is longer than 1 second
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // compute time before
        long startTime = System.nanoTime();
        Future<String> future = executorService.submit(() -> {
           Thread.sleep(2000);
           return "hello from async task";
        });

        // compute time after
        while (!future.isDone()) {
            System.out.println("task is not done yet...");
            Thread.sleep(3000);

            long elapsedTime = System.nanoTime() - startTime / 1_000_000_000;
            // if longer than 1 second => cancel
            if (elapsedTime > 1) {
                future.cancel(true);
            }
        }

        if (future.isCancelled()) {
            System.out.println("task was cancelled");
        } else {
            String result = future.get();
            System.out.println(result);
        }

        executorService.shutdown();
    }
}
