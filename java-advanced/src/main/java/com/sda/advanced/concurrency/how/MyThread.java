package com.sda.advanced.concurrency.how;

// worker
public class MyThread extends Thread {

    private volatile boolean flag = true;

    public void stopRunning() {
        flag = false;
    }

    // the task
    @Override
    public void run() {
        // print thread name
        System.out.println(Thread.currentThread().getName());

        while (flag) {
            System.out.println("I am running...");
        }
        System.out.println("stopped running");
    }
}
