package com.ncodeit.threads.runnable;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Run mthod thread name: "+Thread.currentThread().getName());
		printNumbers();

	}
	
	private static void printNumbers(){
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}	

}
