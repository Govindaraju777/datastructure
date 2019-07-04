/**
 * 
 */
package com.friends.datastructure.linkedList;

/**
 * @author govindaraju.v
 *
 */
public class LinkedList1 {
	private Node head;

	public LinkedList1(int item) {
		head = new Node();
		head.value = item;
		head.link = null;
	}

	public boolean insert(int item) {
		Node node = new Node();
		node.value = item;
		node.link = head;
		head = node;
		return true;
	}

	public boolean delete(int item) {
		if (head.value == item) {
			head.link = head;
			return true;
		} else {
			Node x = head;
			Node y = head.link;

			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.link;
				}
			}

			if (y != null) {
				return true;
			} else {
				return false;
			}
		}

	}

	public void printList() {
		Node z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.link;
		}

	}

	class Node {
		private int value;
		private Node link;
	}

}
