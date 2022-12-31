package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListFunctional(List.of(1, 2, 3, 4, 12, 5, 6, 71));
		printEvenNumbersInListFunctional(List.of(1, 2, 3, 4, 12, 5, 6, 71));
	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// convert the list into stream of element
		numbers.stream().forEachOrdered(FP02Functional::print);// Method Reference
		numbers.stream().forEachOrdered(System.out::print);// Method Reference

	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// convert the list into stream of element
		numbers.stream().filter(FP02Functional::isEven).forEach(System.out::println);// Method Reference

		// lambda Expression
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

	}

}
