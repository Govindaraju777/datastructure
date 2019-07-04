package com.friends.datastructure.stack;

import java.util.NoSuchElementException;

public class EmployeeArrayStack<T> implements MyStack<T> {

	private T[] stack;
	protected int top, size, len;

	EmployeeArrayStack(T T) {
		top = -1;
		this.size = 5;
		stack = (T[]) new Object[this.size];
	}

	/* Function to check the top element of the stack */
	public T peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return stack[top];
	}

	public void push(T emp) {
		if (top + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		if (top + 1 < size)
			stack[++top] = emp;
		len++;
	}

	public T pop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		len--;
		return stack[top--];
	}

	/* Function to display the status of the stack */
	public void display() {
		System.out.print("\nStack = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = top; i >= 0; i--)
			System.out.print(stack[i] + " ");
		System.out.println();
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return top == -1;
	}

	/* Function to check if stack is full */
	public boolean isFull() {
		return top == size - 1;
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return len;
	}
}
