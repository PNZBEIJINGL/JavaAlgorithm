package com.algorithm.string;

import java.nio.charset.Charset;

public class BaTest {

    public static void main(String[] args) {

        String cc="中";
        System.out.println(cc.getBytes().length);
        System.out.println(Charset.defaultCharset());
        System.out.println(cc.getBytes());
        System.out.println(cc.charAt(0));
    }
}
