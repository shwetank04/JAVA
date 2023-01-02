package com.luv2code.hibernate.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Laptop> laptop = new ArrayList<>();
		laptop.add(new Laptop("Dell", 16, 800));
		laptop.add(new Laptop("Apple", 8, 1200));
		laptop.add(new Laptop("Acer", 12, 700));

		Collections.sort(laptop);
		for (Laptop l : laptop) {
			System.out.println(l);
		}
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				if (l1.getPrice() > l2.getPrice()) {
					return 1;
				} else
					return -1;
			}
		};
		Collections.sort(laptop, com);
		for (Laptop l : laptop) {
			System.out.println(l);
		}

	}

}
