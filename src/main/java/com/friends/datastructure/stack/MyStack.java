/**
 * 
 */
package com.friends.datastructure.stack;

/**
 * @author govindaraju.v
 *
 */
public interface MyStack<T> {

	/* Method to check the top element of the stack */
	public T peek();
	public void push(T item);
	public T pop();
	public void display();
	int getSize();
}
