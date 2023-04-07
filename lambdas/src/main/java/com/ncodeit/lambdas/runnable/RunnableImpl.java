package com.ncodeit.lambdas.runnable;

import java.io.FileNotFoundException;

public class RunnableImpl implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName() + ", executing run() method!");
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("Must catch here!");
			e.printStackTrace();
		}
	}
}
