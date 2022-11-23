package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUniqueChar {

	public static void main(String[] args) {
	String CompanyName = "google";
	char[] charArray = CompanyName.toCharArray();
	Set<Character> onlyUnique = new HashSet<Character>();
	
	for (int i=0;i<charArray.length;i++)
	{
	
					    onlyUnique.add(charArray[i]);
	}

	System.out.println(onlyUnique);
	}
}
