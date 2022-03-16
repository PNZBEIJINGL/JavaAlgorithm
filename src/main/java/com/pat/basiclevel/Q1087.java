package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1087 有多少不同的值 (20 分)
 * 当自然数 n 依次取 1、2、3、……、N 时，算式 ⌊n/2⌋+⌊n/3⌋+⌊n/5⌋ 有多少个不同的值？（注：⌊x⌋ 为取整函数，表示不超过 x 的最大自然数，即 x 的整数部分。）
 *  输入给出一个正整数 N（2≤N≤10#4）
 *  在一行中输出题面中算式取到的不同值的个数。
 *
 *  2017
 *  1480
 */
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
