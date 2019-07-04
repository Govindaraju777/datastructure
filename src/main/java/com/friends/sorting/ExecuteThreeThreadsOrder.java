package com.friends.sorting;

//http://www.java67.com/2015/07/how-to-join-two-threads-in-java-example.html

/*
 Thread.join() Example in Java
In this program, I have tried to explain how to use join() method by solving a popular multi-threading interview question, how to execute three threads in a order, such that T1 will start first and finished last. In this example, I have create a class called ParallelTask which implements Runnable interface and used to create multiple threads. 

Read more: http://www.java67.com/2015/07/how-to-join-two-threads-in-java-example.html#ixzz5koexgZW4
 */
public class ExecuteThreeThreadsOrder {

	public static void main(String[] args) {
		// we have three threads and we need to run in the
		// order T1, T2 and T3 i.e. T1 should start first
		// and T3 should start last.
		// You can enforce this ordering using join() method
		// but join method must be called from run() method
		// because the thread which will execute run() method
		// will wait for thread on which join is called.

		MyParallelTask parallelTask1 = new MyParallelTask();
		MyParallelTask parallelTask2 = new MyParallelTask();
		MyParallelTask parallelTask3 = new MyParallelTask();

		final Thread t1 = new Thread(parallelTask1, "Thread-1");
		final Thread t2 = new Thread(parallelTask2, "Thread-2");
		final Thread t3 = new Thread(parallelTask3, "Thread-3");

		parallelTask2.setPredecessor(t1);
		parallelTask3.setPredecessor(t2);

		t1.start();
		t2.start();
		t3.start();

	}

	private static class MyParallelTask implements Runnable {
		private Thread predecessor;

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " Started");
			if (predecessor != null) {
				try {
					predecessor.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " Finished");
		}

		public void setPredecessor(Thread t) {
			this.predecessor = t;
		}
	}

}
