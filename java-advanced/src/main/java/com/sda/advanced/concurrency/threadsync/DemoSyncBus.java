package com.sda.advanced.concurrency.threadsync;

public class DemoSyncBus {

    public static void main(String[] args) {
        BusReservation task = new BusReservation();
        PassengerThread ana = new PassengerThread(task, "Ana", 2);
        PassengerThread alex = new PassengerThread(task, "Alex", 2);
        ana.start();
        alex.start();
    }
}
