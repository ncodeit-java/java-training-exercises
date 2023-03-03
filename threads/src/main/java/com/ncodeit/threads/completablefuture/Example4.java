package com.ncodeit.threads.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Example4 {

	public static void main(String[] args) {
		
		Supplier<List<String>> s1=()->{
			return firstList();
		};
		
		Supplier<List<String>> s2=()->{
			return secondList();
		};
		
		BiFunction<List<String>, List<String>, List<String>> b1=(r1,r2)->{
			r1.addAll(r2);
			System.out.println(r1);
			return r1;
		};
		
		CompletableFuture<List<String>> r1=CompletableFuture.supplyAsync(s1);
		CompletableFuture<List<String>> r2=CompletableFuture.supplyAsync(s2);
		
		r1.thenCombine(r2,b1);

	}
	
	private static List<String> firstList(){
		List<String> firstList=new ArrayList<>();
		firstList.add("1");
		firstList.add("2");
		System.out.println(firstList);
		return firstList;
	}
	
	private static List<String> secondList(){
		List<String> secondList=new ArrayList<>();
		secondList.add("3");
		secondList.add("4");
		System.out.println(secondList);
		return secondList;
	}	

}
