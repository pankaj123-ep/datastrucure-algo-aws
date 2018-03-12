package com.selection;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort();

	}
	
	static void selectionSort()
	{
		
		int[]arr={8,9,4,1,6,12};
		
		for(int i=0;i<arr.length-2;i++)
		{
			
			int minIndex=i;
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("selection sort time:"+arr[i]);
		}
		
		
		
		
		
	}
	

}
