package com.xicheng.algorithm.application;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * description 多线程顺序打印
 * 使用线程不断重试获取锁的方式实现
 *
 * @author xichengxml
 * @date 2020-11-28 18:08
 */
@Slf4j
public class C001_ConcurrentSerialPrint01 {

    private static final Object LOCK = new Object();

    /**
     * 总线程数
     */
    private static final int TOTAL_THREAD = 3;

    // 线程计数，控制当前线程是否可打印
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_THREAD; i++) {
            new Thread(C001_ConcurrentSerialPrint01::run, i + "").start();
        }
    }

    public static void run() {
        while (true) {
            try {
                synchronized (LOCK) {
                    TimeUnit.MILLISECONDS.sleep(1);
                    // log.info("{}, {}", counter, Thread.currentThread().getName());
                    if (counter % TOTAL_THREAD == Integer.parseInt(Thread.currentThread().getName())) {
                        System.out.println("Thread" + Thread.currentThread().getName() + ": " + counter % TOTAL_THREAD);
                        counter++;
                    }
                }
            } catch (Exception e) {
                log.error("error: ", e);
            }
        }
    }
}
