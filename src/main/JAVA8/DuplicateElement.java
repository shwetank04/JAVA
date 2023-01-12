package com.luv2code.hibernate.demo;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

	List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80);
	
	Set<Integer> set = new HashSet<>();
	list.stream().filter(l -> !set.add(l)).collect(Collectors.toSet()).forEach(System.out::println);
	
	}

}
