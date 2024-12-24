package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		Function<Integer,Integer> function = (val) -> val*2;
	     
		System.out.println(function.apply(5));
	}
}

package JavaPractice;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Function<T,R> {
	R apply(T t);
}
