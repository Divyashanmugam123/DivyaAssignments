package java1.challenge;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class NumsOccurance {

	public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    Map<Integer, Integer> occ = new TreeMap<Integer, Integer>();
for (int i=0;i<nums.length;i++)
{
	occ.put(nums[i], occ.getOrDefault(nums[i], 0)+1);
	}
Set<Entry<Integer, Integer>> entrySet = occ.entrySet();
int maxOcc = 0;
for (Entry<Integer, Integer> entry : entrySet) {
	int value = entry.getValue();
	if (value>=2)
	{
		maxOcc = value;
		break;
	}
	
	}
if (maxOcc>=2)
{
	System.out.println("True");
}
else
{
	System.out.println("False");
	
}


	}
	

}
