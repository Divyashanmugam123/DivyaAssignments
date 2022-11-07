package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,3,2,5,7,6,8,9};
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++)
		{
			if (i != arr[i])
			{
				System.out.println(i);
				break;
			}
			
		}
		
		}

	}


