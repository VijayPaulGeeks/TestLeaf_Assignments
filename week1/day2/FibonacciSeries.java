package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int range = 8;
       int first = 0;
       int second = 1;
       System.out.println(first+" "+second);
       for (int i = 2; i <=range; i++) {
		 
		 int next = first + second;
		 System.out.print(" " + next);
		 first=second;
		 second=next;
	}
	}

}
