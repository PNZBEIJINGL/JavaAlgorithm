package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1039 到底买不买 (20 分)
 * ppRYYGrrYBR2258
 * YrR8RrY
 * Yes 8
 *
 * ppRYYGrrYB225
 * YrR8RrY
 * No 2
 */
public class Q1039 {
    /**
     * 思路：定义数组，数据的下标i的 值等于字符的ASC码；数组值是字符出现的次数，然后比较
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char[] all = s.next().toCharArray();
        char[] need = s.next().toCharArray();

        //一定长度的数据ASC吗为数组下标,数据内容是字符穿线次数
        int[] allASCII = new int[96 + 26 + 1];
        int[] needASCII = new int[96 + 26 + 1];
        for (int i = 0; i < all.length; i++) {
            allASCII[Integer.valueOf(all[i])]++;
        }
        for (int i = 0; i < need.length; i++) {
            needASCII[Integer.valueOf(need[i])]++;
        }

        //判断是否足够
        int num = 0;
        boolean enough = true;
        for (int i = 0; i < needASCII.length; i++) {
            if (needASCII[i] != 0) {
                if (needASCII[i] > allASCII[i]) {
                    num = num + (needASCII[i] - allASCII[i]);
                    enough = false;
                }
            }
        }
        if (enough) {
            //足够时，差值为多的数量
            System.out.println("Yes " + (all.length - need.length));
        } else {
            //不足时，使用累计的数量
            System.out.println("No " + num);
        }
    }
}
