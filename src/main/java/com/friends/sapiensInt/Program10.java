package com.friends.sapiensInt;

public class Program10 {
	public static void main(String[] args) {
		int result = test();
		System.out.println("result" + result);
	}

	private static int test() {
		try {
			int a = 0, b = 100;
			int c = b / a;
			System.out.println("try-0");
			return 0;
			//System.out.println("try-1");
		} catch (Exception ex) {
			System.out.println("catch");
			return -1;
		} finally {
			System.out.println("finally");
			return -2;
		}
	}
}
