package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		Generic<Integer> generic = new Generic<Integer>();
		generic.setValue(1);
		Integer print = generic.getValue();
		if(print == 1) {
			System.out.println("Printed");
		}
	}
}

public class Generic<T> {
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
