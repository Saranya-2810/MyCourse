package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		boolean sPrime = true;
		int num = 60;
				for (int i=num-1; i >=2; i--)
		{
			if(num%i==0) {
				System.out.println(num+" Non Prime");
				sPrime = false;
				break;
			}
		}
		if(sPrime) {
			System.out.println(num+" Prime Number");
		}
		}
}
