package com.xicheng.algorithm.chapter01.code141;

/**
 * 链表
 *
 * @author liubin52
 * @date 2019-09-29 18:04:12
 */
public class LinkedList<T> {

	public static void main(String[] args) {
		// 构建
		Node<String> first = new Node<>();
		Node<String> second = new Node<>();
		Node<String> third = new Node<>();

		first.item = "to";
		second.item = " be";
		third.item = " or";

		first.next = second;
		second.next = third;
	}

	private static class Node<T> {

		/**
		 * 数据
		 */
		private T item;

		/**
		 * 下一个节点引用
		 */
		private Node next;
	}
}
