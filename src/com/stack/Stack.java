package com.stack;

public class Stack {

  private class Node{
    int data;
    Node link;

    Node(int data){
      this.data = data;
      this.link = null;
    }
  }

  Node top =null;

  //Function to push an element into stack
  public void push(int data){
    Node newNode = new Node(data);
    newNode.link = top;
    top = newNode;
  }

  //Function returns true if stack is empty
  public boolean isEmpty(){
    if(top != null)
      return false;
    return true;
  }

  //Function pop the element an retuens popped element
  public int pop(){
    if(isEmpty()){
      throw new RuntimeException("Stack is empty");
    }
    int data = top.data;
    top = top.link;
    return data;
  }

  //Function return length of the stack
  public int length(){
    int count = 0;
    Node temp = top;
    while(temp != null){
      count++;
      temp = temp.link;
    }
    return count;
  }

  //Function returns top element of stack
  public int peek(){
    if(isEmpty()){
      throw new RuntimeException("stack is empty");
    }
    return top.data;
  }

  //Function returns the position of the element if it is successfully found in the stack
  // (taking the count as base 1) else -1 is returned.
  public int search(int element){
    Node temp = top;
    int pos = 1;
    while(temp != null){
      if(temp.data == element)
        return pos;
      temp = temp.link;
      pos++;
    }
    return -1;
  }
}
