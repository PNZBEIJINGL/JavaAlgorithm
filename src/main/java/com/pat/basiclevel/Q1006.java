package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1006 换个格式输出整数
 * 让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10）
 * 换个格式来输出任一个不超过 3 位的正整数。例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 *
 * 输入：每个测试输入包含 1 个测试用例，给出正整数 n（<1000） 例如：234
 * 输出：每个测试用例的输出占一行，用规定的格式输出 n 例如：BBSSS1234
 *
 */
public class Q1006 {
    public static void main(String[] args) {

        int[] sign = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = (num % 100) % 10;
        int b = (num % 100) / 10;
        int c = num / 100;

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < c; i++) {
            sbf.append("B");
        }

        for (int i = 0; i < b; i++) {
            sbf.append("S");
        }


        for (int i = 0; i < a; i++) {
            sbf.append(sign[i]);
        }

        System.out.println(sbf.toString());
    }
}
