package com.xicheng.algorithm.tuling;

import com.xicheng.algorithm.mashibing.util.ArraySortUtil;

import java.util.Arrays;

/**
 * @description [小于基准数]基准数[大于基准数]
 * @author xichengxml
 * @date 2021-04-10 03:14:44
 */
public class T07_QuickSort {

    public static void main(String[] args) {
        int[] initArray = ArraySortUtil.getInitArray();
        sort(initArray, 0, initArray.length - 1);
        System.out.println(Arrays.toString(initArray));
    }


    private static void sort(int[] arr, int left, int right) {
        // 找基准数
        int base = arr[left];
        // 左右指针
        int ll = left;
        int rr = right;
        while (ll < rr) {
            // 从右侧找比基准数小的数
            while (ll < rr && arr[rr] >= base) {
                rr--;
            }
            // 找到一个，交换，此时ll位置是基准数
            if (ll < rr) {
                int tmp = arr[rr];
                arr[rr] = arr[ll];
                arr[ll] = tmp;
                // 此时ll位置是找到的小于基准数的数，所以右移一位
                ll++;
            }
            // 从左侧找比基准数大的数
            while (ll < rr && arr[ll] <= base) {
                ll++;
            }
            // 找到一个，交换，此时rr位置是基准数
            if (ll < rr) {
                int tmp = arr[rr];
                arr[rr] = arr[ll];
                arr[ll] = tmp;
                // 此时rr位置是找到的大于基准数的数，所以左移一位
                rr--;
            }
        }
        // 此时ll==rr，且指向基准数位置
        // 数组结构为[小于基准数的数][ll==rr，基准数][大于基准数的数]
        if (left < ll) {
            sort(arr, left, ll - 1);
        }
        if (right > rr) {
            sort(arr, rr + 1, right);
        }
    }
}
