package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (val) -> val>2;
	     
		System.out.println(predicate.test(5));
	}
}

package JavaPractice;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
