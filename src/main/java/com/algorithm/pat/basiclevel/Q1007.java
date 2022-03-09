package com.algorithm.pat.basiclevel;

import java.util.Scanner;

/**
 * 让我们定义dn为：d​n​​ =pn+1−p​n，其中p​i​​ 是第i个素数。显然有d​1​​ =1，且对于n>1有dn是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
 * 现给定任意正整数N(<105)，请计算不超过N的满足猜想的素数对的个数。
 *
 * 输入格式:
 * 输入在一行给出正整数N。
 * 输出格式:
 * 在一行中输出不超过N的满足猜想的素数对的个数。
 */

public class Q1007 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int[] primes=new int[number];
        int j=0;
        int count=0;
        for(int i=1;i<=number;i++){
            if(isPrime(i)){
                primes[j++]=i;
            }
        }
        for(int i=0;i<j-1;i++){
            int d=primes[i+1]-primes[i];
            if(d==2){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int i){
        if(i<=2){
            return true;
        }
        for(int j=2;j<=(int)Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
