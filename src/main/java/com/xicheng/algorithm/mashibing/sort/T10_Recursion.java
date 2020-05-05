package com.xicheng.algorithm.mashibing.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * description 复习递归
 *
 * @author xichengxml
 * @date 2020-05-04 18:57
 */
@Slf4j
public class T10_Recursion {

    public static void main(String[] args) {
        log.info("result: {}", recursion(10));
    }

    private static int recursion(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + recursion(n - 1);
    }
}
