package com.ncodeit.generics;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List lst=new ArrayList();
		
		lst.add("11");
		lst.add(new Employee());
		lst.add(new Integer(10));
		
		for(Object obj:lst){
			System.out.println((Employee)obj);
		}
		
	}

}
