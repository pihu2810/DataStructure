package com.Bridglabz;

public class LinkedList
{
 Node  head;
 Node tail;
  int size;
 
  public LinkedList() {
	  this.size=0;
	  this.head=null;
  }
 
 public boolean isEmpty() {
	 if(this.size==0) {
		 return true;
	 }
	 return false;
	 }
 

 public void insertAtFirst(int data) 
 {
	 Node n = new Node();
	 n.setData(data);
	 if(head==null) {
		 head=n;
		 size++;
		 }
	 else {
		n.setNext(head);
		 head=n;
		 size++;
	 }	
 }
 
 public void insertAtLast(int data) {
	 Node n1,t;
	 n1=new Node();
	 n1.setData(data);
	 n1.setNext(null);
	 t=head;
	 if(head==null)
	 {
		 head=n1;
    }else {
    	while(t.getNext()!=null) {
    		t=t.getNext();
    	}
    	t.setNext(n1);
    	tail=n1;
    	size++;
    	 }
 }
 public void insertAtPosition(int index,int data)
 {
	
	Node n=new Node();
	 n.setData(data);
	 n.setNext(null);
	 if(index==1) {
		 insertAtFirst(data);
	 }else if(index==size+1 && index>size+1) {
		 insertAtLast(data);
	 }else  {
		Node t=head;
		  for(int i=0;i<index-1;i++) {
			 t=t.getNext();
		  }
			 n.setNext(t.getNext());
			 t.setNext(n);
			 size++;
		 }
	 }
	public void add(int data) {
		Node<K> node=new Node<>();
		if(head==null) {
			System.out.println("Stack is overflow");
		}
		node.setData(key);
		node.setNext(head);
		head=node;
		size++;
		
 public void deleteFirst() {
	 if(head==null) {
		 System.out.println("Empty");
	 }else {
		 head=head.getNext();
		 size--;
	 }
 }
 public void deleteLast() {
	 if(head==null) {
		 System.out.println("Empty");
	 }else if(size==1) {
		 head=null;
		 size--;
		}else {
			Node t;
			t=head;
			for(int i=1; i<size-1 ;i++) 
				t=t.getNext();
				t.setNext(null);
				size--;
			}
	 }
 public void deleteAtPosition(int index) {
	 if(head==null) {
		 System.out.println("List is Empty");
	 }else if(index<1 || index>size) {
		 System.out.println("Invalid index");
	 }else if(index==1) {
		 deleteFirst();
	 }else if(index==size) {
		 deleteLast();
	 }else {
		 Node t,n;
		 t=head;
		 for(int i=1;i<index-1;i++) {
			 t=t.getNext();
		 }
		 n=t.getNext();
		 t.setNext(n.getNext());
		 size--;
	 }
 }
 
 
 public  void printList() {
	 Node curr=head;
	 while(curr !=null) {
		 System.out.println(curr.getData());
		 curr=curr.getNext();
	 }
}
 
 
}
