package com.luv2code.hibernate.demo;

public class RecursionAdvance {
	public static int first = -1;
	public static int last = -1;

	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if (n == 1) {
			System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
			return;
		}
		towerOfHanoi(n - 1, src, dest, helper);
		System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
		towerOfHanoi(n - 1, helper, src, dest);
	}

	public static void stringReverse(String reverse, int index) {
		if (index == 0) {
			System.out.println(reverse.charAt(index));
			return;
		}
		System.out.println(reverse.charAt(index));
		stringReverse(reverse, index - 1);
	}

	public static void firstAndLastOccurance(String str, int idx, char element) {
		if (idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar = str.charAt(idx);
		if (currChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		firstAndLastOccurance(str, idx + 1, element);
	}

	public static boolean stricklyIncreasing(int arr[], int indx) {
		if (indx == arr.length - 1) {
			return true;
		}
		if (arr[indx] < arr[indx + 1]) {
			return stricklyIncreasing(arr, indx + 1);
		} else {
			return false;
		}

	}
	
		public static void moveAllX(String str, int idx, int count, String newString) {
		if (idx == str.length()) {
			for (int i = 0; i < count; i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		if (str.charAt(idx) == 'x') {
			count++;
			moveAllX(str, idx + 1, count, newString);
		} else {
			newString += str.charAt(idx);
			moveAllX(str, idx + 1, count, newString);
		}
	}

	public static boolean[] map = new boolean[26];

	public static void removeDuplicates(String str, int idx, String newString) {
		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if (map[currChar - 'a']) {
			removeDuplicates(str, idx + 1, newString);
		} else {
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDuplicates(str, idx + 1, newString);
		}
	}

	public static void subsequences(String str, int idx, String newString) {
		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		subsequences(str, idx + 1, newString + currChar);
		subsequences(str, idx + 1, newString);

	}

	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void keypadCombination(String str, int idx, String combination) {
		if(idx==str.length()) {
			System.out.println(combination);
			return;
		}
		char currChar = str.charAt(idx);
		String mapping = keypad[currChar - '0'];
		for (int i = 0; i < mapping.length(); i++) {
			keypadCombination(str, idx + 1, combination + mapping.charAt(i));
		}
	}

}
