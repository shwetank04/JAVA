package JavaPractice;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Iterator<Integer> iterator = list.iterator();
		System.out.println("Iterating values using iterator");
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println(value);
			if(value ==30) {
				iterator.remove();
			}
		}
		
		System.out.println("Iterating values using enhanced for loop");
		for(int value : list) {
			System.out.println(value);
		}
		
		System.out.println("Iterating through for each method");
		list.forEach(val -> System.out.println(val));
	}
}
