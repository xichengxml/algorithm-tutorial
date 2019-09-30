package com.xicheng.algorithm.chapter01.code147;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * description
 *
 * @author liubin52
 * @date 2019-09-30 13:48:43
 */
@Slf4j
public class MyLinkedListStackTest {

	private MyLinkedListStack<String> myLinkedListStack = new MyLinkedListStack<>();

	@Before
	public void init() {
		myLinkedListStack.push("to");
		myLinkedListStack.push("be");
		myLinkedListStack.push("or");
		myLinkedListStack.push("not");
		myLinkedListStack.push("to");
		myLinkedListStack.push("be");
	}

	@Test
	public void popTest() {
		log.info(myLinkedListStack.pop());
		log.info(myLinkedListStack.pop());
		log.info(myLinkedListStack.pop());
		log.info(myLinkedListStack.pop());
		log.info(myLinkedListStack.pop());
		log.info(myLinkedListStack.pop());
		log.info(myLinkedListStack.pop());
	}
}
