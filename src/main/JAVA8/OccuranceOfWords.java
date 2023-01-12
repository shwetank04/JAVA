package com.luv2code.hibernate.demo;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		String input = "WELCOME TO CODE DECODE AND CODE DECODE WELCOMES YOU";
		List<String> list = Arrays.asList(input.split(" "));

		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}

}
