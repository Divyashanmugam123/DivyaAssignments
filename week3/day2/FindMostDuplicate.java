package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicate {

	public static void main(String[] args) {
    
	
          String text="bbabababa";
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
              
            }
                  
          System.out.println("no of occurence = "+  maxOccurrence);
          System.out.println("character = " + Key);
              
          }
 
}
