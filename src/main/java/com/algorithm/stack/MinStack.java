package com.algorithm.stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> minStack = new Stack<Integer>();
    private Stack<Integer> stack = new Stack<Integer>();

    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    public void push(int num) {
        if (minStack.size() <= 0) {
            minStack.push(num);
            return;
        }
        Integer min = minStack.lastElement();
        if (num < min) {
            minStack.push(num);
        } else {
            minStack.push(min);
        }
        stack.push(num);
    }

    public int min() {
        if (minStack.size() <= 0) {
            return -1;
        }
        return minStack.lastElement();
    }
}
