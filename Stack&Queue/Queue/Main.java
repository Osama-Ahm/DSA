package com.company;

public class Main {

    public static void main(String[] args) {
	    QueueDSArray q1 = new QueueDSArray(5);

	    q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        System.out.println("Counter: "+q1.count());


    }
}
