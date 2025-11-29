package week4.day1;



public class APIClient {
	public void sendRequest(String endpoint) {
		// TODO Auto-generated method stub
      System.out.println("The API endpoint for this http req is: "+ endpoint);
	}
	public void sendRequest(String endpoint,String body,Boolean response) {
		
		if (body.contains("200")) {
			
			System.out.println("The endpoint call for this http req is: " + endpoint +"\nBody: " + body + "\nresponse: " +response);
		
		
		}
		else {
			System.out.println("\nBad request");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient client = new APIClient();
		client.sendRequest("GET /api/v1/users");
		client.sendRequest("POST /api/v1/login", "username:vijay,password:password123,Success response 200 OK", true);
      
	}

}
