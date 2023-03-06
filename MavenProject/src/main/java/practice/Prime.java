package practice;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Prime {
//	 int num = 40;
	 boolean isPrime = true;
	 
    
	

	public void prime()
	{
		System.out.println("Enter the number");
		Scanner myObj = new Scanner(System.in);
		
		int num = myObj.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				System.out.println("Number "+num+" is not prime");
				break;
			}
		}
		if (isPrime)
		{
			System.out.println("Number "+num+" is prime");
		}
	}
	public static void main(String[] args) {
	
		Prime p = new Prime();
		p.prime();
	
	}

}
