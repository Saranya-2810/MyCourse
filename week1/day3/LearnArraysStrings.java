package week1.day3;

import java.util.Arrays;

public class LearnArraysStrings {
	public static void minMaxArray(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		System.out.println("Minimum Value :  "+arr[0]);
		System.out.println("Maximum Value :  "+arr[len - 1]);
		System.out.println("2nd Maximum Value :  "+arr[len - 2]);
	}
	
	public static void  strOccur(String str,char a) {
		char[] arr = str.toCharArray();
		int count = 0;
		for(char c : arr) {
			if(c == a) {
				count++;
			}
		}
		System.out.println(a + " occurs "+ count +" times in the string "+ str);
		
	}
	
	public static void main(String[] args) {
		int [] arr = {56,66,4,3,2,5,7,8,9,11,23,45,6,4,22};
		minMaxArray(arr);
	
		String str = "testleaf";
		char check = 't';
		strOccur(str,check);
	}
}
