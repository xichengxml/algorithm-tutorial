package com.xicheng.algorithm.application;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * description 使用ReentrantLock非公平锁，线程无序竞争，会浪费大量资源
 *
 * @author xichengxml
 * @date 2020-11-28 18:36
 */
public class C001_ConcurrentSerialPrint03 {

    private static final Lock LOCK = new ReentrantLock();

    /**
     * 线程总数量
     */
    private static final int THREAD_TOTAL_CNT = 3;

    /**
     * 计数器
     */
    private static int counter;

    public static void main(String[] args) {

        for (int i = 0; i < THREAD_TOTAL_CNT; i++) {
            new Thread(C001_ConcurrentSerialPrint03::run, i + "").start();
        }
    }

    private static void run() {
        while (true) {
            LOCK.lock();
            if (counter % THREAD_TOTAL_CNT == Integer.parseInt(Thread.currentThread().getName())) {
                System.out.println("Thread" + Thread.currentThread().getName() + ": " + counter % THREAD_TOTAL_CNT);
                counter++;
            }
            LOCK.unlock();
        }
    }
}
