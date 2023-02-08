package DSA;

public class BinarySearchDemo {

	public static void main(String [] args) {
		int[] arr= {1,3,5,6,10,12,18,19,21,25};
		System.out.println("Position of entered number sorted array binary search: "+BinarySearch.search(arr,18));			//ascending array lists
		System.out.println("Position of entered number sorted array binary search: "+BinarySearch.search(arr,3));
		System.out.println("Position of entered number sorted array binary search: "+BinarySearch.search(arr,15));
	
		int[] arr1= {25,21,18,16,14,10,5,3,2,1};			//desc sorted binary array
		System.out.println("--------------------------------------------");
		System.out.println("Position of entered number sorted array binary search: "+BinarySearch.search(arr,5));			
		System.out.println("Position of entered number sorted array binary search: "+BinarySearch.search(arr,21));
		System.out.println("Position of entered number sorted array binary search: "+BinarySearch.search(arr,7));

	}
}
