package com.ncodeit.threads.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Runnable runnable=()->{
			System.out.println("Runnable Thread Name:"+Thread.currentThread().getName());
			printNumbers();
		};
		
		CompletableFuture<Void> completableFuture=CompletableFuture.runAsync(runnable);
		
		completableFuture.get();
		
		System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		System.out.println("Main Finished");
	}
	
	private static void printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}	

}
