package com.xicheng.algorithm.chapter01.code084;

/**
 * description
 *
 * @author liubin52
 * @date 2019-08-30 16:06:09
 */
public class FixedCapacityItemStack<T> {

	private T[] entry;

	private int size;

	public FixedCapacityItemStack(int capacity) {
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
