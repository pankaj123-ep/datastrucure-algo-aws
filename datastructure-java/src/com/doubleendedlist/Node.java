package com.doubleendedlist;

public class Node {
	
	int data;
	Node nextNode;
	
	Node()
	{
		
	}
	Node(int data)
	{
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	

}
