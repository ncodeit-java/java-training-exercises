package com.ncodeit.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();

		cars.add("Nexon");
		cars.add("Toyota");
		cars.add("Volkswagen");

		System.out.println(cars);

		cars.add(null);

		cars.add("Nexon"); // Ignores and not allow duplicates

		System.out.println("Set of Cars : ");
		cars.forEach(x -> System.out.println(x));

		cars.remove(null);
		System.out.println("Set of Cars after removing null : ");
		cars.forEach(x -> System.out.println(x));

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(1);

		// Create a HashSet and initialize it with the list elements
		HashSet<Integer> hset = new HashSet<Integer>(list);
		hset.add(5);

		System.out.println("Iterating Set of Cars using Iterator");
		
		Iterator<Integer> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
