package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 使用Knuth序列优化希尔排序的执行次数
 *
 * @author xichengxml
 * @date 2020-05-04 11:28
 */
@Slf4j
public class T09_ShellSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
        log.info("sort result: {}", initArray);
    }

    public static void sort(int[] arr) {
        int length = arr.length;
        // 计算h的值
        int h = 1;
        while (h <= length / 3) {
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0 ; gap = (gap - 1) / 3) {
            for (int i = gap; i < length; i++) {
                compareAndSwap(arr, gap, i);
            }
        }
    }

    private static void compareAndSwap(int[] arr, int gap, int pos) {
        for (int i = pos; i > gap - 1; i -= gap) {
            if (arr[i] < arr[i - gap]) {
                ArraySortUtil.swap(arr, i, i - gap);
            }
        }
        log.info("middle: {}", Arrays.toString(arr));
    }
}
