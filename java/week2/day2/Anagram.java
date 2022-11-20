package week2.day2;

import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		int t= 0;
		int f = 0; 
		if(text1.length()==text2.length())
		{
			char[] text1Arr = text1.toCharArray();
			char[] text2Arr = text2.toCharArray();
			Arrays.sort(text1Arr);
			Arrays.sort(text2Arr);
			for (int i=0;i<text1Arr.length;i++)
			{				
					if(text1Arr[i]==text2Arr[i])
					{
						
						t++;
					}
					else
					{
						f++;
					}
					
				}
			if (t == text1.length())
			{
				System.out.println("\""+text1+"\" and \""+ text2+ "\" strings are same after sorting the Array");
			}
			else
			{
				System.out.println(text1+" and "+ text2+ " strings are NOT same after sorting the Array");
			}
			}
		else
		{
			System.out.println("String lengths are not same, hence can't be compared");
		}
			
	}
	
}



