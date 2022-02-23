package com.sda.advanced.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoFutureAndCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // call async method, get value from future

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> asyncTask = () -> {
            System.out.println("in async task");
            Thread.sleep(2000);
            return 20;
        };

        System.out.println("submit async task");
        Future<Integer> resultFromFuture = executorService.submit(asyncTask);

        System.out.println("do something else while callable is getting executed");

        System.out.println("retrieve the result from the future");
        Integer result = resultFromFuture.get();
        System.out.println(result);

        executorService.shutdown();
    }
}
