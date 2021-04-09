package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
* @description 每次确定一个元素位置，排序(len - 1)次
* @author xichengxml
* @date 2021-04-06 06:46:54
*/
public class T05_BubbleSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        int length = initArray.length;
        // 排序的次数，所以是len - 1
        for (int i = 0; i < length - 1; i++) {
            sort(initArray, i);
        }
        System.out.println(Arrays.toString(initArray));
    }

    private static void sort(int[] initArray, int i) {
        int length = initArray.length;
        // 因为每次都有确定的元素放到最后，所以减去i
        for (int j = 0; j < length - 1 - i; j++) {
            if (initArray[j] > initArray[j + 1]) {
                int temp = initArray[j];
                initArray[j] = initArray[j + 1];
                initArray[j + 1] = temp;
            }
        }
    }
}
