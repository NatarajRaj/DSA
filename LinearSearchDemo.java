package DSA;

import java.util.Arrays;

public class LinearSearchDemo {
	
	public static void main(String [] args)
	{
		int[] arr= {3,5,2,4,6};
		System.out.println("Postion of entered find data index: "+LinearSearch.find(arr,5));
		System.out.println("Postion of entered find data index: "+LinearSearch.find(arr,7));
		
		System.out.println("Postion of entered contain data index: "+LinearSearch.contains(arr,3));
		System.out.println("Postion of entered contain data index: "+LinearSearch.contains(arr,9));
		
		String name="GowziNatarajan";
		System.out.println("Entered character position of index on string: "+LinearSearch.find(name,'z'));
		System.out.println("Entered character position of index on string: "+LinearSearch.find(name,'a'));
		
		int[] [] twoDarr={ {3,6,6,3,4},
						  {5,4,10,7,5},
						  {3,6,3,7,4}
						 };
		int[] result=LinearSearch.find(twoDarr, 10);
		System.out.println(Arrays.toString(result));   //output is first index row(1),coloumn index is(2)
						  
		
	}

	
}
