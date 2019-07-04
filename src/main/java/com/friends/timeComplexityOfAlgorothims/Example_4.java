package com.friends.timeComplexityOfAlgorothims;

public class Example_4 {

	/*
	 * O(2n)
	 * 
	 * The O(2n) is also called as recursive calculation method i.e repeatedly
	 * it will check condition unless it becomes true, here the performance will
	 * be doubles for each input.
	 * 
	 */
	static int n = 4;

	public static void main(String[] args) {
		if (n <= 3) {
			System.out.println(n);
		} else {
			System.out.println((n - 1) + (n - 2));
		}
	}
}
