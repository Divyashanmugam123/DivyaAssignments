package week3.day1;

public class Calculator {

	 public void add (int a, int b)
     {
		 int sum = a+b;
    	 System.out.println("Sum of two numbers = "+sum);
    	 
     }
	 public void add(int a, int b, int c)
	 {
		 System.out.println("Sum of three numbers = " +(a+b+c));
	 }
	 
	 public void sub(double s1, double s2)
	 {
		 System.out.println("Subtraction with double  = " +(s1-s2));
	 }
	 public void sub(int s1, int s2)
	 {
		 System.out.println("Subtraction with int = " +(s1-s2));
	 }
	 public void mul(int m1, double m2)
	 {
		 System.out.println("Multiplication of int and double" +(m1*m2));
	 }
	 public void mul(double m1, double m2)
	 {
		 System.out.println("Multiplication with two doubles" +(m1*m2));
	 }
	public static void main(String[] args) {
    
     Calculator c= new Calculator();
     c.add(5, 8);
     c.add(4, 10, 12);
     c.sub(15.5, 12.3);
     c.sub(22, 12);
     c.mul(4, 5.5);
     c.mul(6.5, 8.2);
     
	}

}
