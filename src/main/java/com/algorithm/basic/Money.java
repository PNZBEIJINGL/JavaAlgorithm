package com.algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入一个整数（位数不超过9位）代表一个人民币值（单位为元），请转换成财务要求的大写中文格式。如23108元，转换后变成“贰万叁仟壹百零捌”元。
 * 为了简化输出，用小写英文字母a-j顺序代表大写数字0-9，用S、B、Q、W、Y分别代表拾、百、仟、万、亿。于是23108元应被转换输出为“cWdQbBai”元。
 */
public class Money {
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        String number = "abcdefghij";// 0-9
        String zi = "SBQWY"; // S、B、Q、W、Y分别代表 拾、百、仟、万、亿
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // 6900 -gQjB 813227345 iYbQdBcScWhQdBeSf

        StringBuffer sbf = new StringBuffer();
        int length = input.length();
        if (length == 1) {
            sbf.append(number.charAt(Integer.parseInt(input)));
        }
        if (length>1&&input.length() <= 9) {
            for (char c : input.toCharArray()) {
                if (c!='0') {
                    sbf.append(number.charAt(Integer.parseInt(c + "")));
                }
                if (length >= 2
                        && Integer.parseInt(""
                        + input.charAt(input.length() - length)) > 0) {
                    if (length == 9) {
                        sbf.append(zi.charAt(4));
                    } else if (length < 9 && length > 5) {
                        sbf.append(zi.charAt(length - 6));
                    } else if (length <= 5) {
                        sbf.append(zi.charAt(length - 2));
                    }
                }
                length--;
            }
        }

        System.out.println(sbf);
    }
}
