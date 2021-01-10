package com.xicheng.algorithm.book.chapter01;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

/**
 * 下压栈(LIFO) 能够动态调整数组大小的实现
 *
 * @author liubin52
 * @date 2019-09-29 17:13:26
 */
@Slf4j
public class C0088_ResizingArrayStack<T> implements Iterable<T> {

	/**
	 * 栈元素
	 */
	private T[] items = (T[]) new Object[1];

	/**
	 * 元素数量
	 */
	private int cnt;

	@Override
	public Iterator<T> iterator() {
		return new ReverseArrayIterator();
	}

	public C0088_ResizingArrayStack(int capcity) {
		items = (T[]) new Object[capcity];
	}

	/**
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return cnt == 0;
	}

	/**
	 *
	 * @return
	 */
	public int size() {
		return cnt;
	}

	/**
	 * 将栈元素移动到一个大小为newSize的新数组
	 * @param newSize
	 */
	private void resize(int newSize) {
		log.info("resize to new size: {}", newSize);
		T[] newStack = (T[]) new Object[newSize];
		for (int i = 0; i < cnt; i++) {
			newStack[i] = items[i];
		}
		items = newStack;
	}

	/**
	 * 想一下这里会不会有多线程问题
	 * 如果多线程的话，可能cnt == items.length永远不会成立
	 * @param t
	 */
	public void push(T t) {
		if (cnt == items.length) {
			resize(2 * items.length);
		}
		items[cnt++] = t;
	}

	/**
	 *
	 * @return
	 */
	public T pop() {
		// 从栈顶取出元素
		T item = items[--cnt];
		// 避免元素游离
		items[cnt] = null;
		if (cnt > 0 && cnt == items.length / 4) {
			resize(items.length / 2);
		}
		return item;
	}

	// 支持后进先出的迭代器
	private class ReverseArrayIterator implements Iterator<T> {

		private int i = cnt;

		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public T next() {
			return items[--i];
		}
	}

}
