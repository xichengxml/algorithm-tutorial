package com.xicheng.algorithm.book.chapter01;

import com.xicheng.algorithm.book.common.Stack;
import com.xicheng.algorithm.book.common.StdIn;
import com.xicheng.algorithm.book.common.StdOut;

/**
 * 使用双栈算法实现简单计算
 * 代码演示：
 * (
 * 1
 * +
 * 2
 * )
 * q
 * 3.0
 *
 * @author xichengxml
 * @date 2019-08-30 14:06:24
 */
public class C0080_Evaluate {

	private static final String QUIT = "q";

	public static void main(String[] args) {

		Stack<String> operatorStack = new Stack<>();
		Stack<Double> valueStack = new Stack<>();

		while (!StdIn.isEmpty()) {
			String string = StdIn.readString();
			if (QUIT.equals(string)) {
				break;
			}
			switch (string) {
				case "(":
					break;
				case "+":
				case "-":
				case "*":
				case "/":
				case "sqrt":
					operatorStack.push(string);
					break;
				case ")":
					String operator = operatorStack.pop();
					Double value = valueStack.pop();
					switch (operator) {
						case "+":
							value = value + valueStack.pop();
							break;
						case "-":
							value = value - valueStack.pop();
							break;
						case "*":
							value = value * valueStack.pop();
							break;
						case "/":
							value = value / valueStack.pop();
							break;
						case "sqrt":
							value = Math.sqrt(value);
							break;
						default:
							throw new IllegalArgumentException("非法运算符");
					}
					valueStack.push(value);
					break;
				default:
					valueStack.push(Double.parseDouble(string));
			}
		}
		StdOut.println(valueStack.pop());
	}
}
