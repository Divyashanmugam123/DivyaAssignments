package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharOccurance {

	public static void main(String[] args) {
		String text = "Hello";
		
		char[] textChar = text.toCharArray();
		
		Map<Character,Integer> mapText = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<textChar.length;i++)
		{
			mapText.put(textChar[i], mapText.getOrDefault(textChar[i], 0)+1);
		}
		System.out.println(mapText);
		Set<Entry<Character, Integer>> entrySet = mapText.entrySet();
		
		
		
		
	}

}
