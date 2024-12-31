package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		Generic generic = new Generic();
		generic.setValue(1);
		Object print = generic.getValue();
		if((int)print == 1) {
			System.out.println("Printed");
		}
	}
}

package JavaPractice;


public class Generic {
	
	Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
	
}
