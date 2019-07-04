/*package com.friends.sapiensInt;

public class Program25 {

	public static <T> int count(T[] array, T ele) {
		int count = 0;
		for (T e : array) {
			if (e.compareTo(ele) > 0) // compiler ERROR
				++count;
		}
		return count;
	}

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		int n = Program25.<Integer> count(a, 3);
		System.out.println(n);
	}
}
*/