package com.pat.basiclevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *  1017 A除以B
 * 本题要求计算 A/B，其中 A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立
 * 输入在一行中依次给出 A 和 B，中间以 1 空格分隔。
 * 在一行中依次输出 Q 和 R，中间以 1 空格分隔。
 */
public class Q1017 {

    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String[] line=sc.readLine().split(" ");

        //类的取值范围原则上是没有上限的，取决于你的计算机的内存
        BigInteger A=new BigInteger(line[0]);
        BigInteger B=new BigInteger(line[1]);

        //BigInteger#divideAndRemainder返回商和余数数组
        BigInteger[] result=A.divideAndRemainder(B);
        System.out.println(result[0]+" "+result[1]);

    }
}
