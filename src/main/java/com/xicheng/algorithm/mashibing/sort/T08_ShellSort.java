package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 基于插入排序，间隔大的时候移动次数少，间隔小的时候移动距离短，因此效率较高
 * 因为是间隔对比排序，所以不稳定
 * 最优时间复杂度: O(n ^ 1.3)
 *
 * @author xichengxml
 * @date 2020-05-04 10:40
 */
@Slf4j
public class T08_ShellSort {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
        log.info("sort result: {}, runTime: {}", Arrays.toString(initArray), System.nanoTime() - startTime);
    }

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int gap = length / 2; gap >  0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                compareAndSwap(arr, gap, i);
            }
        }
    }

    private static void compareAndSwap(int[] arr, int gap, int pos) {
        for (int i = pos; i > gap - 1 ; i -= gap) {
            if (arr[i] < arr[i - gap]) {
                ArraySortUtil.swap(arr, i, i - gap);
            }
        }
        log.info("middle: {}", Arrays.toString(arr));
    }
}
