package com.algorithm.number;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class NumberGroup {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] array=new String[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextLine();
        }

        List<String> result=new ArrayList<>();
        for(int i=0;i<n;i++){
           result=getnum(result,array[i].toCharArray());
        }

        result.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                Integer a=Integer.parseInt(o1);
                Integer b=Integer.parseInt(o2);
                return a.compareTo(b);
            }
        });


        for (String str: result) {
            System.out.println(str);
        }

    }

    private static List<String> getnum(List<String> list,char[] ch){
        List<String> result=new ArrayList<>();
        if(list.size()==0){
            for(int i=0;i<ch.length;i++){
                result.add(""+ch[i]);
            }
        }else{
            for (String str: list) {
                for(int i=0;i<ch.length;i++){
                    result.add(str+ch[i]);
                }
            }
        }
        return result;

    }
}
