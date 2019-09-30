package com.xicheng.algorithm.chapter01.code151;

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
public class MyLinkedListQueueTest {

	private MyLinkedListQueue<String> myLinkedListQueue = new MyLinkedListQueue<>();

	@Before
	public void init() {
		myLinkedListQueue.enqueue("to");
		myLinkedListQueue.enqueue("be");
		myLinkedListQueue.enqueue("or");
		myLinkedListQueue.enqueue("not");
		log.info("size: {}, first: {}, last: {}",
				myLinkedListQueue.size(), myLinkedListQueue.getFirst(), myLinkedListQueue.getLast());
	}

	@Test
	public void dequeueTest() {
		log.info(myLinkedListQueue.dequeue());
		log.info(myLinkedListQueue.dequeue());
		log.info(myLinkedListQueue.dequeue());
		log.info(myLinkedListQueue.dequeue());
	}
}
