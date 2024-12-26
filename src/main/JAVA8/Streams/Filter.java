package JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		 List<Double> salaryList = new ArrayList<>();

	        // Adding salary values to the list
	        salaryList.add(45000.50);
	        salaryList.add(55000.75);
	        salaryList.add(60000.00);
	        salaryList.add(42000.25);
	        salaryList.add(72000.10);
	        
	       long filteredList = salaryList.stream().filter(salary -> salary > 3000).count();
	       System.out.println(filteredList);
	}
}
