package com.xicheng.algorithm.book.chapter01;

import com.xicheng.algorithm.book.common.Stack;
import com.xicheng.algorithm.book.common.StdOut;

/**
 * 栈的典型用例
 *
 * @author xichengxml
 * @date 2019-08-29 22:46:11
 */
public class C0079_StackExample {

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
