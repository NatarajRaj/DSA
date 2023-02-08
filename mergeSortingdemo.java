package DSA;

import java.util.Arrays;

public class mergeSortingdemo {
	
	public static void main(String [] args) {
		
	
		int[] arr= {5,9,6,4,1,3,8,2};
		arr=Sorting.mergeSort(arr);			//method invoking
		System.out.println("Sorting array of merging sort list: "+Arrays.toString(arr));
	}

}
