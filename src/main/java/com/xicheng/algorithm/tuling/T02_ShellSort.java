package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
 * @author xichengxml
 * @description
 * @date 2021-04-06 05:56:46
 */
public class T02_ShellSort {
    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        int length = initArray.length;
        for (int i = length / 2; i >= 1; i /= 2) {
            for (int j = i; j < length; j++) {
                sort(initArray, j, i);
            }
        }
        System.out.println(Arrays.toString(initArray));
    }

    /**
     * @param initArray
     * @param endPos    待排序元素位置
     * @param incr      增量，比如数组长度为10，则incr分别为5, 2, 1
     */
    private static void sort(int[] initArray, int endPos, int incr) {
        int data = initArray[endPos];
        int k = endPos - incr;
        for (; k >= 0; k -= incr) {
            if (initArray[k] > data) {
                initArray[k + incr] = initArray[k];
            } else {
                break;
            }
        }
        initArray[k + incr] = data;
    }
}
