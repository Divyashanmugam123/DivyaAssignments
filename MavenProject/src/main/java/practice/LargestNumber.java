package practice;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int[] nums = {50, 75, 83,25, 58};
		
		Arrays.sort(nums);
		
		System.out.println("Largest number in an array = "+nums[nums.length-1]);
		System.out.println("Second Largest number in an array = "+nums[nums.length-2]);
		System.out.println("Third smalles number in an array = "+nums[2]);

	}

}
