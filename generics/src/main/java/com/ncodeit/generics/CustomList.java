package com.ncodeit.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {

	private List<T> lst=new ArrayList<>();
	
	
	public void add(T obj){
		lst.add(obj);
	}
	
	public T get(int index){
		return lst.get(index);
	}
}
