package com.ncodeit.threads.exectorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SinglethreadExecutorExample {

	public static void main(String[] args) {
		System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		Runnable task= ()->{
			System.out.println("Runnable Thread Name:"+Thread.currentThread().getName());
			printNumbers();
		};
		
		executorService.execute(task);
		executorService.shutdown();
		System.out.println("Finsihed");

	}
	
	private static void printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}	

}
