package practice;

public class Factorial {

	public static void main(String[] args) {
		
		int fact = 1;
		
		int limit = 6;
		
		for (int i=limit;i>0;i--)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of a given number is "+fact);

	}

}
