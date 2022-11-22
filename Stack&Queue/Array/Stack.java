package com.company;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is Full");
        }
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        int value = stackArray[top];
        top--;
        return value;
    }

    public int peak() {
        return stackArray[top];
    }

    public void printStack() {
        System.out.println("Last in First out");
        while (!isEmpty()) {
            System.out.println("Popped element: " + this.pop());
        }
    }

    public int max() {
        int max = this.peak();
        while (!isEmpty()) {
            if (this.peak() > max)
                max = this.pop();
            else
                this.pop();
        }
        return max;
    }

    public int product() {
        int pro = 1;
        while (!isEmpty()) {
            pro = pro * this.pop();
        }
        return pro;
    }

    public int sum() {
        int sum = 1;
        while (!isEmpty()) {
            sum = sum + this.pop();
        }
        return sum;
    }

    public int avg() {
        int sum = 0;
        int count = 0;
        while (!isEmpty()) {
            sum = sum + this.pop();
            count++;
        }
        int avg = sum/count;
        return avg;
    }

    public void even() {
        while(!isEmpty()) {
            if (this.peak() % 2 == 0)
                System.out.println(" " + this.peak());
            this.pop();
        }
    }

    public void odd() {
        while(!isEmpty()) {
            if (this.peak() % 2 != 0)
                System.out.println(" " + this.peak());
            this.pop();
        }
    }

    public void find(int value){
        int found = -1;
        while(!isEmpty()){
            if(value == this.pop()){
                System.out.println("Found");
                found = 1;
            }
        }
        if(found == -1){
            System.out.println("Not in the list");
        }
    }

    public int count(){
        int count = 0;
        while(!isEmpty()){
            this.pop();
            count++;
        }
        return count;
    }

    public Stack printrev(Stack stack){
        Stack s1 = new Stack(stack.count());
        while(!isEmpty()){
            s1.push(this.pop());
        }

        return s1;

    }
}

