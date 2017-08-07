package com.assignment2;

import com.assignment2.Node;

public class WordCounting {
	private Node head;

	public void worcCount(String s) {
		Node n = new Node(s);
		if (head != null) {
			n.setNext(head);
		}

		Node temp = head;
		while (temp != null) {
			if (temp.getElement().equals(s)) {
				temp.setCount();
				return;
			}
			temp = temp.getNext();
		}
		n.setNext(head);
		head = n;
	}

	public void printList() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getElement() + ":" + temp.getcount());
			temp = temp.getNext();
		}
	}
}
