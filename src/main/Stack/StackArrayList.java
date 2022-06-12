package com.luv2code.hibernate.demo;

import java.util.ArrayList;

public class SackArrayList {
	class stack {

		static ArrayList<Integer> list = new ArrayList<>();

		public static boolean isEmpty() {
			return list.size() == 0;
		}

		public static void push(int data) {
			list.add(data);
		}

		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

		public static int peek() {
			return list.get(list.size() - 1);
		}
	}
}
