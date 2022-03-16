package com.pat.basiclevel;

import java.util.Scanner;

/*
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
输入：每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10​100
输出：在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格
 */
public class Q1002 {

    /**
     *思路：固定值定义为数组，下标为数字，值为对应的中文
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = 0;
        char[] num = input.toCharArray();
        for (int i = 0; i < num.length ; i++) {
            sum = sum + Integer.parseInt(num[i]+"");
        }
        String[] sign = new String[]{"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};

        char[] result = new StringBuffer("" + sum).toString().toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) {
                System.out.print(sign[Integer.parseInt(""+result[i])] +" ");
            } else {
                System.out.print(sign[Integer.parseInt(""+result[i])] );
            }
        }

    }
}
