package com.ncodeit.generics;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		List<String> stLst=new ArrayList<>(); 
		
		stLst.add("11");
		stLst.add("22");
		
		for(String obj:stLst){
			System.out.println(obj);
		}
		
		List<Integer> intLst=new ArrayList<>(); 
		intLst.add(11);
		intLst.add(22);
		for(Integer obj:intLst){
			System.out.println(obj);
		}
		
	}

}
