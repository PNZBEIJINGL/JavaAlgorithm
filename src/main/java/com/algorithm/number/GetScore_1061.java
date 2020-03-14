package com.algorithm.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入在第一行给出两个不超过 100 的正整数 N 和 M，分别是学生人数和判断题数量。
 * 第二行给出 M 个不超过 5 的正整数，是每道题的满分值。
 * 第三行给出每道题对应的正确答案，0 代表“非”，1 代表“是”。随后 N 行，每行给出一个学生的解答。数字间均以空格分隔。
 */
public class GetScore_1061 {


    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String[] line=sc.readLine().split(" ");
        int row=Integer.parseInt(line[0]);
        int clu=Integer.parseInt(line[1]);


        String[] score=sc.readLine().split(" ");
        String[] result=sc.readLine().split(" ");


        int[] total=new int[row];
        for(int i=0;i<row;i++){
            String[] input=sc.readLine().split(" ");
            for(int j=0;j<clu;j++){
                if(input[j].equals(result[j])){
                    total[i]=total[i]+Integer.parseInt(score[j]);

                }
            }

        }

        for (int i=0;i<total.length;i++){
            System.out.println(total[i]);
        }

    }
}
