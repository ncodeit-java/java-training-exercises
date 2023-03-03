package com.ncodeit.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Example7 {

	public static void main(String[] args) {

		List<Integer> intLst=new ArrayList<>();
		intLst.add(1);
		intLst.add(2);
		printElements(intLst);

		List<Number> doubleLst=new ArrayList<>();
		doubleLst.add(1.1);
		doubleLst.add(2.2);
		printElements(doubleLst);
	}

	private static void printElements(List<? super Integer> lst) {
		for(Object i:lst){
			System.out.println(i);
		}
		
	}

}
