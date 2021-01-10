package com.xicheng.algorithm.book.chapter01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * 链表实现栈
 * {@link Stack}是数组实现
 *
 * @author xichengxml
 * @date 2019-09-30 13:34:58
 */
public class C0147_MyLinkedListStack<T> implements Iterable<T> {

	/**
	 * 栈顶
	 */
	private Node<T> first;

	/**
	 * 栈中的元素数
	 */
	private int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	/**
	 * 向栈顶添加元素
	 * @param t
	 */
	public void push(T t) {
		Node<T> oldFirst = first;
		// 新建Node，赋给first
		first = new Node<>();
		first.item = t;
		first.next = oldFirst;
		size++;
	}

	/**
	 * 从栈顶删除元素
	 * @return
	 */
	public T pop() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		T t = first.item;
		first = first.next;
		size--;
		return t;
	}

	private class Node<T> {

		T item;

		Node<T> next;
	}
}
