package week1.day3;
import java.util.Arrays;

public class MissingElementInAnArray {
	public static int findMissingElement(int[]arr) {
		Arrays.sort(arr);
		for(int i =0; i < arr.length - 1; i++) {
			if((arr[i+1] - arr[i]) > 1) {
				return ((arr[i+1]+arr[i])/2) ;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,6,7,8};
		System.out.println(findMissingElement(arr));

	}
}
