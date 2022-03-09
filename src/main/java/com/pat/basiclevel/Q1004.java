package com.pat.basiclevel;

/*
3
Joe Math990112 89
Mike CS991301 100
Mary EE990830 95
*/

import java.util.Scanner;

public class Q1004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String first = null;
        int firstscore = 0;
        String last = null;
        int lastscore = 100;

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            String[] arr=str.split(" ");
            int score = Integer.parseInt(arr[2]);
            if (firstscore <= score) {
                first =arr[0]+" "+arr[1];
                firstscore = score;
            }
            if (lastscore >= score) {
                last = arr[0]+" "+arr[1];;
                lastscore = score;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}
