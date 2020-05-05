package com.xicheng.algorithm.mashibing.sort;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 前提：前后两部分分别有序
 * 稳定
 * @author xichengxml
 * @date 2020-05-05 10:27
 */
@Slf4j
public class T11_MergeSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        int[] result = sort(initArray);
        log.info("sort result: {}", Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        int mid = arr.length / 2;
        int[] temp = new int[arr.length];

        int i = 0;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j < arr.length) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
            log.info("middle: {}", Arrays.toString(temp));
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
            log.info("left fix: {}", Arrays.toString(temp));
        }

        while (j < arr.length) {
            temp[k++] = arr[j++];
            log.info("right fix: {}", Arrays.toString(temp));
        }

        return temp;
    }
}
