package com.friends.threads.volatileTest;

/*
 * volatile variable : If two threads (t1,t2..)
 * Volatile is used in thread context.
 * 
 */
public class TestVolatile {

	private static volatile int VOLATILE_VAR = 0;

	public static void main(String[] args) {
		Thread printVolatile = new Thread() {
			public void run() {
				int x = VOLATILE_VAR;
				while (true) {
					if (x != VOLATILE_VAR) {
						System.out.println("printvolatileVar : " + VOLATILE_VAR);
						x = VOLATILE_VAR;
					}
				}
			}
		};

		Thread incrementVolatile = new Thread() {
			public void run() {
				int x = VOLATILE_VAR;
				while (true) {
					++VOLATILE_VAR;
					while (true) {
						++VOLATILE_VAR;
						System.out.println("incrementvolatile:" + VOLATILE_VAR);

						try {
							Thread.sleep(800);
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
				}
			}
		};

		printVolatile.start();
		incrementVolatile.start();

	}
}
