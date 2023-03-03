package com.ncodeit.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example4 {

	public static void main(String[] args) {
		
		List<Integer> lst1=new ArrayList<>();
		lst1.add(1);
		lst1.add(2);		
		printElements(lst1);
		
		List<String> lst2=new ArrayList<>();
		lst2.add("emp1");
		lst2.add("emp2");
		printElements(lst2);
	}
	
	
	public static <T> void printElements(List<T> lst){
		lst.stream().forEach((r)->{
			System.out.println(r);
		});
	}

}
