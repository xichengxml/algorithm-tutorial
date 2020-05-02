package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.common.ArraySortUtil;
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
     * 如果按这种方式来写，本质上是i和j位置比较并交换，所以需要优化
     * @param args
     */
    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray);
    }

    public static void sort(int[] initArray) {

        int length = initArray.length;

        for (int i = 0; i < length; i++) {
            int minPos = i;
            for (int j = i + 1; j < length; j++) {
                if (initArray[j] < initArray[minPos]) {
                    minPos = j;
                }
            }
            ArraySortUtil.swap(initArray, minPos, i);
        }
        log.info("T01_SelectionSort main result: {}", Arrays.toString(initArray));
    }
}
