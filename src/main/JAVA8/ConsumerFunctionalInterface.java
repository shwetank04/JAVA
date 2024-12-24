public class Main {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (Integer value) -> {
			System.out.print(value>10);
		};
	     
		consumer.accept(2);
	}
}

// package JavaPractice;

// import java.lang.FunctionalInterface;

// @FunctionalInterface
// public interface Consumer<T> {
// 	void accept(T t);
// }
