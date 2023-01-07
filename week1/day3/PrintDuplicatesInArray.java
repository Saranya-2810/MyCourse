package week1.day3;

public class PrintDuplicatesInArray {
	public static void sumElements(int[] arr) {
		int count ;
		for(int i = 0; i < arr.length; i ++) {
			count = 0;
			for(int j =0; j < arr.length; j++ ) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] +" repeats "+count+" times.");
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,6,5,4,3,2,1,5,6,3,2,4,1,6,7};
		sumElements(arr);
	}
}
