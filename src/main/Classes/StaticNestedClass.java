public class Main {

	public static void main(String[] args) {
		
		OuterClass.InnerClass Innerouter = new OuterClass.InnerClass();
		Innerouter.pirnt();
	}
}


public class OuterClass {
	
	protected static class InnerClass {
		public void pirnt() {
			System.out.println("Hi From Inner");
		}
	}
}

