package com.xicheng.algorithm.application;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * description 使用ReentrantLock公平锁模式，线程竞争锁时相对公平，降低资源占用率
 *
 * @author xichengxml
 * @date 2020-11-28 18:48
 */
@Slf4j
public class C04_ConcurrentSerialPrint {

    private static final Lock LOCK = new ReentrantLock(true);

    /**
     * 线程总数
     */
    private static final int TOTAL_THREAD = 3;

    /**
     * 计数器
     */
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_THREAD; i++) {
            new Thread(C04_ConcurrentSerialPrint::run, i + "").start();
        }
    }


    private static void run() {
        while (true) {
            LOCK.lock();
            // log.info("Thread-{}, counter: {}", Thread.currentThread().getName(), counter);
            if (counter % TOTAL_THREAD == Integer.parseInt(Thread.currentThread().getName())) {
                log.info("Thread-{}, counter: {}", Thread.currentThread().getName(), counter % TOTAL_THREAD);
                counter++;
            }
            LOCK.unlock();
        }
    }
}
