package com.xicheng.algorithm.book.chapter01;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 链表实现queue
 * {@link java.util.Queue}
 *
 * @author liubin52
 * @date 2019-09-30 15:45:11
 */
public class C0151_MyLinkedListQueue<T> implements Iterable<T> {

	/**
	 * 队列中的元素数量
	 */
	private int size;

	/**
	 * 指向最早添加的结点
	 */
	private Node<T> first;

	/**
	 * 指向最晚添加的结点
	 */
	private Node<T> last;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	/**
	 * 入队
	 * @param t
	 */
	public void enqueue(T t) {
		Node<T> oldLast = last;

		last = new Node<>();
		last.item = t;
		last.next = null;

		if (first == null) {
			first = last;
		} else {
			oldLast.next = last;
		}
		size++;
	}

	/**
	 * 出队
	 * @return
	 */
	public T dequeue() {
		if (first == null) {
			throw new NoSuchElementException("队列为空");
		}
		T item = first.item;
		first = first.next;
		if (first == null) {
			last = null;
		}
		size--;
		return item;
	}

	public T getFirst() {
		return first.item;
	}

	public T getLast() {
		return last.item;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	private class Node<T> {

		T item;

		Node<T> next;
	}
}
