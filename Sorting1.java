

						//Type 2 merge sort


package DSA;


public class Sorting1 {

	public static int[] mergeSorting(int[] arr,int start,int end) 
	{
		if(end-start==1)
				return null;
	int mid=(start+end)/2;
	
	mergeSorting(arr,start,mid);
	mergeSorting(arr,mid,end);
	mergeInPlace(arr,start,mid,end);
	return null;
	}
	
	public static  void mergeInPlace(int[] arr,int s,int m,int e) {				//first.to merge the first & second half of array
		int [] joined=new int[e-s];
		int i=0;int j = 0;int k = 0;
		
		while(i<m && j<e) {
			if(arr[i]<arr[j])
			   joined [k++]=arr[i++];
			else
				joined [k++]=arr[j++];
		}
		
		while(i<m) {				//before while condition failed this loop & below loop runs
			joined[k++]=arr[i++];
		}
		
		while(j<e) {
			joined[k++]=arr[j++];
		}	
			
		
		for(k=0;k<joined.length;k++) {				//for output sorted list datas
			arr[s+k]=joined [k];
		}
		}
	
}
	
	

