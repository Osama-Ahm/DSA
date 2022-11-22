package com.company;

public class LinkedList {

    private Node first;

    public LinkedList(){
        this.first = null;
    }

    public boolean isEmpty(){
        return(first==null);
    }

    public void push(int value){
        Node extraNode = first;
        first = new Node();
        first.data = value;
        first.next = extraNode;

    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int value = first.data;
        first = first.next;
        return value;
    }

    public int peek(){
        return first.data;
    }

    public void printStack(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        else{
            System.out.println("Popping out elements from stack");
            while(isEmpty()){
                System.out.println(pop());
            }
        }
    }

}
