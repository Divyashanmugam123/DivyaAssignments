package practice;

public class PalindromeNum {

	public static void main(String[] args) {
	  int num =121;
	  int rev =0, rem=0;
	  int original = num;
	 
	  while(num>0)
	  {
		  rem = num%10;
		  rev = rev*10+rem;
		  num= num/10;
	  }
	  if(original==rev)
	  {
	  System.out.println("Given number "+original+" is Palindorome");
	  }
	  else
	  {
		  System.out.println("Given number "+original+" is NOT Palindorome"); 
	  }

	}

}
