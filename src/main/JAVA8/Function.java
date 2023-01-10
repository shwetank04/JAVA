package com.luv2code.hibernate.demo;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {

		Function<Integer, Integer> funct = i -> i * i;
		System.out.println("Square root is " + funct.apply(5));

		Function<Integer, Integer> cube = i -> i * i * i;

		System.out.println(funct.andThen(cube).apply(3));
		System.out.println(funct.compose(cube).apply(3));

	}

}
