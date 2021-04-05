package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
 * @author xichengxml
 * @description 插入 -> 希尔 -> 归并，递进关系
 * 使用频率最高，最重要
 * @date 2021-04-04 14:12:49
 */
public class T01_InsertionSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        for (int i = 1; i < initArray.length; i++) {
            sort(initArray, i);
        }
        System.out.println(Arrays.toString(initArray));
    }

    /**
     * [有序数组]待插入元素[无序数组]
     *
     * @param arr
     * @param endPos
     * @return
     */
    private static int[] sort(int[] arr, int endPos) {
        // 待插入元素
        int data = arr[endPos];
        // 有序数组遍历
        int j = endPos - 1;
        for (; j >= 0; j--) {
            if (arr[j] > data) {
                // 向后移动
                arr[j + 1] = arr[j];
            } else {
                break;
            }
        }
        // 为什么要+1? j=0的时候，还会减1
        System.out.println(j);
        arr[j + 1] = data;
        return arr;
    }
}
