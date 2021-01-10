package com.xicheng.algorithm.book.chapter01;

import com.xicheng.algorithm.book.common.Queue;
import com.xicheng.algorithm.book.common.StdOut;

/**
 * 队列的典型用例
 *
 * @author xichengxml
 * @date 2019-08-29 22:42:00
 */
public class C0078_QueueExample {

	private static final int SIZE = 10;

	public static void main(String[] args) {
		Queue<Double> doubleQueue = new Queue<>();
		for (int i = 0; i < SIZE; i++) {
			doubleQueue.enqueue(i + 0.0);
		}

		for (int i = 0; i < SIZE; i++) {
			StdOut.println(doubleQueue.dequeue());
		}
	}

}
