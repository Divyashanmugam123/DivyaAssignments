package java1.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		
		int occ = 0;
		
		//Creating a map to store the number of occurrences for each number
		Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
		for (int i=0;i<arr.length;i++)
		{
			arrMap.put(arr[i], arrMap.getOrDefault(arr[i], 0)+1);
		}
		//storing that into entrySet
		Set<Entry<Integer, Integer>> entrySet = arrMap.entrySet();
		
		//creating a list to store only occurrences
		List<Integer> arrList = new ArrayList<Integer>();
		
		for (Entry<Integer, Integer> entry : entrySet) {
			arrList.add(entry.getValue());
		}
		
		//Comparing the occurrences value with each other
		for (int i=0;i<arrList.size();i++)
		{
			for (int j=0;j<arrList.size();j++)
			{
				if(i!=j)
				{
				if(arrList.get(i)== arrList.get(j))
				{
					occ++;
					
				}
				else
				{
					occ = 0;
				}
				}
				
			}
		}
		
		if(occ>0)
		{
			System.out.println("Occurences are duplicate - False");
		}
		else
		{
			System.out.println("Occurences are NOT duplicate - True");
		}

	}

}
