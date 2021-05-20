package com.algorithm.number;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();

        int[] counts = new int[300];
        for (int i=0; i<inputString.length(); ++i) {
            char ch = inputString.charAt(i);
            if (ch>='a'&&ch<='z') {
                counts[ch]++;
            }
            //0-9的ASCII值是48-57
            if(ch>='0'&&ch<='9'){
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
        int maxnum = 0;
        char resultnum = 0;
        for (char ch='9'; ch>='0'; --ch) {
            if (counts[ch]>maxnum) {
                maxnum = counts[ch];
                resultnum = ch;
            }
        }
        System.out.println(resultChar+" "+maxCount);
        System.out.println(resultnum+" "+maxnum);

    }

}
