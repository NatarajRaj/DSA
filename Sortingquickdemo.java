package DSA;

import java.util.Arrays;

public class Sortingquickdemo {

	
	public static void main(String[] args)
	{
		int[] arr= {5,8,4,3,7,6,2,9,5};
		Sortingquick.quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
