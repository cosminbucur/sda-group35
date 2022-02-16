package com.sda.advanced.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {
        // create queue
        Queue<Integer> numbers = new PriorityQueue<>();

        // add numbers from 1 to 6 to queue
        for (int i = 0; i <= 6; i = i + 2) {
            // if number is even
            // add to queue
            numbers.add(i);
        }

        // display queue elements
        System.out.println("elements from queue " + numbers);

        // iterate queue with enhanced for
        // element : collection
        for (int number : numbers) {
            System.out.println(number);
        }

        Integer head = numbers.peek();  // 0
        System.out.println("head of queue is " + head);

        Integer firstProcessedElement = numbers.poll();

        numbers.size();
    }
}
