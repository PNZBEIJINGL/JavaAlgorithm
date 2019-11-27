package com.algorithm.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定任一个各位数字不完全相同的 4 位正整数，如果我们先把 4 个数字按非递增排序，再按非递减排序，
 * 然后用第 1 个数字减第 2 个数字，将得到一个新的数字。一直重复这样做，
 * 我们很快会停在有“数字黑洞”之称的 6174，这个神奇的数字也叫 Kaprekar 常数。
 */
public class DigitalBlackHole_1019 {

    /*     7766 - 6677 = 1089
            9810 - 0189 = 9621
            9621 - 1269 = 8352
            8532 - 2358 = 6174
            7641 - 1467 = 6174
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        in.close();
        a = fill(a);
        char[] arr = a.toCharArray();
        String result = "";
        while (!result.equals("6174")) {
            String y=asc(arr);
            String x=desc(y.toCharArray());
            result = String.valueOf(Integer.parseInt(x)- Integer.parseInt(y));
            result = fill(result);
            if (result.equals("6174")) {
                System.out.print(x + " - " + y + " = " + result);
                arr = result.toCharArray();
            } else {
                System.out.println(x + " - " + y + " = "+ result);
                arr = result.toCharArray();
                if (result.equals("0000")) {
                    break;
                }
            }
        }

    }

    private static String fill(String a) {
        if (a.length() != 4) {
            int b = 4 - a.length();
            for (int i = 0; i < b; i++) {
                a = "0" + a;
            }
        }
        return a;
    }

    public static String asc(char[] arr) {
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public static String desc(char[] arg) {
        char[] bc = new char[4];
        for (int i = arg.length - 1; i >= 0; i--) {
            bc[arg.length - i - 1] = arg[i];
        }
        return String.valueOf(bc);
    }
}
