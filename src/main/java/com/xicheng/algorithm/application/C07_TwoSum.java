package com.xicheng.algorithm.application;

import java.util.Arrays;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-11-28 21:59
 */
public class C07_TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int[] result = twoSum(nums, 6);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (target - left == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
