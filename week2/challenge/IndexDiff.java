package java1.challenge;

public class IndexDiff {

	public static void main(String[] args) {
	// Declare a int Array and k.
		int[] nums = {1,2,3,1,2,3};
		int k =2;
		int diff;
		int occ=0;
		
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
					if (occ >0)
					{
					diff = j-i;
					System.out.println("Differnce of indexes = "+diff);
					if(diff<=k)
					{
					System.out.println("True");
					
					
					}
					else
					{
						System.out.println("False");
						
					}
					break;
					}
					
				}
				
				}
				
			}
			if (occ > 0)
			{
				break;
			}
		}
		

	}

}
