package week1.day3;

public class FindIntersection {
	public static void main(String[] args) {
		int[] arr1 = {3, 2, 11, 4, 6, 7};
	    int[] arr2 = {1, 2, 8, 4, 9, 7};
	   outer: 
	    for(int i : arr1) {
	    	for(int j : arr2) {
	    		if(i == j) {
	    			System.out.println("The First Intersecting element in both the arrays is : "+i);
	    			break outer;
	    		}
	    	}
	    }

	}
}
