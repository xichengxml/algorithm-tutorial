package com.xicheng.algorithm.code155;

import com.xicheng.algorithm.book.chapter01.C0155_MyLinkedListBag;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * description
 *
 * @author liubin52
 * @date 2019-09-30 17:03:23
 */
@Slf4j
public class C0141C0155MyLinkedListBagTest {

	private C0155_MyLinkedListBag<String> c0155MyLinkedListBag = new C0155_MyLinkedListBag<>();

	@Before
	public void init() {
		c0155MyLinkedListBag.add("to");
		c0155MyLinkedListBag.add("be");
		c0155MyLinkedListBag.add("or");
		c0155MyLinkedListBag.add("not");
	}

	@Test
	public void sizeTest() {
		log.info("size: {}", c0155MyLinkedListBag.size());
	}

	@Test
	public void getAllTest() {
		for (String element : c0155MyLinkedListBag) {
			log.info(element);
		}
	}
}
