package DSA;

public class Searchingsort {   
//refer cgs notes

public static void searchsortasc(int[] arr) {     		//to arrange array ascending order on the searching sort
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
			
			//swap the array element when arr[i] less than arr[j]
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			}
		}
}
	

		public static void searchsortdesc(int[] arr) {     		//to arrange array ascending order on the searching sort
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
					
					//swap the array element when arr[i] less than arr[j]
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				}
	     }
		
		public static void searchbublesort(int [] arr1) {
			for(int i=0;i<arr1.length;i++)
			{
				boolean swapped=false;   	//to avoid complexicity,,,,, to improve the program functionality
				
				for(int j=0;j<arr1.length-i-1;j++)
				{
					swapped=true;			//if enter the j loop(inner loop) swap is needed
					if(arr1[j]>arr1[j+1]) {
						//swap
						int temp=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp;
					}
				}
				if(!swapped) {			//if not loop swapped arranged correctly break & exit the program
					break;
				}
			}
			
		}

		public static void searchbublesortdesc(int[] arr1) {
			for(int i=0;i<arr1.length;i++)
			{
				boolean swapped=false;   	//to avoid complexicity,,,,, to improve the program functionality
				
				for(int j=0;j<arr1.length-i-1;j++)
				{
					swapped=true;			//if enter the j loop(inner loop) swap is needed
					if(arr1[j]<arr1[j+1]) {
						//swap
						int temp=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp;
					}
				}
				if(!swapped) {			//if not loop swapped arranged correctly break & exit the program
					break;
				}
			}	
			
		}
		
		
		public static void insertionSort(int[] arr2) {
			for(int i=1;i<arr2.length;i++) {
				for(int j=i;j>0;j--) {
					if(arr2[j]<arr2[j-1]){
						//swap
						int temp=arr2[j];
						arr2[j]=arr2[j-1];
						arr2[j-1]=temp;	
								}
					else
						break;
							}	
						}
			
					}
		public static void insertionSort1(int[] arr2) {
			for(int i=1;i<arr2.length;i++) {
				for(int j=i;j>0;j--) {
					if(arr2[j]>arr2[j-1]){
						//swap
						int temp=arr2[j];
						arr2[j]=arr2[j-1];
						arr2[j-1]=temp;	
								}
					else
						break;
							}	
						}
			
					}
		
}