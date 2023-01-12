package com.luv2code.hibernate.demo;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		System.out.println(isPrime(6));
	}

	public static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(n -> number % n == 0);
	}
}
