package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1056 组合数的和 (15 分)
 * 给定 N 个非 0 的个位数字，用其中任意 2 个数字都可以组合成 1 个 2 位的数字。要求所有可能组合出来的 2 位数字的和。例如给定 2、5、8，则可以组合出：25、28、52、58、82、85，它们的和为330。
 * 输入在一行中先给出 N（1 < N < 10），随后给出 N 个不同的非 0 个位数字。数字间以空格分隔。
 * 输出所有可能组合出来的2位数字的和。
 * 3 2 8 5
 * 330
 */
public class Q1056 {
    /**
     * 思路：嵌套循环
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j != i)
                    ans += arr[i]*10 + arr[j];
            }
        }
        System.out.println(ans);
    }

}
