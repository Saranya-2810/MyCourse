package week1.day2;

public class Fibonacci{
	
	public static void main(String[] args) {
		int firstNo=0;
		int secNo=1;
		int sum=0;
		System.out.println(firstNo);	
		for(int i=0; i<=11; i++)
		{
			firstNo=secNo;
			secNo=sum;
			sum=firstNo+secNo;
			System.out.println(sum);
		}

	}
}
