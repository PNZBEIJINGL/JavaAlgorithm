package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1022 D进制的A+B (20 分)
 * 输入两个非负 10 进制整数 A 和 B (≤2#30−1)，输出 A+B 的 D (1<D≤10)进制数。
 * 输入格式：输入在一行中依次给出 3 个整数 A、B 和 D。
 * 输出格式：输出 A+B 的 D 进制数。
 *
 */
public class Q1022 {

    /**
     * 思路,直接使用Integer#toString对象已有方法,第一个参数数字， 第二个参数进制数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanne=new Scanner(System.in);
        int A=scanne.nextInt();
        int B=scanne.nextInt();
        int D=scanne.nextInt();
        System.out.print(Integer.toString(A+B,D));
    }
}
