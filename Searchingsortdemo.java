package DSA;
import java.util.*;

public class Searchingsortdemo {

	
	public static void main(String[] args)
	{
//		int [] arr=new int[100];					//to get input scanner method
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no.of values");
//		int n=sc.nextInt();
//		System.out.println("Enter values");
//		for(int i=0;i<n;i++)
//		{
//			
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {				//to get ouput on input method
//			Searchingsort.searchsortasc(arr);
//			System.out.println(Arrays.toString(arr));      //to ascending order
//		}
		
		int [] arr= {10,5,26,3,15,22};				//to get input direct method
		Searchingsort.searchsortasc(arr);			//calling method from package name
		System.out.println("Ascending order array searching sort output :"+Arrays.toString(arr));      //to ascending order
		Searchingsort.searchsortdesc(arr);
		System.out.println("Descending order array searching sort output :"+Arrays.toString(arr));      //to descending order
		System.out.println("---------------------------------------------------");
		
		int [] arr1= {10,5,26,3,15,22};				//to get input direct method
		Searchingsort.searchbublesort(arr1);			//calling method from package name
		System.out.println("Ascending order array searching bubble sort output :"+Arrays.toString(arr1));      //to ascending order
		
		Searchingsort.searchbublesortdesc(arr1);
		System.out.println("Descending order array searching bubble sort output :"+Arrays.toString(arr1));      //to descending order
		System.out.println("---------------------------------------------------");
		
		int [] arr2= {5,8,2,4,3,9};				//to get input direct method
		Searchingsort.insertionSort(arr2);			//calling method from package name
		System.out.println("Ascending order array searching Insertion sort output :"+Arrays.toString(arr2));      //to ascending order
		
		Searchingsort.insertionSort1(arr2);
		System.out.println("Descending order array searching Insertion sort output :"+Arrays.toString(arr2));      //to descending order
		System.out.println("---------------------------------------------------");
	}
}
