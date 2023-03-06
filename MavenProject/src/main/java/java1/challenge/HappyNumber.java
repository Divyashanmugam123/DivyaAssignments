package java1.challenge;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 19;
		int original = n;
		int quotient;
		int rem;
		int quoSq;
		int remSq;
		
		while(n>1)
		{
			quotient = n/10;
			rem = n%10;
			quoSq = (int) Math.pow(quotient, 2);
			remSq = (int) Math.pow(rem, 2);
			n= quoSq + remSq;
			
			System.out.println(quoSq+"+"+remSq+ " = "+n);
			if (n%10==0)
			{
				n = 1;
			}
						
		}
		if(n ==1)
		{
		System.out.println("Given number "+original+" is a Happy number");
		}
		else
		{
			System.out.println("Given number "+original+" is NOT a Happy number");
		}
	}

}
