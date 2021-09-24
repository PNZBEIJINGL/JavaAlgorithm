package com.jvm.gc;

public class Overload {

    public static void sayHello(Object arg) {
        System.out.println("hello object;"+arg);
    }
    /*
    public static void sayHello(int arg) {
        System.out.println("hello int:"+arg);
    }


    public static void sayHello(char arg) {
        System.out.println("hello char:"+arg);
    }
    */

    public static void main(String[] args) {
        sayHello('a');
    }
}
