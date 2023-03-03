package com.ncodeit.threads.exectorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable task= ()->{
			System.out.println("Callable Thread Name:"+Thread.currentThread().getName());
			printNumbers();
		};		
		
		ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(2);
		
		//scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);
		
		scheduledExecutorService.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		scheduledExecutorService.shutdown();

	}
	
	private static void printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}	

}
