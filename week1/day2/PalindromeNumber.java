package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		int original = 121;
		int reverse = 0;
		for (int i = original; i>0; i=i/10) {
			
			int rem = i%10;
			reverse = (reverse * 10) + rem;
		}
          if (original==reverse) {
        	System.out.println("Then 121 is a palindrome number");
        }
          else {
        	System.out.println("121 is not a palindrome number");
        }
	}

}
