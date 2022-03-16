package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1027 打印沙漏
 * 本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 输入在一行给出1个正整数N（≤1000）和一个符号，中间以空格分隔
 * 例如： 19 *
 * 首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。
 * 例如：
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 2
 */
public class Q1027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split("\\s+");
        int count = Integer.parseInt(strings[0]);
        int n = (int) Math.sqrt((count + 1) / 2.0);
        int items = 1 + (n - 1) * 2, bottomSpace = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
                bottomSpace = j;
            }
            for (int k = 1; k <= items; ++k) {
                System.out.print(strings[1]);
            }
            items = items - 2;
            System.out.println();
        }
        int bottomItems = 3;
        for (int i = 1; i < n; ++i) {
            for (int j = 1; j <= bottomSpace; ++j) {
                System.out.print(" ");
            }
            --bottomSpace;
            for (int k = 0; k < bottomItems; ++k) {
                System.out.print(strings[1]);
            }
            bottomItems += 2;
            System.out.println();
        }
        System.out.println(count - (n * n * 2 - 1));

    }

}
