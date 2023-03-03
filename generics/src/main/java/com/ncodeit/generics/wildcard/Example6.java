package com.ncodeit.generics.wildcard;

import java.util.ArrayList;
import java.util.List;


public class Example6 {

	public static void main(String[] args) {
		
		List<Animal> animals=new ArrayList<>();
		animals.add(new Animal());
		animals.add(new Animal());
		printElements(animals);		
		
		List<Dog> dogs=new ArrayList<>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		printElements(dogs);
		
		/*List<Object> objects=new ArrayList<>();
		animals.add(new Animal());
		animals.add(new Animal());
		printElements(objects);*/			
	}
	
	private static void printElements(List<? extends Animal> lst){
		for(Object obj:lst){
			System.out.println(obj);
		}
	}
	
}
