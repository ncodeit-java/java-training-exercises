package com.ncodeit.threads.exectorservice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutorExample2 {

	public static void main(String[] args) {
		
		Runnable task= ()->{
			System.out.println("Callable Thread Name:"+Thread.currentThread().getName());
			printNumbers();
		};
		
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		executorService.submit(task);
		executorService.submit(task);
		executorService.submit(task);
		
		List<Runnable> runables=executorService.shutdownNow();
		System.out.println("Tasks unfinished "+runables.size());
		System.out.println("Main Method completed");

	}
	
	private static void printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}	

}
