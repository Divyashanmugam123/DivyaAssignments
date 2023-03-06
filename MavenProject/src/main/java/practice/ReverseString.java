package practice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Divya";
		char[] schar = s.toCharArray();
		String rev = "";
	
		for(int i=schar.length-1;i>=0;i--)
		{
			rev = rev+schar[i];
		}
		System.out.println("Reversed String "+rev);

	}

}
