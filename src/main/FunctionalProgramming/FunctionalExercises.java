package programming;

import java.util.List;

public class FPExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "APIS", "Microservices", "AWS");
		printOddNumbersInListFunctional(List.of(1, 2, 3, 4, 12, 5, 6, 71));
		printSpringCourseInListFunctional(courses);
		printCourseWith4CharactersInListFunctional(courses);
		printSquareOfOddNumbersInListFunctional(List.of(1, 2, 3, 4, 12, 5, 6, 71));
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

	}

	private static void printSpringCourseInListFunctional(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}

	private static void printCourseWith4CharactersInListFunctional(List<String> courses) {
		courses.stream().filter(course -> course.length() == 4).forEach(System.out::println);
	}

	private static void printSquareOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number).forEach(System.out::println);

	}

}
