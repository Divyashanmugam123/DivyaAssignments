package practice;

public class PalondromeString {

	public static void main(String[] args) {
		String s = "Level";
		char[] schar = s.toCharArray();
		String rev = "";
	
		for(int i=schar.length-1;i>=0;i--)
		{
			rev = rev+schar[i];
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Given String "+s+" is Palindorme");
			
		}
		else
		{
			System.out.println("Given String"+s+" is NOT Palindorme");
		}

	}

}
