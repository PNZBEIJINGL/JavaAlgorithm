package com.algorithm.number;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (n = 5; n <= m; n++) {
            if (isPalindrome(n) && isPrime(n)) {
                System.out.println(n);
            }

        }
    }

    private static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        String pal = palindrome(str);
        return str.equals(pal);
    }

    private static String palindrome(String str) {
        char[] a = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            builder.append(a[i]);
        }
        return builder.toString();
    }

    public static boolean isPrime(int i) {
        if (i <= 2) {
            return true;
        }
        for (int j = 2; j <= (int) Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
