package com.xicheng.algorithm.book.chapter01;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * 链表：第一期只实现了对first结点的操作，待实现双链表
 * {@link java.util.LinkedList}
 * @author xichengxml
 * @date 2019-09-29 18:04:12
 */
@Slf4j
public class C0141_MyLinkedList<T> {

	private int size;

	/**
	 * 头节点
	 */
	private Node<T> first;

	/**
	 * 尾结点
	 */
	private Node<T> last;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	/**
	 * 从头结点插入
	 * @param t
	 */
	public void addFirst(T t) {
		// 先将first保存在oldFirst中
		Node<T> oldFirst = first;
		// 将t赋给新结点，并将新结点指向oldFirst
		Node<T> newNode = new Node<>(t, oldFirst);
		// 将新结点赋予first
		first = newNode;
		size++;
	}

	/**
	 * 移除头结点
	 * @return
	 */
	public T removeFirst() {
		if (first == null) {
			return null;
		}
		T t = first.item;
		first = first.next;
		size--;
		return t;
	}

	/**
	 * 获取头结点
	 * @return
	 */
	public T getFirst() {
		if (first == null) {
			return null;
		}
		return first.item;
	}

	/**
	 * 遍历
	 */
	public void getAll() {
		while (first != null) {
			log.info("getAll:{}", removeFirst());
		}
	}

	@ToString
	private static class Node<T> {

		/**
		 * 数据
		 */
		private T item;

		/**
		 * 下一个节点引用
		 */
		private Node<T> next;

		private Node(T item, Node<T> next) {
			this.item = item;
			this.next = next;
		}
	}
}
