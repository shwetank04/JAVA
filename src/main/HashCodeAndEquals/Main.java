package com.luv2code.hibernate.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setId(1);
		e1.setName("john");

		e2.setId(1);
		e2.setName("john");

		System.out.println("Shallow comparison " + (e1 == e2));//memory comparison

		System.out.println("Deep Comparison "+e1.equals(e2));
	}

}
