package com.linkedlist;

public class Node {
	
	int data;
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	Node nextNode;
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
