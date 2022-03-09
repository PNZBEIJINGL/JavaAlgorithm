package com.pat.basiclevel;

import java.util.Scanner;

public class Q1067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        String pwd = s[0];
        int N = Integer.parseInt(s[1]);
        int count = 1;
        String s2 = sc.nextLine();
        while((s2.equals("#")==false)){
            if (s2.equals(pwd)) {
                System.out.println("Welcome in");
                break;
            }else {
                System.out.println("Wrong password: "+s2);
                if (count==N) {
                    System.out.println("Account locked");
                    break;
                }
            }
            s2=sc.nextLine();
            count++;
        }
    }

}
