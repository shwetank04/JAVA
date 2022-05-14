package com.luv2code.hibernate.demo;

import java.util.LinkedList;

public class LinkedListExample {
	Node head;

	public void newLinkedList() {
		LinkedList<String> mylist = new LinkedList<>();
		mylist.add("string1");
		mylist.addLast("String3");
		mylist.addFirst("String0");
	}

	// [1,10,16,88]

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	public void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			return;
		}
		head = head.next;
	}

	public void deleteLast() {
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
}
