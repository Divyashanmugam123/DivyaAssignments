package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapOccuranceOfNum {

	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 3, 2, 5};
		Map<Integer, Integer> numsOcc = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(numsOcc.containsKey(nums[i]))
			{
				int value = numsOcc.get(nums[i]);
				
				numsOcc.put(nums[i], value+1);
			}
			else
			{
				numsOcc.put(nums[i], 1);
			}
		}
		
     System.out.println(numsOcc);
	}

}
