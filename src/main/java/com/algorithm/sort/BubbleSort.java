package com.algorithm.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 9, 4, 7, 2, 8, 9};
        bubblesort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 复杂度： O（n(n-1)/2）=O(n^2)
     *
     * @param array
     */
    private static void bubblesort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] >= array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
