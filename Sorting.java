package DSA;

import java.util.Arrays;

public class Sorting {
	public static int[] mergeSort(int[] arr) 
	{
		if(arr.length==1)
				return arr;
	int mid=arr.length/2;
	
	int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
	int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
	return merge(left,right);
	}
	
	public static int[] merge(int[] first,int[] second) {				//first.to merge the first & second half of array
		int [] joined=new int[first.length+second.length];
		int i=0;int j = 0;int k = 0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j])
			   joined [k++]=first[i++];
			else
				joined [k++]=second[j++];
		}
		
		while(i<first.length) {				//before while condition failed this loop & below loop runs
			joined[k++]=first[i++];
		}
		
		while(j<second.length) {
			joined[k++]=second[j++];
		}	
			
		return joined;
		}
	
}
	
	
