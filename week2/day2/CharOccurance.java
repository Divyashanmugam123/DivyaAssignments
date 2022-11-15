package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char ver = 'e';
		char[] charStr =str.toCharArray();
		for (int i=0;i<charStr.length;i++)
		{
			if (charStr[i]==ver)
			{
				count++;
			}
		}
		
		if (count>1) {
			
			System.out.println("Char \""+ver+"\" occured "+count+" times");
		}
		
	}

}
