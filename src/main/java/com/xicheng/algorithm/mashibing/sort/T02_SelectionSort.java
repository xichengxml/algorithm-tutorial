package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 程序有bug
 * 优化思路：一次找出最大值和最小值，减少一半遍历次数
 *
 * @author xichengxml
 * @date 2020-05-02 16:27
 */
@Slf4j
public class T02_SelectionSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
        log.info("sort result: {}", Arrays.toString(initArray));
    }

    public static void sort(int[] initArray) {
        int length = initArray.length;

        for (int i = 0; i < length; i++) {
            int minPos = i;
            int maxPos = length - 1 - i;
            insertMinAndMaxToEdge(i, minPos, maxPos, initArray);
        }
    }

    private static void insertMinAndMaxToEdge(int startPos, int minPos, int maxPos, int[] arr) {
        // + 1的目的是自己不用再和自己比，当然不加1也可以;
        for (int j = startPos + 1; j < arr.length - startPos; j++) {
            if (arr[j] < arr[minPos]) {
                minPos = j;
            }
            if (arr[j] > arr[maxPos]) {
                maxPos = j;
            }
        }
        ArraySortUtil.swap(arr, minPos, startPos);
        ArraySortUtil.swap(arr, maxPos, arr.length - 1 - startPos);
        log.info("sort middle: {}", Arrays.toString(arr));
    }
}
