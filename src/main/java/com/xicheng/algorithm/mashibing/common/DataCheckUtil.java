package com.xicheng.algorithm.mashibing.common;

import com.xicheng.algorithm.mashibing.sort.T01_SelectionSort;
import com.xicheng.algorithm.mashibing.sort.T02_SelectionSort;
import com.xicheng.algorithm.mashibing.sort.T04_BubbleSort;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Random;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-05-02 22:41
 */
@Slf4j
public class DataCheckUtil {

    private static final int COUNT = 20;

    private static final Random RANDOM = new Random();

    private static int[] generateArray() {
        int[] arr = new int[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int nextInt = RANDOM.nextInt(10000);
            arr[i] = nextInt;
        }
        return arr;
    }

    private static boolean check(int[] arr) {
        int length = arr.length;
        int[] arrCopy = new int[length];
        System.arraycopy(arr, 0, arrCopy, 0, length);

        Arrays.sort(arr);
        log.info("result: {}", Arrays.toString(arr));
        T04_BubbleSort.sort(arrCopy);

        for (int i = 0; i < length; i++) {
            int result01 = arr[i];
            int result02 = arrCopy[i];
            if (result01 != result02) {
                log.info("result01: {}, result02: {}, i: {}", result01, result02, i);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int[] ints = generateArray();
            boolean result = check(ints);
            if (!result) {
                log.info("your sort algorithm is not good, it has some bugs");
            }
        }
        log.info("Congratulations! Your algorithm past this test");
    }
}
