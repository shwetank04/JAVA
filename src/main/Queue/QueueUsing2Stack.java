package com.luv2code.hibernate.demo;

import java.util.Stack;

public class Queue2Stacks {
	static class Queue {
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();

		public static boolean isEmpy() {
			return s1.isEmpty();
		}

		public static void add(int data) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());

			}
			s1.push(data);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		public static int remove() {
			if (isEmpy()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return s1.pop();
		}

		public static int peek() {
			if (isEmpy()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return s1.peek();
		}

	}
}
