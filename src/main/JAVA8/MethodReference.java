package com.luv2code.hibernate.demo;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {

		//Method Reference
		FunctionalInterfaceDemo functioanlInterface = Test::testImpl;
		functioanlInterface.singleAbsMethod();

		// using lambda expression
		FunctionalInterfaceDemo f = () -> System.out.println("This is test");
		f.singleAbsMethod();

	}

}

class Test {
	public static void testImpl() {
		System.out.println("This is test");
	}
}
