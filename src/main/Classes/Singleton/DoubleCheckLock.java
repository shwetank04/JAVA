public class Main {

	public static void main(String[] args) {
		
		System.out.println(DbConnector.getInstance());
	}
}

public class DbConnector {
	
	private static volatile DbConnector instance;
	
	DbConnector() {}
	
	public static DbConnector getInstance() {
		if(instance == null) {
			synchronized(DbConnector.class) {
				if(instance == null) {
					instance = new DbConnector();
				}
			}
		}
		return instance;
	}
}
