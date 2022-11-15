package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Madam";
		String rev = "";
		char[] charArray = s.toCharArray();
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(charArray[i]);
			rev=rev+charArray[i];
		}
		System.out.println("Original String= " + s);
		System.out.println("Reversed String= "+rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Given string \""+s+"\" is Palindrome");
		}
		else
		{
			System.out.println("Given string \""+s+"\" is NOT Palindrome");
		}

	}

}
