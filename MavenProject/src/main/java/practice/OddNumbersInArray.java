package practice;

public class OddNumbersInArray {

	public static void main(String[] args) {
		int[] nums = {11, 16, 8, 27};
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2!=0)
			{
				System.out.println("Number "+nums[i]+ " is an Odd number");
			}
		}

	}

}
