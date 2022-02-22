package com.sda.advanced.concurrency.how;

public class DemoStopThread {

    public static void main(String[] args) {
        // main thread
        System.out.println(Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.start();

        try {
            // put main thread to sleep
            Thread.sleep(100);
            // run my thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // this will stop the thread
        myThread.stopRunning();
    }
}
