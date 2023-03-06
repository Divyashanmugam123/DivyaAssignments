package practice;

public class SubString {

	public static void main(String[] args) {
	String s1 = "Hi How are you";
	String s2 = "how";
	s1 = s1.toLowerCase();
	s2 = s2.toLowerCase();
	if (s1.contains(s2))
	{
		System.out.println("Given string exists in s1");
	}
	else
	{
		System.out.println("Given string does NOT exist in s1");
	}
	}
}
