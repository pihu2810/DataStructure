package com.Bridglabz;

public class Queue 
{
	private final LinkedList linkedList;
	public Queue() {
		linkedList=new LinkedList();
	}
	public void enQueue(int data) {
		linkedList.insertAtFirst(data);
	}
	public void printQueue() {
		linkedList.printList();
	}
	public void deQueue() {
		linkedList.deleteLast();
	}
	
}
