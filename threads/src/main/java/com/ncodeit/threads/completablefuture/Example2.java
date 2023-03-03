package com.ncodeit.threads.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Supplier<String> sp=()->{
			System.out.println("Supplier Thread Name:"+Thread.currentThread().getName());
			printNumbers();
			return "Successfully";
		};
		
		CompletableFuture<String> f1=CompletableFuture.supplyAsync(sp);
		System.out.println(f1.get());
		System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		System.out.println("Main Finished");		
		
	}
	
	private static void printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}	

}
