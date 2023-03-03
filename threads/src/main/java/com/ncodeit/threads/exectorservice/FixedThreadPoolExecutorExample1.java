package com.ncodeit.threads.exectorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPoolExecutorExample1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<String> task= ()->{
			System.out.println("Callable Thread Name:"+Thread.currentThread().getName());
			return printNumbers();
		};
		
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		Future<String> future=executorService.submit(task);
		System.out.println(future.get());
		
		executorService.shutdown();
		System.out.println("Main Method completed");
	}
	
	private static String printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		
		return "Finished PrintNumbers";
	}	

}
