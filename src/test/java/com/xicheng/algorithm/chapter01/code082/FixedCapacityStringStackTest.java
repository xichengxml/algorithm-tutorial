package com.xicheng.algorithm.chapter01.code082;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

	/**
	 * for-each等价于while迭代器，测试一下fail fast
	 * 添加和删除都会报错
	 */
	@Test
	public void testForEach() {
		List<String> stringList = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		for (String s : stringList) {
			System.out.println(s);
			// stringList.remove(s);
			stringList.add("4");
		}
	}
}
