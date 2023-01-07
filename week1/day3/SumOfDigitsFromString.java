package week1.day3;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		 String text = "Tes12Le79af65";
		 
		    int sum = 0;
		    
		    String strippedText = text.replaceAll("[^0-9]", "");

		    char[] charArray = strippedText.toCharArray();

		    for (char c : charArray) {
		     
		      int num = Character.getNumericValue(c);
		    
		      sum += num;
		    }

		    System.out.println("Sum: " + sum);

	}
}
