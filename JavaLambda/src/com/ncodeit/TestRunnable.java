package com.ncodeit;

public class TestRunnable {

	public static void main(String[] args) {
		System.out.println("Main thread is- " + Thread.currentThread().getName());
		Thread t1 = new Thread(new RunnableImpl());
		t1.start();
	}

}
