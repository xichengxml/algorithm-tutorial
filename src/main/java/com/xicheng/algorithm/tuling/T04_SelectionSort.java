package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
 * @description 选择排序，也分已排序数组和未排序数组，每次找到最小值放到已排序最后
 * [已排序][未排序]
 * @author xichengxml
 * @date 2021-04-06 06:20:48
 */
public class T04_SelectionSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        int length = initArray.length;
        for (int i = 0; i < length; i++) {
            sort(initArray, i);
        }
        System.out.println(Arrays.toString(initArray));
    }

    private static void sort(int[] initArray, int i) {
        int minIndex = i;
        for (int j = i + 1; j < initArray.length; j++) {
            if (initArray[j] < initArray[minIndex]) {
                minIndex = j;
            }
        }
        int temp = initArray[minIndex];
        initArray[minIndex] = initArray[i];
        initArray[i] = temp;
    }
}
