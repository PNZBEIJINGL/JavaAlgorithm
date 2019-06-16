package com.algorithm.sort;


import java.util.Scanner;

public class BucketSort {


    /**
     * 桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。为了使桶排序更加高效，我们需要做到这两点：
     * 1. 在额外空间充足的情况下，尽量增大桶的数量
     * 2. 使用的映射函数能够将输入的 N 个数据均匀的分配到 K 个桶中
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[11];
        //初始化数组每一个为0
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        printArray(a);

        //分别输入5个数字
        for (int i = 1; i <= 5; i++) {
            Scanner mScanner = new Scanner(System.in);
            int j = mScanner.nextInt();
            a[j]++;//计数
        }
        printArray(a);

        //依次判断a[0]~a[10]
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < a[i]; j++) {//出现了几次就打印几次，顺序排,反着排也行上面一行改为
                System.out.println(i);
            }
        }

    }

    private static void printArray(int[] a) {
        System.out.println("int[]a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
