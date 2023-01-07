package week1.day3;

public class ChangeOddIndexToUpperCase {
	public static void changeOddIndex(String str) {
		char [] arr = str.toCharArray();
		for(int i = 0; i< arr.length;i++) {
			if(i%2 == 0) {
				continue;
			}
			else {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		System.out.println(new String(arr));
	}
	public static void main(String[] args) {
		
		String test = "changeme";
		changeOddIndex(test);
		
	
	}
}
