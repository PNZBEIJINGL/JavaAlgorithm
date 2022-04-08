package com.pat.basiclevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 1076 Wifi密码
 */
public class Q1076 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        String output = "";
        for (int i = 0; i < N * 4; i++) {
            st.nextToken();
            String temp = st.sval;
            if (temp.charAt(2) == 'T') {
                int out = temp.charAt(0) - 'A' + 1;
                output += out;
            }
        }
        System.out.println(output);
    }
}
