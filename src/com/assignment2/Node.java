package com.assignment2;

public class Node {
	private String element;
	private Node next;
	private int count;

	public Node(String s) {
		element = s;
		count = 1;
	}

	public String getElement() {
		return element;
	}

	public Node getNext() {
		return next;
	}

	public void setElement(String newElem) {
		element = newElem;
	}

	public void setNext(Node newNext) {
		next = newNext;
	}

	public void setCount() {
		++count;
	}

	public int getcount() {
		return count;
	}
	
}
