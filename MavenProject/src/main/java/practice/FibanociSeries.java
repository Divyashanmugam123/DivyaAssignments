package practice;

public class FibanociSeries {

	public static void main(String[] args) {
		int limit = 8;
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for(int i=2;i<limit;i++)
		{
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
		}

	}

}
