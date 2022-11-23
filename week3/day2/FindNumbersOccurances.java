package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {

		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		  
//		  1) Create Map -> TreeMap 
		Map<Integer,Integer> mapNum = new TreeMap<Integer,Integer>();
		
//		  2) For loop -> each number -> add to the map 
		for (int i=0;i<input.length;i++) {
//	      3) If it is exist -> update it with + 1 Else -> new entry with 1 as value
			if(mapNum.containsKey(input[i]))
			{
				int value = mapNum.get(input[i]);
				mapNum.put(input[i], value+1);
			}
			else
			{
				mapNum.put(input[i], 1);
			}
			
		}
		System.out.println(mapNum);
  	 

	}

}
