package com.ncodeit.generics;

public class Example3 {

	public static void main(String[] args) {
		
		CustomList<String> custList=new CustomList<>();
		custList.add("emp1");
		custList.add("emp2");
		
		System.out.println(custList.get(0));
		
		CustomList<Integer> intList=new CustomList<>();
		intList.add(11);
		intList.add(22);
		System.out.println(intList.get(0));

	}

}
