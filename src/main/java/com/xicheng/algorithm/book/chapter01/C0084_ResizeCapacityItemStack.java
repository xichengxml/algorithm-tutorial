package com.xicheng.algorithm.book.chapter01;

/**
 * 可自动扩容、缩容的栈
 * pop()时，被弹出的元素的引用实际上还存在在数组中，这个元素实际上已经是一个孤儿了，再也不会被访问了，但java的垃圾收集器没法知道这一点，
 * 除非该引用被覆盖，即使用例已经不再需要这个元素了，数组中的引用仍然可以让它继续存在，保存一个不需要的对象的引用称为游离
 *
 * @author xichengxml
 * @date 2019-08-30 16:22:01
 */
public class C0084_ResizeCapacityItemStack<T> {

	private T[] entry;

	private int size;

	private C0084_ResizeCapacityItemStack(int capacity) {
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
