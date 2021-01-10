package com.xicheng.algorithm.book.chapter01;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-30 18:08:06
 */
@Slf4j
public class C0173_ThreeSum {

	public static void main(String[] args) {
		int[] ints01 = generateInts(10000);
		log.info("count: {}", zeroSumCount(ints01));
	}

	private static int[] generateInts(int count) {
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = new Random().nextInt();
		}
		return arr;
	}

	private static int zeroSumCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[j] == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
