package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 核心思路：每次找到最小值放到头部
 *
 * @author xichengxml
 * @date 2020-05-02 15:43
 */
@Slf4j
public class T01_SelectionSort {

    /**
     * 如果按这种方式来写，本质上是i和i + 1位置比较并交换，所以需要优化
     * @param args
     */
    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
        log.info("T01_SelectionSort sort result: {}", Arrays.toString(initArray));
    }

    public static void sort(int[] initArray) {

        int length = initArray.length;

        for (int i = 0; i < length; i++) {
            insertMinToStart(i, initArray);
        }
    }

    private static void insertMinToStart(int startPos, int[] arr) {
        int minPos = startPos;
        for (int j = startPos + 1; j < arr.length; j++) {
            if (arr[j] < arr[minPos]) {
                minPos = j;
            }
        }
        ArraySortUtil.swap(arr, minPos, startPos);
        log.info("sort middle: {}", Arrays.toString(arr));
    }
}
