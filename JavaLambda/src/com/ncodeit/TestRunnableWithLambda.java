package com.ncodeit;

public class TestRunnableWithLambda {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("Runnable with Lambda Expression");
		};

		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
