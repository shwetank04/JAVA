package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListStructured(List.of(1, 2, 3, 4, 12, 5, 6, 71));
		printEvenNumbersInListStructured(List.of(1, 2, 3, 4, 12, 5, 6, 71));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (int i : numbers) {
			System.out.println(i);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (int i : numbers) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
