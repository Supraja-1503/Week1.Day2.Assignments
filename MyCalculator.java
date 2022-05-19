package week1.day2.assignments;

public class MyCalculator 

{

	public static void main(String[] args) 
		
		{
			Calculator cal = new Calculator();
			System.out.println("Addition of two numbers: " +cal.add(10, 15, 20));
			System.out.println("Subtraction of two numbers: " +cal.sub(50, 30));
			System.out.println("Multiplication of two numbers: " +cal.mul(25, 5));
			System.out.println("Division of two numbers: " +cal.div(60, 3));
			
		}

}