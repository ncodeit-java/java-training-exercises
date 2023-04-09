package com.ncodeit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		// List creation using add
		List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);
        l1.add(1, 2);
        System.out.println(l1);
        // prints the size of the list
        System.out.println(l1.size());
        // List creation using Arrays asList
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        l1.addAll(1, l2);
        System.out.println(l1);
        // Removes element from index 1
        l1.remove(1);
        // Printing the updated List 1
        System.out.println(l1);
        // using get() method
        System.out.println(l1.get(3));
        // Replace 0th element with 5 in List 1
        l1.set(0, 5);
        // Again printing the updated List 1
        System.out.println(l1);
        // using indexOf method
        System.out.println(l1.indexOf(2));
	}

}
