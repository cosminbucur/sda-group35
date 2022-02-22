package com.sda.advanced.concurrency.threadsync;

public class BusReservation implements Runnable {

    // resource
    private int availableSeats = 2;

    @Override
    public void run() {
        PassengerThread passengerThread = (PassengerThread) Thread.currentThread();
        boolean ticketsBooked = bookTickets(passengerThread.getSeatsNeeded());

        if (ticketsBooked) {
            System.out.println("OK " + Thread.currentThread().getName() + ". Reservation complete!");
        } else {
            System.out.println("Sorry " + Thread.currentThread().getName() + ", "
                    + passengerThread.getSeatsNeeded() + " seats are not available");
        }
    }

    // only one thread can access this method
    private synchronized boolean bookTickets(int seats) {
        System.out.println("Welcome: " + Thread.currentThread().getName() + "! There are "
        + this.availableSeats + " available seats");

        if (seats > this.availableSeats) {
            return false;
        } else {
            this.availableSeats = this.availableSeats - seats;
            return true;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
