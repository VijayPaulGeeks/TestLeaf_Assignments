package week4.day1;

public class JavaClass {
	public void reportStep(String a,String b) {
		// TODO Auto-generated method stub
      System.out.println(a+b);
	}
	public void reportStep(String c, String d, Boolean e ) {
		// TODO Auto-generated method stub
      System.out.println(c+d +" "+ e);
	}
	
	public static void main (String[] args) {
		
		JavaClass learn = new JavaClass();
		learn.reportStep("Login Successful", " PASS");
		learn.reportStep("Homepage loaded", " Pass",true );
	}	
	
}
