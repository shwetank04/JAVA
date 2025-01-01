public class Main {

	public static void main(String[] args) {
		
		System.out.println(DbConnector.getInstance());
	}
}

public class DbConnector {
	
	private static DbConnector instance;
	DbConnector() {
		
	}
	
	synchronized public static DbConnector getInstance() {
		if(instance == null) {
			instance = new DbConnector();
		}
		return instance;
	}
	
}
