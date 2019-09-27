package com.xicheng.algorithm.chapter01.code082;

import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2019-08-30 15:02:52
 */
public class FixedCapacityStringStackTest {

	private FixedCapacityStringStack fixedCapacityStringStack = new FixedCapacityStringStack(3);

	private static final String STRIKE = "-";

	@Test
	public void functionTest() {
		String string = "to - - be - - or not - - to be, that is - - a question";
		String[] split = string.split(" ");
		for (String s : split) {
			if (!STRIKE.equals(s)) {
				fixedCapacityStringStack.push(s);
			} else {
				if (!fixedCapacityStringStack.isEmpty()) {
					System.out.print(fixedCapacityStringStack.pop() + " ");
				}
			}
		}
	}

	@Test
	public void test01() {
		String[] strings = new String[4];
		strings[0] = "0";
		strings[1] = "1";
		strings[2] = "2";

		int size = 1;
		System.out.println(strings[size--]);
		size = 1;
		System.out.println(strings[--size]);
	}
}
