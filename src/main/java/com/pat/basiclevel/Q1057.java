package com.pat.basiclevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1057 数零壹 (20 分)
 * 给定一串长度不超过 10​5​​ 的字符串，本题要求你将其中所有英文字母的序号（字母 a-z 对应序号 1-26，不分大小写）相加，
 * 得到整数 N，然后再分析一下 N 的二进制表示中有多少 0、多少 1。
 * 例如给定字符串 PAT (Basic)，其字母序号之和为：16+1+20+2+1+19+9+3=71，而 71 的二进制是 1000111，即有 3 个 0、4 个 1。
 */
public class Q1057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replaceAll("[^a-zA-Z]", "");
        char[] letter = str.toUpperCase().toCharArray();

        int sum = letter.length * (-64);
        for (int i = 0; i < letter.length; ++i) {
            sum += letter[i];
        }

        if (0 == sum) {
            System.out.println(0 + " " + 0);
        } else {
            String bs = Integer.toBinaryString(sum);
            int zeroNum = bs.replaceAll("1", "").length();
            System.out.println(zeroNum + " " + (bs.length() - zeroNum));
        }
    }
}
