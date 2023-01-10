package com.luv2code.hibernate.demo;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {

		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println(checkLength.test("abcdef"));

		Predicate<String> checkEven = i -> i.length() % 2 == 0;
		System.out.println(checkLength.and(checkEven).test("abcdef"));

	}

}
