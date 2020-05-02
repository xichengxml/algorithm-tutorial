package com.xicheng.algorithm.mashibing.common;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-05-02 15:53
 */
public class ArraySortUtil {

    public static int[] getInitArray() {
        return new int[]{5, 9, 6, 1, 2, 8, 7, 4, 3};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
