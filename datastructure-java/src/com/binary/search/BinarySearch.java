package com.binary.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,15,17,20};
		
		int result=binarySearch(arr,78);
		
		if(result!=1)
			System.out.println("element found at "+result+1);
		else
			System.out.println("element not found");
		

	}
	
	
	static int binarySearch(int[] arr,int searchItem)
	{
		
		int arrleng=arr.length;
		int low=0;
		int high=arrleng-1;
		int mid=0;
		while(low<=high)
		{
			mid=low + (high-low)/2;
			if(arr[mid]==searchItem)
				return mid;
			
			else if(arr[mid]>searchItem)
				high=mid-1;
			else
				low=mid+1;
			
			
			
			
		}
		
			
			return Integer.parseInt("1");
			
			
		}
		
		
		
		
		
	
	
	
	

}
