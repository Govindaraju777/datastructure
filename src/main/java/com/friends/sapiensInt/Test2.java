package com.friends.sapiensInt;

public class Test2 {
	public static void main(String[] args) {
		int i = 1, j = 1;
		try {
			i++;
			j--;

			if (i / j > 1)
				i++;

		} catch (ArithmeticException e) {
			System.out.println(0);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(1);
		} catch (Exception ex) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
	}
}
