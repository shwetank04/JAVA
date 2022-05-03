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

}
