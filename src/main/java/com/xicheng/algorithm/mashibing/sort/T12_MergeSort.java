package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-05-20 16:59
 */
@Slf4j
public class T12_MergeSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray, 0, initArray.length - 1);
        log.info("result: {}", Arrays.toString(initArray));
    }

    public static void sort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (right + left) / 2;
        // 左边排序
        sort(arr, left, mid);
        // 右边排序
        sort(arr, mid + 1, right);

        merge(arr, left, mid + 1, right);
    }

    private static void merge(int[] arr, int leftPointer, int rightPointer, int rightBound) {
        int mid = (rightBound + leftPointer) / 2;

        int i = leftPointer;
        int j = rightPointer;
        int[] temp = new int[rightBound - leftPointer + 1];
        int k = 0;

        while (i <= mid && j <= rightBound) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
            log.info("middle: {}", Arrays.toString(temp));
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
            log.info("left fix: {}", Arrays.toString(temp));
        }

        while (j <= rightBound) {
            temp[k++] = arr[j++];
            log.info("right fix: {}", Arrays.toString(temp));
        }

        for (int m = 0; m < temp.length; m++) {
            arr[leftPointer + m] = temp[m];
        }
    }
}
