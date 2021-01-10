package com.xicheng.algorithm.book.chapter01;

/**
 * 定容栈
 * 注意：capacity >= size
 *
 * @author xichengxml
 * @date 2019-08-30 14:54:44
 */
public class C0082_FixedCapacityStringStack {

	/**
	 * stack entries
	 */
	private String[] entry;

	/**
	 * 元素数量
	 */
	private int size;

	public C0082_FixedCapacityStringStack(int capacity) {
		entry = new String[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void push(String value) {
		if (size >= entry.length) {
			throw new RuntimeException("元素数量不能超过容器容量");
		}
		entry[size++] = value;
	}

	public String pop() {
		return entry[--size];
	}
}
