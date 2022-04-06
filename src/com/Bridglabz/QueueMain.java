package com.Bridglabz;

public class QueueMain 
{
	public static void main(String [] args) {
 Queue queue=new Queue();
 queue.enQueue(12);
 queue.enQueue(88);
 queue.enQueue(97);
 queue.enQueue(5);
 queue.deQueue();
 queue.printQueue();
}
	}