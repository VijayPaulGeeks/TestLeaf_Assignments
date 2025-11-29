package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect(String storage) {
		// TODO Auto-generated method stub
		System.out.println("Connect database: "+ storage);
	}

	@Override
	public void executeUpdate(String update) {
		// TODO Auto-generated method stub
		System.out.println("\nexecute the update querry: "+ update );
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("\nSuccessfully disconnected ebpa storage");
	}
   public static void main(String[] args) {
	   JavaConnection connect = new JavaConnection();
		connect.connect("ebpa_storage");
		connect.executeUpdate("UPDATE employees\r\n"
				+ "SET salary = 55000, department = 'Finance'\r\n"
				+ "WHERE employee_id = 101;\r\n"
				);
		connect.disconnect();
}
}
