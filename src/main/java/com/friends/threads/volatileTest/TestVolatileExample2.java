package com.friends.threads.volatileTest;

public class TestVolatileExample2 {
	private static volatile boolean active;

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				active = true;
				while (active) {
					System.out.println("active");
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				active = false;
			}
		};

		t1.start();
		t2.start();
	}
}
