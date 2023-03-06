package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data= {165,54,98,76,56};
		
		Arrays.sort(data);
		
		System.out.println("Second largest number is "+ data[data.length-2]);
		
		// TODO Auto-generated method stub

	}

}
