package week1.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FibonacciSeries {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		
		System.out.println("Fibonacci Series for 8:");
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i = 2;i<range;i++)
		{
			
			sum = firstNum +secNum;
			firstNum = secNum;
			secNum = sum;
            System.out.println(sum);
		}

	}

}
