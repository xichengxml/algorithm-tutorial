package com.xicheng.algorithm.book.chapter01.code141;

import com.xicheng.algorithm.book.chapter01.C0141_MyLinkedList;
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
public class C0141MyLinkedListTest {

	private C0141_MyLinkedList<String> c0141MyLinkedList = new C0141_MyLinkedList<>();

	@Before
	public void init() {
		c0141MyLinkedList.addFirst("to");
		c0141MyLinkedList.addFirst(" be");
		c0141MyLinkedList.addFirst(" or");
	}

	/**
	 * 未实现迭代器，可以通过size确认是否添加成功
	 */
	@Test
	public void addFirstTest() {
		log.info("size: {}", c0141MyLinkedList.size());
	}

	/**
	 * 获取头结点并不移除元素，因此四次日志结果一致
	 */
	@Test
	public void getFirstTest() {
		log.info("getFirst: {}", c0141MyLinkedList.getFirst());
		log.info("getFirst: {}", c0141MyLinkedList.getFirst());
		log.info("getFirst: {}", c0141MyLinkedList.getFirst());
		log.info("getFirst: {}", c0141MyLinkedList.getFirst());
	}

	/**
	 * 移除，逆序取出
	 */
	@Test
	public void removeFirstTest() {
		log.info("removeFirst: {}", c0141MyLinkedList.removeFirst().trim());
		log.info("removeFirst: {}", c0141MyLinkedList.removeFirst().trim());
		log.info("removeFirst: {}", c0141MyLinkedList.removeFirst().trim());
		log.info("removeFirst: {}", c0141MyLinkedList.removeFirst());
	}

	@Test
	public void getAllTest() {
		c0141MyLinkedList.getAll();
	}

}
