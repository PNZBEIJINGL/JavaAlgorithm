package com.pat.basiclevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1040 有几个PAT
 * 输入格式：输入只有一行，包含一个字符串，长度不超过10的5次方
 * 输出格式：在一行中输出给定字符串中包含多少个 PAT。由于结果可能比较大，只输出对 1000000007 取余数的结果。
 *
 */
public class Q1040 {
    /**
     * 思路， PAT 三个字母， A前P的数量N 和A后T的数量M ，M*N 通过A可以组成的PAT数量
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();

        //先统计字符串中T的个数
        int t_count = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'T')
                t_count++;
        }

        int p_count = 0;
        int result = 0;
        for (int i = 0; i < len; i++) {
            //遇到大P，P的个数+1
            if (str.charAt(i) == 'P') {
                p_count++;
            }
            //遇到大T，T的个数-1
            if (str.charAt(i) == 'T') {
                t_count--;
            }
            //遇到大A，计算当前PAT的个数+之前PAT的个数
            if (str.charAt(i) == 'A') {
                result = (result + (p_count * t_count) % 1000000007) % 1000000007;
            }
        }
        System.out.println(result);

    }
}
