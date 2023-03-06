package practice;

public class FindVowels {

	public static void main(String[] args) {
		String text = "DivyA";
		text = text.toLowerCase();
		char[] textChar = text.toCharArray();
		int count =0;
		
		for (int i=0;i<textChar.length;i++)
		{
			if(textChar[i]=='a' || textChar[i]=='e' || textChar[i]=='i' || textChar[i]=='o' || textChar[i] =='u')
			{
				count++;
			}
		}
		
		System.out.println("Number of Vowels in the text "+count);

	}

}
