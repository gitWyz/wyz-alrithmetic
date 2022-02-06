package com.wyz.sort;


/**
 * 冒泡排序
 * @author yzw
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j+1]) {
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {4, 3, 9, 1, 7};
        int[] ints1 = bubbleSort(ints);
        for (int j : ints1) {
            System.out.println(j);
        }
    }
}
