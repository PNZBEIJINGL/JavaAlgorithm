package com.algorithm.basic;

/**
 * 时间复杂度：
 * 若存在函数 f（n），使得当n趋近于无穷大时，T（n）/ f（n）的极限值为不等于零的常数，则称 f（n）是T（n）的同数量级函数。
 * 记作 T（n）= O（f（n）），称O（f（n）） 为算法的渐进时间复杂度，简称时间复杂度。
 * 渐进时间复杂度用大写O来表示，所以也被称为大O表示法
 */
public class TimeComplexity {

    public static void main(String[] args) {

        testForLoop(5);
        testDoubleForLoop(5);
        testOrderExcution(5);
        testIf(5);

        //Other
        testLog(5);

    }

    private static void testLog(int n) {
        System.out.println("Other");
        for (int i = 1; i < n; i++) {
            i *= 2;
            System.out.println(i);
        }
        System.out.println("假设循环测试为t,循环条件满足2^t<n");
        System.out.println("执行次数 t=log(2)(n)");
        System.out.println("时间复杂度=O(log(2)(n))=O(logn)");

    }

    private static void testIf(int n) {
        System.out.println("对于条件判断语句，总的时间复杂度等于其中 时间复杂度最大的路径 的时间复杂度");
        if (n > 0) {
            for (int i = 0; i <= n; i++) {  //循环n次
                for (int j = 0; j <= i; j++) {  //循环n次
                    System.out.println("参数数据大于0"); //循环体的时间复杂度是O(1)
                }
            }
        } else {
            for (int i = 0; i <= n; i++) {  //循环n次
                System.out.println("参数数据小于等于0");   // 循环体的时间复杂度是O(1)
            }
        }

        System.out.println("时间复杂度=max(O(n^2,O(n))) = O(n^2)");

    }

    private static void testOrderExcution(int n) {
        System.out.println("对于顺序执行的语句或者算法，总的时间复杂度等于其中最大的时间复杂度");
        for (int i = 0; i <= n; i++) {  //循环n次
            for (int j = 0; j <= i; j++) {  //循环n次
                System.out.println("i=" + i + "j=" + j); //循环体的时间复杂度是O(1)
            }
        }

        for (int i = 0; i <= n; i++) {  //循环n次
            System.out.println(i);   // 循环体的时间复杂度是O(1)
        }
        System.out.println("时间复杂度=max(O(n^2,O(n))) = O(n^2)");

    }

    private static void testDoubleForLoop(int n) {

        System.out.println("对于多个循环，假设循环体的时间复杂度为 O(n)，各个循环的循环次数分别是a, b, ");
        System.out.println("c...，则这个循环的时间复杂度为 O(n×a×b×c...)。分析的时候应该由里向外分析这些循环");
        for (int i = 0; i <= n; i++) {  //循环n次
            for (int j = 0; j <= i; j++) {  //循环n次
                System.out.println("i=" + i + "j=" + j); //循环体的时间复杂度是O(1)
            }
        }
        System.out.println("时间复杂度=O(n*n*1)=O(n^2)");

    }

    /**
     * 一个循环时间复杂度是O(n)
     *
     * @param n
     */
    private static void testForLoop(int n) {
        System.out.println("对于一个循环，假设循环体的时间复杂度为 O(n)，循环次数为 m，则这个循环的时间复杂度=O(n*m)");
        for (int i = 0; i <= n; i++) {  //循环n次
            System.out.println(i);   // 循环体的时间复杂度是O(1)
        }
        System.out.println("时间复杂度=O(n*1)=O(n)");
    }


}
