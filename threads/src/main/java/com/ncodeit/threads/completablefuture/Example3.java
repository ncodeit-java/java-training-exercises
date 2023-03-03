package com.ncodeit.threads.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long start=System.currentTimeMillis();
		
		ExecutorService e = Executors.newSingleThreadExecutor(
				  r -> new Thread(r, "t1"));
		
		Supplier<String> sp=()->{
			System.out.println("Supplier Thread Name:"+Thread.currentThread().getName());
			//return printNumbers();
			return "success";
		};
		
		Function<String,String> fc=r->{
			System.out.println("Function Thread Name:"+Thread.currentThread().getName());
			String result="Finished "+r;
			System.out.println(result);
			return result;
		};
		
		CompletableFuture<String> f=CompletableFuture.supplyAsync(sp)
											.thenApply(fc);
		System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		System.out.println("Main Finished");
		
		Thread.sleep(10000);
		
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}
	
	private static String printNumbers(){
		for(int i=0;i<300;i++){
			System.out.println(i);
		}
		return "Successfully";
	}	

}
