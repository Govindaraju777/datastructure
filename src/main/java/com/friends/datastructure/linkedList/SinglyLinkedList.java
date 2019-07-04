package com.friends.datastructure.linkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		linkedList list = new linkedList();

		list.insertAtStart(1);
		list.insertAtStart(2);

		System.out.println("After insertAtStart");
		list.display();
		
		
		list.insertAtEnd(3);
		System.out.println("After insertAtEnd");
		
		list.display();
		
		
		list.insertAtPos(22, 1);
		System.out.println("After insertAtPos 0");
		
		list.display();
	}

}
