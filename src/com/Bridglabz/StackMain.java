package com.Bridglabz;

public class StackMain 
{
  public static void main(String[] args) {
	  Stack stack=new Stack();
	  stack.push(37);
	  stack.push(68);
	  stack.push(19);
	  stack.push(25);
	  stack.push(75);
	  stack.peak();
	  stack.pop();
	  stack.printStack();
	  
  }
}
