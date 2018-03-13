package com.doubleendedlist;

public class LinkedListOperation {
	Node head;
	Node tail;
	public void insertAtHead(int data)
	{
		if(head==null)
		{
		Node node=new Node(data);
		node.nextNode=head;
		head=node;
		tail=node;
		}
		else
		{
			
			//insert at tail position of linkedlist
			Node node=new Node(data);
			tail.nextNode=node;
			tail=node;
			
		}
		
		
	}
	public void reverslist() {
			
	int[] temp=new int[5];
	
			Node current=head;
			 int i=4;
			while(current!=null)
			{
				temp[i]=current.data;
				i--;
				current=current.nextNode;
				
			}
			
			
		
		for(int j=0;j<temp.length;j++)
		{
			System.out.print(""+temp[j]+" ");
		}
		
	}
	
	
	public void displayTailInsertedNode()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print("data:["+current.getData()+",");
			current=current.nextNode;
		}
		System.out.println("]");
	}

}
