package com.example.demo4;

import java.util.*;
public class CircularQueue extends Main{
    private final int size;
    private int front;
    private int rear;	//Variable declaration

    CircularQueue(int size){	//Constructor
        this.size = size;
        this.front = this.rear = -1;
    }

    public void enQueue (String value){	//Insertion Function
        if (front == -1)	// Condition for empty queue.
        {
            front = 0;
            rear = 0;
            Wait.add(rear,value);
        }
        else if (rear == size - 1 && front != 0)
        {
            rear = 0;
            Wait.set(rear,value);
        }
        else
        {
            rear = (rear + 1);
            // Adding a new element if
            if (front <= rear)
            {
                Wait.add(rear, value);
            }
            // Else updating old value
            else
            {
                Wait.set(rear, value);
            }
        }
    }

    public String deQueue (){	//Dequeue Function
        String temp;

        temp = Wait.get (front);

        if (front == rear)	// For only one element
        {
            front = -1;
            rear = -1;
        }
        else if (front == size - 1)
        {
            front = 0;
        }
        else
        {
            front = front + 1;
        }
        return temp;		// Returns dequeued element
    }
    public String displayQueue (){// Display the elements of queue
        if (front == -1)		// Check for empty queue
        {
            return "Empty";

        }
        System.out.print ("Elements in the " + "circular queue are: ");

        if (rear >= front){	//if rear has not crossed the size limit
            for (int i = front; i <= rear; i++)	//print elements using loop
            {
                System.out.print (Wait.get (i));
                System.out.print (" ");
            }
            return "Not Empty";
        }
        else {
            for (int i = front; i < size; i++)
            {
                System.out.print (Wait.get (i));
                System.out.print (" ");
            }
            for (int i = 0; i <= rear; i++)	// Loop for printing elements from 0th index till rear position
            {
                System.out.print (Wait.get(i));
                System.out.print (" ");
            }
            return "Not Empty";
        }
    }
}
