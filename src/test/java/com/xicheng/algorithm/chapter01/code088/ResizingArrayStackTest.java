package com.xicheng.algorithm.chapter01.code088;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 迭代器功能怎么测？
 *
 * @author liubin52
 * @date 2019-09-29 17:38:24
 */
@Slf4j
public class ResizingArrayStackTest {

	private ResizingArrayStack<Integer> resizingArrayStack = new ResizingArrayStack<>(1);

	/**
	 * 测试功能，是否LIFO
	 */
	@Test
	public void functionTest() {
		resizingArrayStack.push(1);
		resizingArrayStack.push(2);

		Integer item01 = resizingArrayStack.pop();
		Integer item02 = resizingArrayStack.pop();
		log.info("pop items: {}, {}", item01, item02);
	}
}
