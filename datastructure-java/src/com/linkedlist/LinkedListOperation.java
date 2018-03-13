package com.linkedlist;

public class LinkedListOperation {
	Node head;
	public void insertHead(int data)
	{
		Node node=new Node(data);
		node.nextNode=head;
		head=node;
		
		
	}
	
	public void deleteAtHead()
	{
		
		Node current=head;
		head=null;
		current=current.nextNode;
		head=current;
	}
	
	public void searchInList(int searchItem)
	{
		int counter=0;
		Node current=head;
		while(current!=null)
		{
			counter++;
			if(current.data==searchItem)
			{
				System.out.println("item found at node["+counter+"]"+" "+searchItem);
				break;
			}
			else
				current=current.nextNode;
		}
		System.out.println("Item not found any position");
		
	}
	
	
	public void displayList()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.getData()+",");
			current=current.nextNode;
		}
		System.out.println("");
		
		
	}

}
