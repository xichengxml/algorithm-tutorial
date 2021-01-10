package com.xicheng.algorithm.book.chapter01;

import com.xicheng.algorithm.book.common.StdRandom;
import com.xicheng.algorithm.book.common.ThreeSum;
import lombok.extern.slf4j.Slf4j;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-31 09:16:39
 */
@Slf4j
public class C0174_StopWatch {

	private static final int COUNT = 10000;

	private final long start;

	public static void main(String[] args) {
		int[] arr = new int[COUNT];
		for (int i = 0; i < COUNT; i++) {
			arr[i] = StdRandom.uniform(-10000, 10000);
		}
		C0174_StopWatch c0174StopWatch = new C0174_StopWatch();
		int count = ThreeSum.count(arr);
		long runTime = c0174StopWatch.elapsedTime();
		log.info("count: {}, runTime: {}", count, runTime);
	}

	public C0174_StopWatch() {
		start = System.currentTimeMillis();
	}

	public long elapsedTime() {
		long end = System.currentTimeMillis();
		return (end - start) / 1000;
	}
}
