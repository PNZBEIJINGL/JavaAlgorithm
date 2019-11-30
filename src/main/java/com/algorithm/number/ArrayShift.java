package com.algorithm.number;

import java.util.Scanner;

/**
 * 1008 数组元素循环右移问题\
 * 输入：每个输入包含一个测试用例，第1行输入N（1≤N≤100）和M（≥0）；第2行输入N个整数，之间用空格分隔。
 * 输出：在一行中输出循环右移M位以后的整数序列，之间用空格分隔，序列结尾不能有多余空格。例如：
 * 例如：
 * 6 2
 * 1 2 3 4 5 6
 * 5 6 1 2 3 4
 */
public class ArrayShift {

    //6 2
    //1 2 3 4 5 6

    //1 2 1 4 5 6  3
    //3 4 1 2 5 6
    //3 4 1 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        int temp;
        int s = b % a;
        for (int i = 0; i < array.length; i++) {

        }

        System.out.println(a);
    }
}
