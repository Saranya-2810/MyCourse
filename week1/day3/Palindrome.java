package week1.day3;

public class Palindrome {
	public static void palindrome(String str) {
		String rev = "";
		for(int i = str.length()-1;i>= 0;i--) {
			rev += str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(str+" is a Palindrome");
		}
		else{
			System.out.println(str+" is not a Palindrome");
		}
	}
public static void main(String[] args) {
	String str = "Madam";
	palindrome(str);
}
}
