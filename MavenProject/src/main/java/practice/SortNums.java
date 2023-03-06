package practice;

import java.util.Arrays;

public class SortNums {

	public static void main(String[] args) {
		int[] nums = {5, 4, 6, 3, 2, 1};
		
		Arrays.sort(nums);
		System.out.println("Sorted numbers");
		for (int i=0;i<nums.length;i++)
		{
		System.out.println(nums[i]);
		}

	}

}
