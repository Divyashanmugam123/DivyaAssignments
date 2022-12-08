package java1.challenge;

public class FindSingle {

	public static void main(String[] args) {
		//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

		//You must implement a solution with a linear runtime complexity and use only constant extra space.

		int[] nums = {1};
		
		int occ =0;
		
		for (int i=0;i<nums.length;i++)
		{
			occ = 0;
			for(int j=0;j<nums.length;j++)
			{
				if(i!=j)
				{
				if(nums[i]==nums[j])
				{
					occ++;
				}
				}
			}
			
			if(occ==0)
			{
				System.out.println("Single occurance Number = "+ nums[i]);
			}
		}

	}

}
