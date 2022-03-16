package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 请编写程序，找出一段给定文字中出现最频繁的那个英文字母
 * 输入在一行中给出一个长度不超过 1000 的字符串。字符串由 ASCII 码表中任意可见字符及空格组成，至少包含 1 个英文字母，以回车结束（回车不算在内）。
 * 在一行中输出出现频率最高的那个英文字母及其出现次数，其间以空格分隔。如果有并列，则输出按字母序最小的那个字母。统计时不区分大小写，输出小写字母。
 * INPUT: This is a simple TEST.  There ARE numbers and other symbols 1&2&3...........
 * OUTPUT:e 7
 */
public class Q1042 {
    /**
     * 思路：定义数组记录出现次数，数组下标为字符 ASC码
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        int[] counts = new int[300];
        for (int i=0; i<inputString.length(); ++i) {
            char ch = inputString.charAt(i);
            if (ch>='a'&&ch<='z') {
                counts[ch]++;
            }
        }
        int maxCount = 0;
        char resultChar = 0;
        for (char ch='a'; ch<='z'; ++ch) {
            if (counts[ch]>maxCount) {
                maxCount = counts[ch];
                resultChar = ch;
            }
        }
        System.out.println(resultChar+" "+maxCount);
    }
}
