package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		FunctInterface eagle = (String value) -> {
			System.out.print(value);
		};
		
		eagle.fly("Eagle Fly Interface");
	}
}


// package JavaPractice;

// import java.lang.FunctionalInterface;

// @FunctionalInterface
// public interface FunctInterface {
// 	void fly(String value);
// }
