package week2.day2;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   fly me   to   the moon  ";
		String[] sep = s.split(" ");
		String lastWord = sep[sep.length-1];
		int len = lastWord.length();
		System.out.println("The last word is \""+lastWord+ "\" with length "+len);
		
	}

}
