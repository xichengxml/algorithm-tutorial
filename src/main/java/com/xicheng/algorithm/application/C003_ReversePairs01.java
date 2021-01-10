package com.xicheng.algorithm.application;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-11-28 22:16
 */
public class C003_ReversePairs01 {

    public static void main(String[] args) {
        int[] nums = new int[]{2147483647, 2147483647, -2147483647, -2147483647, -2147483647, 2147483647};
        int result = reversePairs(nums);
        System.out.println(result);
    }

    private static int reversePairs(int[] nums) {
        if (nums.length < 500) {
            return calculate(nums);
        } else {
            int i = nums.length / 2;
            int[] left = new int[i];
            int[] right = new int[nums.length - i];

            System.arraycopy(nums, 0, left, 0, i);
            System.arraycopy(nums, i, right, 0, nums.length - i);
            return reversePairs(left) + reversePairs(right);
        }

    }

    private static int calculate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int right = nums[j];
                if (left >= 0 && right <= 0 && !(left == 0 && right == 0)) {
                    result++;
                    continue;
                }
                if (left > 0 && (left / right > 2 || (left / right == 2 && left % right != 0))) {
                    result++;
                    continue;
                }
                if (left < 0 && right < 0) {
                    if (left / right < 2 || (left / right == 2 && left % right != 0)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
