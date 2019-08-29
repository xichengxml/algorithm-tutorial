package com.xicheng.algorithm.chapter02;

import com.xicheng.algorithm.common.edu.princeton.cs.algs4.Counter;
import com.xicheng.algorithm.common.edu.princeton.cs.algs4.StdOut;
import com.xicheng.algorithm.common.edu.princeton.cs.algs4.StdRandom;

/**
 * description
 *
 * @author xichengxml
 * @date 2019-08-29 18:27:42
 */
public class Flips {

	public static void main(String[] args) {

		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");

		for (int i = 0; i < 10; i++) {
			if (StdRandom.bernoulli(0.5)) {
				heads.increment();
			} else {
				tails.increment();
			}
		}

		StdOut.println(heads);
		StdOut.println(tails);
		int i = heads.tally() - tails.tally();
		StdOut.println("delta: " + Math.abs(i));
	}
}
