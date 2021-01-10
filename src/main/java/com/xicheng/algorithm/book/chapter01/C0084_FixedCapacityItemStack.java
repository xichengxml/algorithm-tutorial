package com.xicheng.algorithm.book.chapter01;

/**
 * description 定容栈
 *
 * @author xichengxml
 * @date 2019-08-30 16:06:09
 */
public class C0084_FixedCapacityItemStack<T> {

	private T[] entry;

	private int size;

	public C0084_FixedCapacityItemStack(int capacity) {
		entry = (T[]) new Object[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(T t) {
		if (size >= entry.length) {
			throw new RuntimeException("元素数量不能超过容器容量");
		}
		entry[size++] = t;
	}

	public T pop() {
		return entry[--size];
	}

	public int size() {
		return size;
	}
}
