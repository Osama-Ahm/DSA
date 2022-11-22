package com.company;

public class QueueLinkedList {
    private Node first;

    public QueueLinkedList(){
        this.first=null;
    }

    public boolean isEmpty(){
        return(first==null);
    }

    public void enqueue(int data){
        if(isEmpty()) {
            Node nn = new Node();
            nn.data = data;
            nn.next = first;
            first = nn;
            return;
        }
        Node current = first;
        while(current.next!=null){
            current = current.next;
        }
        Node nn = new Node();
        nn.data = data;
        current.next=nn;
    }

    public void displayQueue(){
        if(front<=rear){
            for(int i=front;i<=rear;i++){
                System.out.println(items[i]);
            }
        }
        else{
            System.out.println("Circular Queue: ");
            for(int i=front;i<=rear;i++){
                System.out.println(items[i]);
            }
            for (int i=0;i<=rear;i++){
                System.out.println(items[i]);
            }

        }
    }

    public void displayQueue(){
        System.out.println("Queue Fifo");
        Node current = first;
        System.out.println("[");
        while(current!=null){
            current.displauNode();
            current = current.next;
        }
        System.out.println("]");
    }


}
