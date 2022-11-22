package com.company;

public class QueueDSArray {
    private int[] items;
    private int count;
    private int maxSize;
    private int front;
    private int rear;

    public QueueDSArray(int capacity){
            this.maxSize = capacity;
            this.items = new int[maxSize];
            this.count = 0;
            this.front = -1;
            this.rear = -1;
    }

    public boolean isEmpty(){
        return(rear==-1);
    }

    public void enqueue(int data){
        if(isEmpty()){
            front++;
        }
        else
            if (count==items.length) {
            throw new IllegalStateException("Queue is full");
        }
        //rear++;
        rear= (rear+1)% items.length;
        items[rear] = data;
        count++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        int data = items[front];
        //front++;
        front = (front+1)%items.length;
        return data;
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

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return (items[front]);
    }

    public boolean isCompleteProcessed(){
        return(front==maxSize);
    }

    public void printQueue(){
        while(!isCompleteProcessed()){
            System.out.println(dequeue()+" Processed!");
        }
    }

    public int max(){
        if(isCompleteProcessed()){
            throw new IllegalStateException("Empty list");
        }
        int max =peek();

        while(!isCompleteProcessed()){
            if(max<this.peek()) {
                max = peek();
            }
            this.dequeue();
        }
        return max;
    }

    public int min(){
        if(isCompleteProcessed()){
            throw new IllegalStateException("Empty list");
        }
        int min =peek();
        while(!isCompleteProcessed()){
            if(min>this.peek()) {
                min = peek();
            }
            this.dequeue();
        }
        return min;
    }

    public int product(){
        if(isCompleteProcessed()){
            throw new IllegalStateException("Empty Queue");
        }
        int product = dequeue();
        while(!isCompleteProcessed()){
            product = product*dequeue();
        }

        return product;
    }

    public void find(int value){
        if(isCompleteProcessed()){
            throw new IllegalStateException("Empty Queue");
        }
        while(!isCompleteProcessed()){
            if(dequeue()==value) {
                System.out.println("Found");
                return ;
            }
        }
        System.out.println("Not in queue");
    }

    public int count(){
        count=1;
        if(isCompleteProcessed()){
            throw new IllegalStateException("Empty queue");
        }
        for(int i=front;i<rear;i++){
            count++;
        }
        return count;

    }

    public void EvenOdd() {
        while (!isCompleteProcessed()) {
            if (items[front] == 0) {
                System.out.println(items[front] + " is not even or odd.");
            } else if (items[front] == 1) {
                System.out.println(items[front] + " is Odd.");
            } else if (items[front] % 2 == 0) {
                System.out.println(items[front] + " is even.");
            } else {
                System.out.println(items[front] + " is odd.");
            }
            dequeue();
        }
    }
}
