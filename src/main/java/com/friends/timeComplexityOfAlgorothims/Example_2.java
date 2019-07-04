package com.friends.timeComplexityOfAlgorothims;

public class Example_2 {

	// O(n)
	/*
	 * The O(n) is also called as linear time, it is direct proportion to the
	 * number of inputs. For example if the array has 5 items, it will print 5
	 * times.
	 * 
	 * Note: In O(n) the number of elements increases, the number of steps also
	 * increases.
	 * 
	 */

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) // O(n) Complexity
			System.out.println(i);
	}

}
