package com.xicheng.algorithm.application;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * description 使用Condition，更准确的控制线程打印
 *
 * @author xichengxml
 * @date 2020-11-28 20:19
 */
@Slf4j
public class C05_ConcurrentSerialPrint {

    private static final Lock LOCK = new ReentrantLock();

    private static final int TOTAL_THREAD = 3;

    private static Condition[] conditions = new Condition[TOTAL_THREAD];

    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_THREAD; i++) {
            new Thread(C05_ConcurrentSerialPrint::run, i + "").start();
            conditions[i] = LOCK.newCondition();
        }
    }

    private static void run() {
        while (true) {
            try {
                LOCK.lock();
                int currentThreadNo = Integer.parseInt(Thread.currentThread().getName());
                while (counter % TOTAL_THREAD != currentThreadNo) {
                    conditions[currentThreadNo].await();
                }
                log.info("Thread-{}, counter: {}", currentThreadNo, counter % TOTAL_THREAD);
                counter++;
                conditions[(currentThreadNo + 1) % TOTAL_THREAD].signal();
            } catch (Exception e) {
                log.error("error: ", e);
            }
        }
    }
}
