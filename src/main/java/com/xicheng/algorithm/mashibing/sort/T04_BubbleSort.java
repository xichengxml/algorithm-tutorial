package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.common.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 冒泡排序是两两相邻比较的，没有和不相邻数据比较，因此是稳定算法
 * 每次都把最大值交换到最后边
 *
 * @author xichengxml
 * @date 2020-05-03 07:56
 */
@Slf4j
public class T04_BubbleSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
        log.info("sort result: {}", Arrays.toString(initArray));
    }

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i > 0 ; i--) {
            moveMaxToRight(arr, i);
        }
    }

    /**
     *
     * @param arr
     * @param maxPos 每次比较的最大位置
     */
    private static void moveMaxToRight(int[] arr, int maxPos) {
        for (int i = 0; i < maxPos; i++) {
            if (arr[i] > arr[i + 1]) {
                ArraySortUtil.swap(arr, i, i + 1);
            }
        }
        log.info("moveMaxToRight: {}", Arrays.toString(arr));
    }
}
