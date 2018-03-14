package com.mergesort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeSortAlgo(new int[]{15,14,9,78});

	}
	
	static void mergeSortAlgo(int[] input)
	{
		
		
		int middle=input.length/2;
		
		int[]left=new int[middle];
		int []right=new int[(input.length)-middle];
		//half of input array
		for(int i=0;i<middle;i++)
		{
			left[i]=input[i];
			
			System.out.println(left[i]+","+i);
			
		}
		System.out.println();
		//another half of input array
		for(int j=0;j<input.length-middle;j++)
		{
			right[j]=input[middle+j];
			System.out.println(right[j]+","+j);
			
		}
		
		
		
		//compare each array with their element
		int i=0,j=0;
		for(int k=0;k<input.length;k++)
		{
			
			if(left[i]<=right[j])
			{
				input[k]=left[i];
				i++;
				
			}
			else{
				input[k]=right[j];
				j++;
			}
				
				
				
				
				
		}
		
		/*for(int z=0;z<input.length;z++)
			System.out.print(""+input[z]+",");
		*/
	}
	

}
