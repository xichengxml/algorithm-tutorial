package com.xicheng.algorithm.book.chapter01.code151;

import com.xicheng.algorithm.book.chapter01.C0151_MyLinkedListQueue;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * description
 *
 * @author liubin52
 * @date 2019-09-30 16:06:40
 */
@Slf4j
public class C0141C0151MyLinkedListQueueTest {

	private C0151_MyLinkedListQueue<String> c0151MyLinkedListQueue = new C0151_MyLinkedListQueue<>();

	@Before
	public void init() {
		c0151MyLinkedListQueue.enqueue("to");
		c0151MyLinkedListQueue.enqueue("be");
		c0151MyLinkedListQueue.enqueue("or");
		c0151MyLinkedListQueue.enqueue("not");
		log.info("size: {}, first: {}, last: {}",
				c0151MyLinkedListQueue.size(), c0151MyLinkedListQueue.getFirst(), c0151MyLinkedListQueue.getLast());
	}

	@Test
	public void dequeueTest() {
		log.info(c0151MyLinkedListQueue.dequeue());
		log.info(c0151MyLinkedListQueue.dequeue());
		log.info(c0151MyLinkedListQueue.dequeue());
		log.info(c0151MyLinkedListQueue.dequeue());
	}
}
