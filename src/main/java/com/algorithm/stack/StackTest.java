package com.algorithm.stack;

public class StackTest {

    //自定义栈，min函数得到当前最小值
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        System.out.println(ms.min());
        ms.push(6);
        ms.push(2);
        ms.push(1);
        System.out.println(ms.min());
        ms.pop();
        System.out.println(ms.min());
        ms.pop();
        System.out.println(ms.min());
    }
}
