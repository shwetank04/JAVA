package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		Enumclass monday = Enumclass.Monday;
		System.out.println(monday);
		
		for(Enumclass s : Enumclass.values()) {
			System.out.println(s.ordinal());
		}
	}
}


package JavaPractice;


public enum Enumclass {
	
	Sundy,
	Monday,
	Tuesday
}
