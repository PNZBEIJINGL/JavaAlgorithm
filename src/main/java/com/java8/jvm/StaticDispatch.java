package com.java8.jvm;

public class StaticDispatch {

    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }

    public void sayHello(Human guy) {
        System.out.println("hello,guy！");
    }

    public void sayHello(Man guy) {
        System.out.println("hello,gentleman！");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello,lady！");
    }

    public static void main(String[] args) {
        //概念Human静态类型或外观类型  , Man 实际类型
        //静态类型编译器可知, 实际类型是运行期才可知
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);

        //实际类型变化
        Human man2 = new Man();
        Human woman2 = new Woman();
        sr.sayHello((Man) man2);
        sr.sayHello((Woman) woman2);
    }

}
