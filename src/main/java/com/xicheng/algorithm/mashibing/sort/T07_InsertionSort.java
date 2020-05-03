package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.common.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * description 去掉swap, 使用临时变量优化算法
 *
 * @author xichengxml
 * @date 2020-05-03 16:54
 */
@Slf4j
public class T07_InsertionSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();

    }

    private static void insertMinToFront(int[] arr, int endPos) {
        for (int i = endPos; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int tmp = arr[i];

            }
        }
    }
}
