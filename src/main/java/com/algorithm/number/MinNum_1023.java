package com.algorithm.number;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定数字 0-9 各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
 * 目标是使得最后得到的数尽可能小（注意 0 不能做首位）。
 * 例如：给定两个 0，两个 1，三个 5，一个 8，
 * 我们得到的最小的数就是 10015558。
 * <p>
 * 输入：2 2 0 0 0 3 0 0 1 0
 * 输出：10015558
 * <p>
 * 现给定数字，请编写程序输出能够组成的最小的数。
 */
public class MinNum_1023 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = bf.readLine().split(" ");

        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(buf[i]);
        }


        StringBuilder sb = new StringBuilder("");
        //找到最小的非0数字，放第一位然后个数减1
        for (int i = 1; i < 10; i++) {//第一次遍历
            if (nums[i] != 0) {
                nums[i]--;//个数减一
                sb.append(i);
                break;
            }
        }

        //其他数排序
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < nums[i]; j++) {
                sb.append(i);
            }
        }
        System.out.println(sb);//输出结果


    }

}
