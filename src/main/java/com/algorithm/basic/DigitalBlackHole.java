package com.algorithm.basic;

import java.util.Scanner;

/**
 * 给定任一个各位数字不完全相同的 4 位正整数，如果我们先把 4 个数字按非递增排序，再按非递减排序，
 * 然后用第 1 个数字减第 2 个数字，将得到一个新的数字。一直重复这样做，
 * 我们很快会停在有“数字黑洞”之称的 6174，这个神奇的数字也叫 Kaprekar 常数。
 */
public class DigitalBlackHole {

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
        if (a.length() != 4) {
            int b = 4 - a.length();
            for (int i = 0; i < b; i++) {
                a = "0" + a;
            }
        }
        char[] arr = a.toCharArray();
        String result = "";
        while (!result.equals("6167")) {
            result = String.valueOf(Integer.parseInt(desc(arr))
                    - Integer.parseInt(asc(arr)));
            if (result.length() != 4) {
                int b = 4 - result.length();
                for (int i = 0; i < b; i++) {
                    result = "0" + result;
                }
            }
            if (result.equals("6167")) {
                System.out.print(desc(arr) + " - " + asc(arr) + " = " + result);
                arr = result.toCharArray();
            } else {
                System.out.println(desc(arr) + " - " + asc(arr) + " = " + result);
                arr = result.toCharArray();
                if (result.equals("0000")) {
                    break;
                }
            }
        }
    }

    // 递增排序
    public static String asc(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return String.valueOf(arr);
    }

    // 递减排序
    public static String desc(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return String.valueOf(arr);
    }
}
