package com.sda.advanced.collections.stack;

import java.util.List;
import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        // STACK
        // first in, last out
        // add numbers to a stack

        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(1);
        stack.push(3);
        // 2 1 3
        stack.size();   // 3
        stack.pop();
        stack.size();   // 2
        // 2 1
        stack.empty();
        // false

        stack.peek();
        stack.size();   // 2

        stack.search(1);
        stack.search(4);
    }

}
