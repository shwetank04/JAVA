package com.luv2code.hibernate.demo;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {

		Consumer<Integer> consumer = s -> System.out.println(s * s);
		consumer.accept(5);
		Consumer<Integer> consumer2 = s -> System.out.println(s * s * s);
		consumer.andThen(consumer2).accept(10);
	}

}
