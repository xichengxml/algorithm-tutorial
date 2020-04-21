package com.xicheng.algorithm.chapter01.code077;

import com.xicheng.algorithm.common.edu.princeton.cs.algs4.Bag;
import com.xicheng.algorithm.common.edu.princeton.cs.algs4.StdOut;

/**
 * 背包的典型用例: 求平均值，求方差
 *
 * @author xichengxml
 * @date 2019-08-29 22:24:54
 */
public class BagExample {

	public static void main(String[] args) {
		Bag<Double> doubleBag = new Bag<>();
		for (int i = 0; i < 10; i++) {
			doubleBag.add(i + 0.0);
		}
		int size = doubleBag.size();

		double sum = 0.0;
		for (Double doubleVal : doubleBag) {
			sum += doubleVal;
		}
		double mean = sum / size;

		sum = 0.0;
		for (Double doubleVal : doubleBag) {
			sum += (doubleVal - mean) * (doubleVal - mean);
		}
		double sqrt = Math.sqrt(sum);

		StdOut.println("mean: " + mean);
		StdOut.println("sqrt: " + sqrt);
	}
}
