package com.friends.timeComplexityOfAlgorothims;

public class Example_3 {

	/*
	 * The O(n2) is also called as quadratic time, it is directly proportional
	 * to the square of the input size. For example if the array has 2 items, it
	 * will print 4 times.
	 * 
	 * Note: In O(n2) as the number of steps increases exponential, number of
	 * elements also increases. It is the worst case Time Complexity method.
	 * 
	 */

	public static void main(String[] args) {
		int n = 2;
		for (int i = 0; i < n; i++) { // O(n) Complexity
			for (int j = 0; j < n; j++) // O(n) complexity
			{
				System.out.println(i + "." + j);
			}
		}
	} // O(n)+O(n)=O(n^2) Complexity
}
