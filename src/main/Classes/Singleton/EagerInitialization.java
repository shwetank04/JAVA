public class Main {

	public static void main(String[] args) {
		
		System.out.println(DbConnector.getInstance());
	}
}


public class DbConnector {
	
	private static DbConnector instance = new DbConnector();
	
	DbConnector() {}
	
	public static DbConnector getInstance() {
		return instance;
	}
}
