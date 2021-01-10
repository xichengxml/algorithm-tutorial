package com.xicheng.algorithm.book.chapter01.code147;

import com.xicheng.algorithm.book.chapter01.C0147_MyLinkedListStack;
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
public class C0141C0147MyLinkedListStackTest {

	private C0147_MyLinkedListStack<String> c0147MyLinkedListStack = new C0147_MyLinkedListStack<>();

	@Before
	public void init() {
		c0147MyLinkedListStack.push("to");
		c0147MyLinkedListStack.push("be");
		c0147MyLinkedListStack.push("or");
		c0147MyLinkedListStack.push("not");
		c0147MyLinkedListStack.push("to");
		c0147MyLinkedListStack.push("be");
	}

	@Test
	public void popTest() {
		log.info(c0147MyLinkedListStack.pop());
		log.info(c0147MyLinkedListStack.pop());
		log.info(c0147MyLinkedListStack.pop());
		log.info(c0147MyLinkedListStack.pop());
		log.info(c0147MyLinkedListStack.pop());
		log.info(c0147MyLinkedListStack.pop());
		log.info(c0147MyLinkedListStack.pop());
	}
}
