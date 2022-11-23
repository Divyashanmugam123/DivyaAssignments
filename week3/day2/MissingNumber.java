package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
	
    int[] nums = {1,2,5,7,3,5,8,6,9,10};
    Set<Integer> unique = new TreeSet<Integer>();
    for(int i=0;i<nums.length;i++)
    {
    unique.add(nums[i]);
	}

    System.out.println("After removing duplicates "+unique);
    for(int j=1;j<unique.size()+1;j++)
    {
    	if(!unique.contains(j))
    	{
    		System.out.println("Missing number = "+j);
    	}
    }
}
}
