package com.ncodeit.threads.runnable;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Main method thread name: "+Thread.currentThread().getName());
		Thread t1=new Thread(new Task());
		t1.setName("Example3");
		t1.start();
		System.out.println("Finished main method");
	}

}
