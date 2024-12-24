public class Main {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () -> 25;
	     
		System.out.println(supplier.get());
	}
}

package JavaPractice;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Supplier<T> {
	T get();
}
