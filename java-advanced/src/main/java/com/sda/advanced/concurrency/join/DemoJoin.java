package com.sda.advanced.concurrency.join;

public class DemoJoin {

    public static Thread t1;
    public static Thread t2;

    public static void main(String[] args) {
        JoinThreads task = new JoinThreads();
        t1 = new Thread(task, "T1");
        t2 = new Thread(task, "T2");
        t1.start();
    }
}
