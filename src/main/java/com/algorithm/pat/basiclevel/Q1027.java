package com.algorithm.pat.basiclevel;

import java.util.Scanner;

public class Q1027 {
    //https://pintia.cn/problem-sets/994805260223102976/problems/994805294251491328
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
