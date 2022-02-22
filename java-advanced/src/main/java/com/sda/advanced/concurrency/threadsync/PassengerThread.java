package com.sda.advanced.concurrency.threadsync;

public class PassengerThread extends Thread {

    private int seatsNeeded;

    public PassengerThread(Runnable runnable, String threadName, int seatsNeeded) {
        super(runnable, threadName);
        this.seatsNeeded = seatsNeeded;
    }

    public int getSeatsNeeded() {
        return seatsNeeded;
    }
}
