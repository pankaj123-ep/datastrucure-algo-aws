package com.assignment;

public class InsertionSOrtEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(1247895646, "pankaj", "kumar","pk@test");
		Employee emp2=new Employee(784857845, "sonu", "kumar", "sonu@test.com");
		Employee emp3=new Employee(364578912, "amit","kumar", "amit@test.com");
		
		Employee[] arr= {emp1,emp2,emp3};
		insertionSortEmployee(arr);
		
		

	}
	static void insertionSortEmployee(Employee[] arr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			Employee temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j].getEmpId() >temp.getEmpId())
			{
				
				arr[j+1]=arr[j];
				j--;
				
				
			}
			arr[j+1]=temp;
			
			
		}
		
		
		System.out.println("sorted employee********** ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}
	
	
	
	

}
