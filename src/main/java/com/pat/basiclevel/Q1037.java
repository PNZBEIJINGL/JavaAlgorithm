package com.pat.basiclevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1037 在霍格沃茨找零钱
 * Galleon=17 Sickle
 * Sickle=29 Knut
 */
public class Q1037 {
    /**
     * 思路： 按照规则转换
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");
        System.out.println(getback(getSum(inputString[1]) - getSum(inputString[0])));
    }

    private static String getback(int num) {
        if (num < 0) {
            System.out.print("-");
            num = -num;
        }
        int galleon = num / (17 * 29);
        int sickle = (num % (17 * 29)) / 29;
        int knut = (num % (17 * 29)) % 29;
        return "" + galleon + "." + sickle + "." + knut;

    }

    private static int getSum(String str) {
        String[] p = str.split("\\.");
        return Integer.parseInt(p[0]) * 17 * 29 + Integer.parseInt(p[1]) * 29 + Integer.parseInt(p[2]);
    }
}
