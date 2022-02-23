package com.sda.advanced.concurrency.callable;

import java.util.concurrent.Callable;

public class DemoCallable {

    public static void main(String[] args) {
        // interface = implementation
        Callable<String> asyncTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                // long operation
                Thread.sleep(2000);

                return "some result";
            }
        };

        Callable<String> shortAsyncTask = () -> {
            Thread.sleep(2000);
            return "some result";
        };
    }
}
