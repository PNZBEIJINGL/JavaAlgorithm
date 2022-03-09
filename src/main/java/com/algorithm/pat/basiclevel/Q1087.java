package com.algorithm.pat.basiclevel;

import java.util.Scanner;

public class Q1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = N;
        for (int i = 2; i <= N; ++i) {						// 从2开始
            if (0 != i % 2 && 0 != i % 3 && 0 != i % 5) {	// 不是2,3,5的倍数
                result -= 1;									// 个数减1
            }
        }
        System.out.println(result);
    }
}
