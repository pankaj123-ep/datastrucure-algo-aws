package com.doubleendedlist;

public class LinkedListMainCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperation linkedListOperation=new LinkedListOperation();
		linkedListOperation.insertAtHead(60);
		linkedListOperation.insertAtHead(70);
		linkedListOperation.insertAtHead(80);
		linkedListOperation.insertAtHead(90);
		linkedListOperation.insertAtHead(100);
		linkedListOperation.reverslist();
		linkedListOperation.displayTailInsertedNode();
	}
}
