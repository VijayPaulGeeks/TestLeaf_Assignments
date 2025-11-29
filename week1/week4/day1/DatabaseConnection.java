package week4.day1;

public interface DatabaseConnection {
      
	void connect(String storage);
	
	void executeUpdate(String update);
	
	void disconnect();
	
}
