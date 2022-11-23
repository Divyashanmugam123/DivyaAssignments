package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Divyiya";
		name= name.toLowerCase();
		char[] charName = name.toCharArray();
		Set<Character> uniChar = new HashSet<Character>();
		for(int i=0;i<charName.length;i++)
		{
			boolean add = uniChar.add(charName[i]);
			if(!add)
			{
				if(uniChar.contains(charName[i]))
				{
					uniChar.remove(charName[i]);
				}
				else
				{
				uniChar.add(charName[i]);
			}
		}
		}
		System.out.println(uniChar);

	}

}
