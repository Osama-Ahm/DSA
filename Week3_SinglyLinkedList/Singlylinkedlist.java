package com.company;

import com.sun.istack.internal.localization.NullLocalizable;

public class Singlylinkedlist {
    private Node first;

    public Singlylinkedlist(){
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void displayList(){
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public int listLength(){
        Node current = first;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        Node current = first;
        while(current.next != null){ current = current.next;}
        current.next = newNode;

    }

    public void deleteLast(){

        Node current = first;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        current = first;
        for(int i=0;i<length-2;i++){
            current = current.next;
        }
        current.next = null;

        /*
        Node current = first;
        while(current.next.next != null){
            current = current.next;
        }
        Node last = current.next;
        current.next = null
        */
    }

    public void max(){
        Node current = first;
        int max = current.data;
        while(current != null){
            if(current.data>max) {
                max = current.data;
            }
            current = current.next;
        }
        System.out.println("Max: "+max);
    }
    public void min(){
        Node current = first;
        int min = current.data;
        while(current != null){
            if(current.data<min) {
                min = current.data;
            }
            current = current.next;
        }
        System.out.println("Min: "+min);
    }

    public float avg(){
        Node current = first;
        int length = 0, total = 0;
        while(current != null){
            length++;
            total = total+current.data;
            current = current.next;
        }
        float average = total/length;
        return average;
    }

    public float product(){
        Node current = first;
        int length = 0, product = 1;
        while(current != null){
            length++;
            product = product*current.data;
            current = current.next;
        }
        return product;
    }

    public void even(){
        Node current = first;
        while (current != null){
            if(current.data%2==0){
                System.out.println(current.data);
            }
            current = current.next;
        }
    }

    public void odd(){
        Node current = first;
        while (current != null){
            if(current.data%2 !=0){
                System.out.println(current.data);
            }
            current = current.next;
        }
    }

    public void find(int a) {
        Node current = first;
        boolean found = false;
        int pos = 0;
        do {
            if (a == current.data) {
                System.out.println("Position: " + pos);
                found = true;
            }
            current = current.next;
            pos++;
        } while (current != null || found != true);
        if (found == false) {
            System.out.println("Target not in list");
        }
    }
}



