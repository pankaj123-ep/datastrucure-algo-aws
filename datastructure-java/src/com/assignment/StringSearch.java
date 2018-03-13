package com.assignment;

public class StringSearch {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				boolean flag=hasDuplicateCahr("gabru");
					if(flag==true)
						{
								System.out.println("straing has dubplicate character ");
						}
					else
							System.out.println("String doestnot have dupblicate char");
	}
	
	static boolean hasDuplicateCahr(String s)
	{
		//store string char to array as int
		
		int[]aschichar=new int[s.length()];
		
		for(int i=0;i<s.length();i++)
			aschichar[i]=(int)s.charAt(i);
		
		//befor sorting array
		
		for(int i=0;i<aschichar.length;i++)
			System.out.print("*******"+aschichar[i]);
		
		System.out.println();
		
		aschichar=insertionsortarray(aschichar);
		
		
		//after sorting array
		
		for(int i=0;i<aschichar.length;i++)
			System.out.print("****"+aschichar[i]);
		System.out.println();
		
		for(int i=0;i<s.length();i++)
		{
			//if(binaryAlgoStringDuplecate(aschichar,aschichar[i]));
			
			 if(linearSearchElement(aschichar,aschichar[i],i))
			return true;
				
		}
		return false;
		
		
		
	}
	
	
	static int[] insertionsortarray(int[] arr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			
			int current=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=current;
			
		}
		
	
		
		return arr;
		
	}
 	
	//binary search from newly formed array
	
	static boolean linearSearchElement(int[]arr,int key,int i)
	{
		for(int q=i+1;q<arr.length;q++)
		{
			if(arr[q]==key)
				return true;
			else
				continue;
		}
		return false;
	}
	
	static boolean binaryAlgoStringDuplecate(int[] arr,int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		while(low<=high)
		{
			
			mid=low+(high-low)/2;
			if(arr[mid]==key)
				return true;
			else if(arr[mid]>key)
				high=mid-1;
			else
				low=mid+1;
			
			
			
		}
		
			return false;
		
		
		
		
	}
	
	
	
	
	
	
	

}
