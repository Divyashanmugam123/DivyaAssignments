package week3.day2;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		       // Here is the input
				int[] num = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;
				 
//				 * a) Create a empty Set Using TreeSet
				Set<Integer> unique = new TreeSet<Integer>();
					
//				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				for (int i=0;i<num.length;i++)
				{
					unique.add(num[i]);
				}
				
				int numOfItems = unique.size();
//				 * c) converted Set into List
				List<Integer> find = new ArrayList<Integer>(numOfItems);
				for (Integer i : unique) {
					find.add(i);
				}
				System.out.println("Items in the list = "+find);
//				 * d) Print the second last element from List
				System.out.println("Second Largest Number in the List = " + find.get(numOfItems-2));
				 

	}

}
