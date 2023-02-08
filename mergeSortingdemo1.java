

				// Type 2 Merge sort 


package DSA;

import java.util.Arrays;

public class mergeSortingdemo1 {

	public static void main(String [] args) {
		
		
		int[] arr= {5,9,6,4,1,3,8,2};
		Sorting1.mergeSorting(arr,0,arr.length);			//method invoking
		System.out.println("Sorting array of merging sort list: "+Arrays.toString(arr));
	}

}
