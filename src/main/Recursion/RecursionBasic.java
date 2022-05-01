package com.luv2code.hibernate.demo;

public class Recursion {
	public static void printNum(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNum(n - 1);
	}

	public static void sumNaturnalNumer(int i, int n, int sum) {
		if (i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		sumNaturnalNumer(i + 1, n, sum);
	}

	public static void factorial(int n, int fact) {
		if (n == 1) {
			fact = fact * n;
			System.out.println(fact);
			return;
		}
		fact = fact * n;
		factorial(n - 1, fact);
	}

	public static void fibonacci(int a, int b, int n) {
		if (n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		fibonacci(b, c, n - 1);
	}

	public static int xToPowerN(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 0;
		}

		int xPow = xToPowerN(x, n - 1);
		int xPown = x * xPow;
		return xPown;
	}

}
