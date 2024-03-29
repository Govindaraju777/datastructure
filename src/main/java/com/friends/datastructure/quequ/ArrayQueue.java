package com.friends.datastructure.quequ;

import java.util.NoSuchElementException;

public class ArrayQueue {
	protected int q[];
	protected int front, rear, size, total;

	public ArrayQueue(int size) {
		this.size = size;
		total = 0;
		q = new int[this.size];
//		front = -1;
//		rear = -1;
		
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
	public void enQueue(int i) {
		// if (rear == -1) {
		// front = 0;
		// rear = 0;
		// Queue[rear] = i;
		// } else if (rear + 1 >= size)
		// throw new IndexOutOfBoundsException("Overflow Exception");
		// else if (rear + 1 < size)
		// Queue[++rear] = i;
		// len++;

		if (isFull()) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		} else {
			total++;
			q[rear] = i;
			rear = (rear + 1) % size;  // reset to zero index if rear is at max position i.e at size-1
		}

	}

	/* Function to remove front element from the queue */
	public int deQueue() {
		// if (isEmpty())
		// throw new NoSuchElementException("Underflow Exception");
		// else {
		// len--;
		// int ele = Queue[front];
		// if (front == rear) {
		// front = -1;
		// rear = -1;
		// } else
		// front++;
		// return ele;
		// }

		int item = q[front];
		front = (front + 1) % size;
		return item;
	}

	/* Function to display the status of the queue */
	public void display() {
		System.out.print("\nQueue = ");
		if (total == 0) {
			System.out.print("Empty\n");
			return;
		}
/*		for (int i = front; i <= rear; i++)
			System.out.print(Queue[i] + " ");
		System.out.println();*/
		
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
		//return front == 0 && rear == size - 1;
		return size==total;
	}

	/* Function to get the size of the queue */
	public int getSize() {
		return total;
	}
}
