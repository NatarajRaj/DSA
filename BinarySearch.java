package DSA;     //to updated on the my code github website account 

public class BinarySearch {
	public static int search(int [] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		
		boolean asc=false;
		if (arr[start]<arr[end]) {			//asc array
		asc=true;
		
		
		while(start<=end) {
				int mid=(start+end)/2;
			if(asc) {
				if(target>arr[mid]) 
					start=mid+1;
				
				else if(target<arr[mid]) 
					end=mid-1;
				
				else
				
					return mid;
				
			}
		
		
					else {			//desc arrray
							
							if(target>arr[mid]) 
								end=end-1;
							
							else if(target<arr[mid]) 
								start=start+1;
							
							else
							
								return mid;
							
						}
		}
	}
		return -1;
	}
}

