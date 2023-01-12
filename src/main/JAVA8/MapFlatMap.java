package com.luv2code.hibernate.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("noida");
		cities.add("banglore");
		Employee e1 = new Employee(1, "code", cities);
		Employee e2 = new Employee(2, "code", cities);
		Employee e3 = new Employee(3, "code", cities);
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		System.out.println(empList);
		// [Employee [id=1, name=code, citiesWorkedIn=[Pune, Mumbai, noida, banglore]],
		// Employee [id=2, name=code, citiesWorkedIn=[Pune, Mumbai, noida, banglore]],
		// Employee [id=3, name=code, citiesWorkedIn=[Pune, Mumbai, noida, banglore]]]

		// To print only id
		List<Integer> id = empList.stream().map(emp -> emp.getId()).collect(Collectors.toList());
		System.out.println(id);

		// without flat map
		Set<List<String>> set = empList.stream().map(emp -> emp.getCitiesWorkedIn()).collect(Collectors.toSet());
		System.out.println(set);
		// to print unique cities
		Set<String> setFlat = empList.stream().flatMap(emp -> emp.getCitiesWorkedIn().stream())
				.collect(Collectors.toSet());
		System.out.println(setFlat);

	}

}
