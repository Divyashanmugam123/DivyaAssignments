package practice;

public class ReverseNum {

	public static void main(String[] args) {
		 int num =123456;
		  int rev =0, rem=0;
		  int original = num;
		 
		  while(num>0)
		  {
			  rem = num%10;
			  rev = rev*10+rem;
			  num= num/10;
		  }
		System.out.println("Rversed number "+ rev);

	}

}
