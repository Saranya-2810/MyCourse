package week1.day2;

public class Calculator {
	public int addThreeNumbers(int a, int b, int c)
	{
		return a+b+c;
	}
	public int multiply(int a, int b)
	{
		return a * b;
	}
	public int divide(int a, int b)
	{
		return a / b;
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int sum = obj.addThreeNumbers(5,6,7);
		System.out.println("Addition : "+sum);
		
		System.out.println("Multiplication : "+obj.multiply(5,6));
		System.out.println("Div : "+obj.divide(10, 5));
	}
}
