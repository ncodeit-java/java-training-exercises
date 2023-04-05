package com.ncodeit;

public class TestRunnableWithAnonymous {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable with Anonymous Class");
			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
