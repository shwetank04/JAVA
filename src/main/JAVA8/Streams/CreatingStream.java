package JavaPractice;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//From Collection.
		List<Integer> salList = Arrays.asList(300,400,400,500);
		Stream<Integer> stream = salList.stream();
		
		//From Arrays
		Integer[] arr = {20,49,33,44,55};
		Stream<Integer> stream1 = Arrays.stream(arr);
		
		//Static
		Stream<Integer> s = Stream.of(1000,34,55,78);
	}
}
