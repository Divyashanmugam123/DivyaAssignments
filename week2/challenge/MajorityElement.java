package java1.challenge;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MajorityElement {

	public static void main(String[] args) {
     //Declare an Int Array, mejval= 0
		int[] nums = {2,2,1,1,1,2,2,1,2};
		int mejVal = 0;
		int key1 =0;
		
		//Add them into Map to store the num and it's occurances
		Map<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
		for (int i=0;i<nums.length;i++)
		{
			numMap.put(nums[i],numMap.getOrDefault(nums[i], 0)+1);
		}
		
		//Create a entry set
		Set<Entry<Integer, Integer>> entrySet = numMap.entrySet();
		
		//Get the value of the num and keep comparing with the mejVal to know mejority element.
		for (Entry<Integer, Integer> entry : entrySet) {
			int value = entry.getValue();
			
			if(value>mejVal)
			{
				key1= entry.getKey();
				mejVal = value;
			}
			
		}
		
		System.out.println("Mejority Element is \""+key1+"\" occured "+mejVal+ " times");
		
	
		
		

	}

}
