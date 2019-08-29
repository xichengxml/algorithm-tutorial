package com.xicheng.algorithm.chapter01.code079;

import com.xicheng.algorithm.common.edu.princeton.cs.algs4.Stack;
import com.xicheng.algorithm.common.edu.princeton.cs.algs4.StdOut;

/**
 * 栈的典型用例
 *
 * @author liubin52
 * @date 2019-08-29 22:46:11
 */
public class StackExample {

	private static final int SIZE = 10;

	public static void main(String[] args) {

		Stack<Double> doubleStack = new Stack<>();
		for (int i = 0; i < SIZE; i++) {
			doubleStack.push(i + 0.0);
		}
		for (int i = 0; i < SIZE; i++) {
			StdOut.println(doubleStack.pop());
		}
	}
}
