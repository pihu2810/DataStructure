package com.Bridglabz;

public class LinkedListMain
{
	public static void main(String[] args) {
		System.out.println("Welcome to linked list");
 LinkedList list=new LinkedList();
  list.insertAtFirst (31);
  list.insertAtFirst (26);
  list.insertAtFirst (12);
  list.insertAtFirst (85);
  list.insertAtLast(57);
  list.insertAtPosition(3,43);
  list.deleteFirst();
 list.deleteLast();
 list.deleteAtPosition(2);
 list. printList();
}
}