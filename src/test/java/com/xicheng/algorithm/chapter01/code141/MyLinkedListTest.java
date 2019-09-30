package com.xicheng.algorithm.chapter01.code141;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * description
 *
 * @author liubin52
 * @date 2019-09-30 10:07:01
 */
@Slf4j
public class MyLinkedListTest {

	private MyLinkedList<String> myLinkedList = new MyLinkedList<>();

	@Before
	public void init() {
		myLinkedList.addFirst("to");
		myLinkedList.addFirst(" be");
		myLinkedList.addFirst(" or");
	}

	/**
	 * 未实现迭代器，可以通过size确认是否添加成功
	 */
	@Test
	public void addFirstTest() {
		log.info("size: {}", myLinkedList.size());
	}

	/**
	 * 获取头结点并不移除元素，因此四次日志结果一致
	 */
	@Test
	public void getFirstTest() {
		log.info("getFirst: {}", myLinkedList.getFirst());
		log.info("getFirst: {}", myLinkedList.getFirst());
		log.info("getFirst: {}", myLinkedList.getFirst());
		log.info("getFirst: {}", myLinkedList.getFirst());
	}

	/**
	 * 移除，逆序取出
	 */
	@Test
	public void removeFirstTest() {
		log.info("removeFirst: {}", myLinkedList.removeFirst().trim());
		log.info("removeFirst: {}", myLinkedList.removeFirst().trim());
		log.info("removeFirst: {}", myLinkedList.removeFirst().trim());
		log.info("removeFirst: {}", myLinkedList.removeFirst());
	}

	@Test
	public void getAllTest() {
		myLinkedList.getAll();
	}

}
