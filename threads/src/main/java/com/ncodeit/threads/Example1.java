package com.ncodeit.threads;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		printNumbers();
		
		System.out.println("Finished main method");
	}
	
	private static void printNumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}

}
