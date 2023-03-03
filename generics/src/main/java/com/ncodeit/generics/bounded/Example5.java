package com.ncodeit.generics.bounded;

import java.util.ArrayList;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
			
		List<Animal> animals=new ArrayList<>();
		animals.add(new Animal());
		animals.add(new Animal());
		printData(animals);
		
		List<Dog> dogs=new ArrayList<>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		printData(dogs);		
		
		
	}
	
	
	private static <T extends Animal> void printData(List<T> animals){
		for(Animal animal:animals){
			System.out.println(animal.toString());
		}
	}	

}
