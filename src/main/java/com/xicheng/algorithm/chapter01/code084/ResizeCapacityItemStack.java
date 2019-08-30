package com.xicheng.algorithm.chapter01.code084;

/**
 * 可自动扩容、缩容的栈
 *
 * @author liubin52
 * @date 2019-08-30 16:22:01
 */
public class ResizeCapacityItemStack<T> {

	private T[] entry;

	private int size;

	private ResizeCapacityItemStack(int capacity) {
		entry = (T[]) new Object[capacity];
	}

	private boolean isEmpty() {
		return size == 0;
	}

	private int size() {
		return size;
	}

	/**
	 * 扩容或缩容并迁移元素
	 * @param max
	 */
	private void resize(int max) {
		T[] temp = (T[]) new Object[max];
		for (int i = 0; i < size; i++) {
			temp[i] = entry[i];
		}
		entry = temp;
	}

	public void push(T t) {
		if (size == entry.length) {
			resize(2 * entry.length);
		}
		entry[size++] = t;
	}

	public T pop() {
		T t = entry[--size];
		// 防止元素游离
		entry[size] = null;
		// 使用率不足1/4
		if (size <= entry.length / 4) {
			resize(entry.length / 2);
		}
		return t;
	}
}
