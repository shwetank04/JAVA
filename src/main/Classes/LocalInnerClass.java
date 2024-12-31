public class Main {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		outer.display();
	}
}

public class OuterClass {
	
	public void display() {
	 class InnerClass {
		public void print() {
			System.out.println("Hi From Inner");
			}
	 	}
	 InnerClass inner = new InnerClass();
	 inner.print();
	}
}

