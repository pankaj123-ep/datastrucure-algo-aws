package algo.bubblesort;

public class BubbleSort {
	
	/*
	 * goal : put bigger number at the last first
	 * compare addjecet element if first element > next element swap
	 * it grows n-1..n-2...n-3....total tike =n(n-1)/2 so O(n2) complexity
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub test
		
		int[] array={15,12,2,1};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
					
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("sorted array:"+array[i]);
		}
		
		
		
		

	}
	
	
	

}
