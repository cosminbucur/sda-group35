package com.sda.advanced.concurrency.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoScheduledExecutorFixedRate {

    public static void main(String[] args) {
        // create executor service
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // create task
        Runnable task = () -> {
            System.out.println("Executing task at " + System.nanoTime());
        };

        // submit / schedule
        scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

    }
}
