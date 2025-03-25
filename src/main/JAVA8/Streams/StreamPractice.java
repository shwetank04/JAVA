package main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
    	
    	//Filter even number from the list.
    	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    	List<Integer> even = numbers.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
    	
    	//Find Maximum and Minimum number in the list.
    	List<Integer> numbers1 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
    	Optional<Integer> max = numbers1.stream().max(Comparator.comparingInt(Integer::intValue));
    	Optional<Integer> min = numbers1.stream().min(Comparator.comparing(Integer::intValue));
    	
    	//Count Occurance of each element
    	List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
    	Map<String, Long> map = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	
    	//Sum of even numbers
    	List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6);	
    	numbers3.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
    	
    	//convert list of string to uppercase
    	List<String> fruits1 = Arrays.asList("apple", "banana", "cherry");
    	fruits1.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());
    	
    	//Check if any element in list is even
    	List<Integer> numbers4 = Arrays.asList(1, 3, 5, 7);
    	numbers4.stream().anyMatch(nums -> nums%2 ==0);
    	
    	//Flat map
    	List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
    	lists.stream().flatMap(List::stream).collect(Collectors.toList());
    	
    	//Sort the below object by age
    	class Person {
    	    String name;
    	    int age;

    	    Person(String name, int age) {
    	        this.name = name;
    	        this.age = age;
    	    }

    	    public int getAge() {
    	        return age;
    	    }

    	    @Override
    	    public String toString() {
    	        return name + " (" + age + ")";
    	    }
    	}
    	List<Person> people = Arrays.asList(
    		    new Person("John", 25),
    		    new Person("Alice", 30),
    		    new Person("Bob", 20)
    		);
    	people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
    	
    	//Find first element divisible by 3
    	List<Integer> numbers5 = Arrays.asList(1, 4, 6, 7, 9);
    	numbers5.stream().filter(nums -> nums%3 == 0).findFirst();
    	
    	//Group element by their age
    	List<Person> people2 = Arrays.asList(
    		    new Person("John", 25),
    		    new Person("Alice", 30),
    		    new Person("Bob", 25)
    		);

    	Map<Integer, List<Person>> mapq = people2.stream().collect(Collectors.groupingBy(Person::getAge));
    	
    	//Merge Two List
    	List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
    	List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
    	Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
    	
    	//Remove Duplicates from List
    	List<Integer> numbers6 = Arrays.asList(1, 2, 3, 3, 4, 5, 5);
    	numbers6.stream().distinct().collect(Collectors.toList());
    	
    	//Find average of list of integer
    	List<Integer> numbers7 = Arrays.asList(2, 4, 6, 8, 10);
    	numbers.stream().mapToInt(Integer::intValue).average();
    	
    	//Longest string in the list
    	List<String> fruits2 = Arrays.asList("apple", "banana", "kiwi", "strawberry");
    	fruits2.stream().max(Comparator.comparingInt(String::length));
    	
    	//Convert list of integer into string
    	List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);
    	numbers8.stream().map(String::valueOf).collect(Collectors.toList());
    	

    }
}
