package week2.day2;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
        int letter = 0, space=0, digit = 0, specialChar=0;
        char[] charTest = test.toCharArray();
        System.out.println("Total number of chars in a string ="+ charTest.length);
        for (int i=0;i<charTest.length;i++)
        {
        	if (Character.isLetter(charTest[i]))
        	{
        		letter++; 
        	}
        	else if(Character.isDigit(charTest[i]))
        	{
        		digit++;
        	}
        	else if(Character.isSpaceChar(charTest[i]))
        	{
        		space++;
        	}
        	else
        		{
        		specialChar++;
        		}
        	}
        System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + digit);
		System.out.println("specialCharcter: " + specialChar);

		

	}

}
