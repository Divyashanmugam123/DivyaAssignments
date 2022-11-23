package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicate {

	public static void main(String[] args) {
		String input = "abbaba";

//		  1) Map -> HashMap 
		Map<Character,Integer> charOcc = new HashMap<Character, Integer>();
//		  2) String -> ch[] -> Get all the character -> occurance
		char[] charArray = input.toCharArray();
//		  3) Keep comparing the occurance with other values -> max value -> character
		int maxValue = 1;
          for (int i=0;i<charArray.length;i++)
          {
        	  if(charOcc.containsKey(charArray[i]))
        	  {
        		  int value = charOcc.get(charArray[i]);
        		  charOcc.put(charArray[i], value+1);
        		  maxValue++;
        		  if(maxValue>1)
        		  {
        			  System.out.println("Most duplicate char = "+charArray[i]);
        			 
        		  }
        	  }
        	  else
        	  {
        		  charOcc.put(charArray[i], 1);
        	  }
          }
          System.out.println(charOcc);
         
	
          String text="ababababa";
          Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
          char[] charArray1= text.toCharArray();
          for(char ch : charArray1)
          {
              map.put(ch, map.getOrDefault(ch,0)+1) ;   
              }
          System.out.println(map);
          
          Set<Entry<Character,Integer>> entrySet = map.entrySet();
          int maxOccurrence=0;
          char Key=0;
          for(Entry<Character,Integer>entry: entrySet) {
              
          //if(value>0)
              if(entry.getValue()>maxOccurrence)
          {
              Key=entry.getKey();
              maxOccurrence=entry.getValue();
          }
              
              Key=entry.getKey();
              maxOccurrence=entry.getValue();
             
          
          }
          
          
          System.out.println("no of occurence"+  maxOccurrence);
          System.out.println("character"+"  " + Key);
              
          }
 
}
