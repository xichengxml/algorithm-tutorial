package com.xicheng.algorithm.book.chapter01.code088;

import com.xicheng.algorithm.book.chapter01.C0088_ResizingArrayStack;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 迭代器功能怎么测？
 *
 * @author liubin52
 * @date 2019-09-29 17:38:24
 */
@Slf4j
public class C0088ResizingArrayStackTest {

	private C0088_ResizingArrayStack<Integer> c0088ResizingArrayStack = new C0088_ResizingArrayStack<>(1);

	/**
	 * 测试功能，是否LIFO
	 */
	@Test
	public void functionTest() {
		c0088ResizingArrayStack.push(1);
		c0088ResizingArrayStack.push(2);

		Integer item01 = c0088ResizingArrayStack.pop();
		Integer item02 = c0088ResizingArrayStack.pop();
		log.info("pop items: {}, {}", item01, item02);
	}
}
