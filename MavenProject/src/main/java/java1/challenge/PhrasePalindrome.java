package java1.challenge;

public class PhrasePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A man, a plan, a canal: Panama";
		String rev = "";
		String strip="";
		char[] charArray = s.toCharArray();
		for (int i=s.length()-1;i>=0;i--)
		{
			if(Character.isLetter(charArray[i]))
			{
			rev=rev+charArray[i];
			}
		}
		for(int j=0;j<s.length();j++)
		{
			if(Character.isLetter(charArray[j]))
			{
			strip=strip+charArray[j];
			}
		}
		System.out.println("Original String= " + strip);
		System.out.println("Reversed String= "+rev);
		if(strip.equalsIgnoreCase(rev))
		{
			System.out.println("Given string \""+strip+"\" is Palindrome");
		}
		else
		{
			System.out.println("Given string \""+strip+"\" is NOT Palindrome");
		}
		
		String s2 = "race a car";
		s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
		String rev2= "";
		char[] charArray2 =s2.toCharArray();
		for (int k=s2.length()-1;k>=0;k--)
		{
			if(Character.isLetter(charArray2[k]))
			{
			rev2=rev2+charArray2[k];
			}
		}
		System.out.println("Original String= " + s2);
		System.out.println("Reversed String= "+rev2);
		if(rev2.equalsIgnoreCase(s2))
		{
			System.out.println("Given string \""+s2+"\" is Palindrome");
		}
		else
		{
			System.out.println("Given string \""+s2+"\" is NOT Palindrome");
		}
				
	}

}
