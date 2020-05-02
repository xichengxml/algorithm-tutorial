package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.common.ArraySortUtil;
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

    private static final String CLASS_NAME = T02_SelectionSort.class.getName();

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
    }

    public static void sort(int[] initArray) {
        int length = initArray.length;

        for (int i = 0; i < length; i++) {
            int minPos = i;
            int maxPos = length - 1 - i;
            for (int j = i + 1; j < length - i; j++) {
                if (initArray[j] < initArray[minPos]) {
                    minPos = j;
                }
                if (initArray[j] > initArray[maxPos]) {
                    maxPos = j;
                }
            }
            ArraySortUtil.swap(initArray, minPos, i);
            ArraySortUtil.swap(initArray, maxPos, length - 1 - i);
        }

        log.info("{} main sort result: {}", CLASS_NAME, Arrays.toString(initArray));
    }
}
