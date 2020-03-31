package com.xicheng.algorithm.chapter01.code174;

import com.xicheng.algorithm.common.edu.princeton.cs.algs4.StdRandom;
import com.xicheng.algorithm.common.edu.princeton.cs.algs4.ThreeSum;
import lombok.extern.slf4j.Slf4j;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-31 09:16:39
 */
@Slf4j
public class StopWatch {

	private static final int COUNT = 10000;

	private final long start;

	public static void main(String[] args) {
		int[] arr = new int[COUNT];
		for (int i = 0; i < COUNT; i++) {
			arr[i] = StdRandom.uniform(-10000, 10000);
		}
		StopWatch stopWatch = new StopWatch();
		int count = ThreeSum.count(arr);
		long runTime = stopWatch.elapsedTime();
		log.info("count: {}, runTime: {}", count, runTime);
	}

	public StopWatch() {
		start = System.currentTimeMillis();
	}

	public long elapsedTime() {
		long end = System.currentTimeMillis();
		return (end - start) / 1000;
	}
}
