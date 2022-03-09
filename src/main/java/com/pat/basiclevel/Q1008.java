package com.pat.basiclevel;

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
public class Q1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int length = Integer.parseInt(str.split(" ")[1]);
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        length = length % arr.length;
        for (int i = arr.length - length; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = length; i < arr.length; i++) {
            if(i!=arr.length-1){
                System.out.print(arr[i - length] + " ");
            }else{
                System.out.print(arr[i - length]);
            }
        }

    }

}
