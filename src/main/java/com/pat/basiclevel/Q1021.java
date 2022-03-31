package com.pat.basiclevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1021 个位数统计
 * 请编写程序统计每种不同的个位数字出现的次数。例如：给定 N=100311，则有 2 个 0，3 个 1，和 1 个 3
 * 每个输入包含 1 个测试用例，即一个不超过 1000 位的正整数 N。
 * 对 N 中每一种不同的个位数字，以 D:M 的格式在一行中输出该位数字 D 及其在 N 中出现的次数 M。要求按 D 的升序输出
 * 100311
 * <p>
 * 0:2
 * 1:3
 * 3:1
 */
public class Q1021 {
    /**
     * 思路
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] input = bf.readLine().toCharArray();
        int[] asc_array = new int[10];
        for (int i = 0; i < input.length; i++) {
            int asc = (int) input[i] - 48;
            if (asc >= 0 && asc <= 9) {
                asc_array[asc] = asc_array[asc] + 1;
            }
        }
        for (int i = 0; i < asc_array.length; i++) {
            if(asc_array[i]>0){
                System.out.println(i+":"+asc_array[i]);
            }
        }
    }
}
