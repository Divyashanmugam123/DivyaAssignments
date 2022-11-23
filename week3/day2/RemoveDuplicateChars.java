package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
//		Declare a String as PayPal India
		String s = "PayPal India";

//		Convert it into a character array
		char[] charArray = s.toCharArray();

//		Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();

//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

//		Iterate character array and add it into charSet
		for (Character c : charArray) {
//			if the character is already in the charSet then, add it to the dupCharSet
			if(!charSet.add(c))
			{
				dupCharSet.add(c);
			}
			else {
			charSet.add(c);
			}
		}
	    System.out.println("Original Charset after removing charset = " + charSet);
	    System.out.println("Duplicates chars = " +dupCharSet);


//		Check the dupCharSet elements and remove those in the charSet
         for (Character c1 : dupCharSet) {
        	 charSet.remove(c1);
         }

         System.out.println("Only Unique chars = "+charSet);
//		Iterate using charSet
         for (Character c3 : charSet) {
//	Check the iterator variable isn't equals to an empty space
	   if(c3.equals(' '))
	   {
		charSet.remove(c3);
		break;
	   }
}
//		print it
       System.out.println("After removing empty space = " + charSet);

	}

}
