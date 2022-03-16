package com.pat.basiclevel;

import java.util.Scanner;

/**
 * 1009 说反话
 * 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 * 输入：测试输入包含一个测试用例，在一行内给出总长度不超过 80 的字符串。字符串由若干单词和若干空格组成，
 * 其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用 1 个空格分开，输入保证句子末尾没有多余的空格。
 * 输出：每个测试用例的输出占一行，输出倒序后的句子。
 */
public class Q1009 {
    /**
     * 思路：字符串转数组倒叙打印
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
