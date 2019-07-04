package com.friends.datastructure.quequ;

/* Class QueueImplement  */
public class IntegerArrayQueueImplement {
	public static void main(String[] args) {

		System.out.println("Array Queue Test\n");
		IntegerArrayQueue array = new IntegerArrayQueue();
		array.enQueue(1);
		array.enQueue(2);
		array.enQueue(3);
		
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		
		System.out.println(array.deQueue());
		System.out.println(array.deQueue());
		
		
	}
}