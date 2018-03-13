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
