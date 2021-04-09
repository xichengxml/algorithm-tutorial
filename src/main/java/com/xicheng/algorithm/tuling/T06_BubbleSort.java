package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
* @description 每次确定一个元素位置，排序(len - 1)次
* 优化：如果一次交换都没有，直接结束循环
* @author xichengxml
* @date 2021-04-06 06:46:54
*/
public class T06_BubbleSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        int length = initArray.length;
        // 排序的次数，所以是len - 1
        for (int i = 0; i < length - 1; i++) {
            boolean flag = sort(initArray, i);
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(initArray));
    }

    private static boolean sort(int[] initArray, int i) {
        boolean flag = false;
        int length = initArray.length;
        // 因为每次都有确定的元素放到最后，所以减去i
        for (int j = 0; j < length - 1 - i; j++) {
            if (initArray[j] > initArray[j + 1]) {
                int temp = initArray[j];
                initArray[j] = initArray[j + 1];
                initArray[j + 1] = temp;
                flag = true;
            }
        }
        return flag;
    }
}
