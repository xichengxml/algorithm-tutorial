package com.xicheng.algorithm.code155;

import com.xicheng.algorithm.chapter01.code155.MyLinkedListBag;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * description
 *
 * @author liubin52
 * @date 2019-09-30 17:03:23
 */
@Slf4j
public class MyLinkedListBagTest {

	private MyLinkedListBag<String> myLinkedListBag = new MyLinkedListBag<>();

	@Before
	public void init() {
		myLinkedListBag.add("to");
		myLinkedListBag.add("be");
		myLinkedListBag.add("or");
		myLinkedListBag.add("not");
	}

	@Test
	public void sizeTest() {
		log.info("size: {}", myLinkedListBag.size());
	}

	@Test
	public void getAllTest() {
		for (String element : myLinkedListBag) {
			log.info(element);
		}
	}
}
