package com.java8.jvm;

/**
 * 第二章：引用计数算法的缺陷
 * 引用计数算法（Reference Counting）给对象中添加一个引用计数器，每当有一个地方引用它时，计数器值就加1；当引用失效时，计数器值就减1；任何时刻计数器为0的对象就是不可能再被使用的
 */
public class ReferenceConuntingGC {
    public Object instance = null;
    private static final int int1MB = 1024 * 1024;
    /**
     * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2 * int1MB];

    public static void main(String[] args) {


        ReferenceConuntingGC objA = new ReferenceConuntingGC();
        ReferenceConuntingGC objB = new ReferenceConuntingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        //假设在这行发生GC,objA和objB是否能被回收？
        System.gc();
    }

}
