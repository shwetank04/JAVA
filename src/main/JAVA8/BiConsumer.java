package com.luv2code.hibernate.demo;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {

		//BiConsumer Takes two argument an return nothing
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept(10, 5);

	}

}
