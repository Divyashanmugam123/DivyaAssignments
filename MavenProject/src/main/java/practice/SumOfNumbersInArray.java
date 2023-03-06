package practice;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		int[] nums = {15, 12,10};
		int sum = 0;
		
		for (int i=0;i<nums.length;i++)
		{
			sum = sum+nums[i];
		}

		System.out.println("Sum of numbers in Array "+sum);
	}

}
