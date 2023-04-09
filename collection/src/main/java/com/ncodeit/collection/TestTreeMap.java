package com.ncodeit.collection;

import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		System.out.println("TreeMap: " + numbers);

		String firstKey = numbers.firstKey();
		System.out.println("First Key: " + firstKey);

		String lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);

		System.out.println("First Entry: " + numbers.firstEntry());

		System.out.println("Last Entry: " + numbers.lastEntry());

        System.out.println("Using pollFirstEntry(): " + numbers.pollFirstEntry());

        System.out.println("Using pollLastEntry(): " + numbers.pollLastEntry());

        System.out.println("Updated TreeMap: " + numbers);
        
		TreeMap<String, Integer> numbers1 = new TreeMap<>();
		numbers1.put("First", 1);
		numbers1.put("Second", 5);
		numbers1.put("Third", 4);
		numbers1.put("Fourth", 6);
		System.out.println("\nNew TreeMap: " + numbers1);

		System.out.println("Using higherKey(): " + numbers1.higherKey("Fourth"));
		System.out.println("Using higherEntry(): " + numbers1.higherEntry("Fourth"));

		System.out.println("\nUsing lowerKey(): " + numbers1.lowerKey("Fourth"));
		System.out.println("Using lowerEntry(): " + numbers1.lowerEntry("Fourth"));

		System.out.println("\nUsing ceilingKey(): " + numbers1.ceilingKey("Fourth"));
		System.out.println("Using ceilingEntry(): " + numbers1.ceilingEntry("Fourth"));

		System.out.println("\nUsing floorKey(): " + numbers1.floorKey("Fourth"));
		System.out.println("Using floorEntry(): " + numbers1.floorEntry("Fourth"));
	}

}
