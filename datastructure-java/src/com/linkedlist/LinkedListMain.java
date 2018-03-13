package com.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListOperation op1=new LinkedListOperation();
		op1.insertHead(10);
		op1.insertHead(20);
		op1.insertHead(30);
		
		
		op1.displayList();
		
		op1.deleteAtHead();
		op1.displayList();
		

	}

}
