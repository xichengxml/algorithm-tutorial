package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 每次将最小值插入到前面
 * 每次都是两两比较, 所以是稳定算法
 *
 * @author xichengxml
 * @date 2020-05-03 16:44
 */
@Slf4j
public class T06_InsertionSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
        log.info("sort result: {}", Arrays.toString(initArray));
    }

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            insertMinToFront(arr, i);
        }
    }

    /**
     *
     * @param arr
     * @param endPos 每次处理的终止位置
     */
    private static void insertMinToFront(int[] arr, int endPos) {
        for (int i = endPos; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                ArraySortUtil.swap(arr, i, i - 1);
            }
        }
        log.info("middle: {}", Arrays.toString(arr));
    }
}
