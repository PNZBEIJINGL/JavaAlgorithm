package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1067 试密码 (20 分)
 * 输入在第一行给出一个密码（长度不超过 20 的、不包含空格、Tab、回车的非空字符串）和一个正整数 N（≤ 10），分别是正确的密码和系统允许尝试的次数。随后每行给出一个以回车结束的非空字符串，是用户尝试输入的密码。输入保证至少有一次尝试。当读到一行只有单个 # 字符时，输入结束，并且这一行不是用户的输入。
 * Correct%pw 3
 * correct%pw
 * Correct@PW
 * whatisthepassword!
 * Correct%pw
 * #
 * 对用户的每个输入，如果是正确的密码且尝试次数不超过 N，则在一行中输出 Welcome in，并结束程序；如果是错误的，则在一行中按格式输出 Wrong password: 用户输入的错误密码；当错误尝试达到 N 次时，再输出一行 Account locked，并结束程序。
 * Wrong password: correct%pw
 * Wrong password: Correct@PW
 * Wrong password: whatisthepassword!
 * Account locked
 */
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
