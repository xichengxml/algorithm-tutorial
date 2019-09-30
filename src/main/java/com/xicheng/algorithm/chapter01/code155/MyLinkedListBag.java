package com.xicheng.algorithm.chapter01.code155;

import java.util.Iterator;

/**
 * 链表实现bag，后进先出
 *
 * @author liubin52
 * @date 2019-09-30 16:26:08
 */
public class MyLinkedListBag<T> implements Iterable<T> {

	private Node<T> first;

	private int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	/**
	 * 和stack和push一样
	 */
	public void add(T t) {
		Node<T> oldFirst = first;
		first = new Node<>();
		first.item = t;
		first.next = oldFirst;
	}

	@Override
	public Iterator<T> iterator() {
		return new BagIterator();
	}

	private class Node<T> {

		T item;

		Node<T> next;
	}

	private class BagIterator implements Iterator {

		private Node<T> current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T item = current.item;
			current = current.next;
			return item;
		}
	}
}
