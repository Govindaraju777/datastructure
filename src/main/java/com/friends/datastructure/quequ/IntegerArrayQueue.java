package com.friends.datastructure.quequ;

import java.util.NoSuchElementException;

public class IntegerArrayQueue {
	protected int q[];
	protected int front, rear, size, total;

	public IntegerArrayQueue() {
		this.size = 5;
		total = 0;
		q = new int[this.size];
		front=0;
		rear=0;
	}


	/* Function to check the front element of the queue */
	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return q[front];
	}

	/* Function to insert an element to the queue */
	public void enQueue(int item) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		} else {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;  // reset to zero index if rear is at max position i.e at size-1
		}

	}

	/* Function to remove front element from the queue */
	public int deQueue() {
		int item = q[front];
		front = (front + 1) % size;
		total--;
		return item;
	}

	/* Function to display the status of the queue */
	public void display() {
		System.out.print("\nQueue = ");
		if (total == 0) {
			System.out.print("Empty\n");
			return;
		}
		int f = front;
		if(total!=0){
			for (int i = 0; i < total; i++){
				System.out.print(q[f] + " ");
				System.out.println();
				f = (f+1) % total;
			}
		}
		
		
	}
	
	/* Function to check if queue is empty */
	public boolean isEmpty() {
		return front == -1;
	}

	/* Function to check if queue is full */
	public boolean isFull() {
		return size==total;
	}

	/* Function to get the size of the queue */
	public int getSize() {
		return total;
	}
}
