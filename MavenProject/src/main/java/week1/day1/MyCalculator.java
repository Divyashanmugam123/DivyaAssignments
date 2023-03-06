/**
 * 
 */
package week1.day1;


public class MyCalculator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calResult = new Calculator();
		int AddR = calResult.add(40, 20, 10);
		System.out.println("Addition= "+AddR);

	    int subR = calResult.sub(50, 30);
	    System.out.println("Substraction = "+subR);
	
	    double mulR = calResult.mul(20.50, 12.05);
	    System.out.println("Multiplication = "+ mulR);
	    
	    float divideR = calResult.divide(65.50f, 5.05f);
	    System.out.println("Division ="+ divideR);
	}

}
