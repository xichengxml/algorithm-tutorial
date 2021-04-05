package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
* @description
* @author xichengxml
* @date 2021-04-04 20:37:10
*/
public class T03_MergeSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray, 0, initArray.length - 1);
        System.out.println(Arrays.toString(initArray));
    }

    private static void sort(int[] initArray, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(initArray, left, mid);
            sort(initArray, mid + 1, right);
            // 合并结果
            merge(initArray, left, mid, right);
        }
    }

    private static void merge(int[] initArray, int left, int mid, int right) {
        int[] tempArr = new int[initArray.length];

        int ptr1 = left; // 左侧数组的起始点
        int ptr2 = mid + 1; // 右侧数组的起始点

        int loc = left; // 临时数组指针
        while (ptr1 <= mid && ptr2 <= right) {
            if (initArray[ptr1] < initArray[ptr2]) {
                tempArr[loc++] = initArray[ptr1++];
            } else {
                tempArr[loc++] = initArray[ptr2++];
            }
        }

        // 左侧补齐
        while (ptr1 <= mid) {
            tempArr[loc++] = initArray[ptr1++];
        }
        // 右侧补齐
        while (ptr2 <= right) {
            tempArr[loc++] = initArray[ptr2++];
        }

        // 将临时数组的数据复制到原数组中
        for (int i = left; i <= right; i++) {
            initArray[i] = tempArr[i];
        }
    }
}
