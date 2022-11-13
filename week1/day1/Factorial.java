package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit = 5;
		int fact = 1;
		
		for (int i=limit; i> 0; i-- )
		{
			fact = fact * i;
			
		}
		System.out.println("5*4*3*2*1 ="+fact);
	}

}
