package com.ncodeit.collection;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(6);
		numbers.add(2);
		numbers.add(5);
		System.out.println("TreeSet in the the natural ascending order : " + numbers);

		int first = numbers.first();
		System.out.println("First Number: " + first);

		int last = numbers.last();
		System.out.println("Last Number: " + last);

		System.out.println("TreeSet Comparator :: ");
		Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));
		treeSet.add("Raghavendra");
		treeSet.add("Jakka");
		System.out.println(treeSet);

		System.out.println("Sorted Set methods :: ");
		SortedSet<String> ts = new TreeSet<String>();

		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");

		System.out.println("Sorted Set is " + ts);

		System.out.println("First Value " + ts.first());

		System.out.println("Last Value " + ts.last());

		System.out.println("Navigable Set methods :: ");

		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);

		NavigableSet<Integer> reverseNs = ns.descendingSet();

		System.out.println("Normal order: " + ns);
		System.out.println("Reverse order: " + reverseNs);

		NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
		System.out.println("3 or  more:  " + threeOrMore);
		System.out.println("lower(3): " + ns.lower(3));
		System.out.println("floor(3): " + ns.floor(3));
		System.out.println("higher(3): " + ns.higher(3));
		System.out.println("ceiling(3): " + ns.ceiling(3));

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollLast(): " + ns.pollLast());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("pollLast(): " + ns.pollLast());

	}

}
