package JavaPractice;

public class Main {

	public static void main(String[] args) {
		
		for(Enumclass s : Enumclass.values()) {
			System.out.println(s.getDescription());
		}
	}
}

package JavaPractice;


public enum Enumclass {
	
	Sunday("Sunday"),
	Monday("Monday"),
	Tuesday("tuesday");
	
	private String description;

	private Enumclass(String description) {
		this.setDescription(description);
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}

