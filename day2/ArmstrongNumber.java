package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 155;
		int calculated = 0;
		int remainder;
		int original;
		original = input;
		
		while(input>0)
		{
			remainder = input%10;
			input = input/10;
			calculated = calculated + (remainder*remainder*remainder);
			
		}
						
		if (calculated == original)
		{
			System.out.println(original + " is an Amstrong number");
		}

		else
		{
			System.out.println(original + " is not an Amstrong number");
		}
	}

}
