package com.xicheng.algorithm.application;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * description 多线程顺序打印
 * 使用锁和wait-notify，避免线程不断重试浪费性能
 *
 * @author xichengxml
 * @date 2020-11-28 14:39
 */
@Slf4j
public class C001_ConcurrentSerialPrint02 {

    private static final Object LOCK = new Object();

    private static final int TOTAL_THREAD = 3;

    // 线程计数，用来控制当前可执行的线程
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_THREAD; i++) {
            new Thread(new PrintThread(i, TOTAL_THREAD)).start();
        }
    }

    static class PrintThread implements Runnable {

        // 当前线程编号
        private int currentThreadNo;

        // 线程总数
        private int totalThreadCnt;

        private int MAX = 30;

        public PrintThread(int currentThreadNo, int totalThreadCnt) {
            this.currentThreadNo = currentThreadNo;
            this.totalThreadCnt = totalThreadCnt;
        }

        @Override
        public String toString() {
            return "PrintThread{" +
                    ", currentThreadNo=" + currentThreadNo +
                    ", totalThreadCnt=" + totalThreadCnt +
                    ", MAX=" + MAX +
                    '}';
        }

        @Override
        public void run() {
            while (true) {
                synchronized (LOCK) {
                    try {
                        TimeUnit.SECONDS.sleep(1);

                        // log.info("{}, {}, {}", threadNo, totalThreadCnt, currentThreadNo);
                        while (counter % totalThreadCnt != currentThreadNo) {
                            // System.out.println(currentThreadNo + " wait");
                            LOCK.wait();
                        }
                        System.out.println("Thread" + currentThreadNo + ": " + counter % totalThreadCnt);
                        counter++;
                        LOCK.notifyAll();
                    } catch (Exception e) {
                        log.error("error: ", e);
                    }
                }
            }

        }
    }
}
