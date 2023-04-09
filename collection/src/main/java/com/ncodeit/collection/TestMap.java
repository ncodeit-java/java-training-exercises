package com.ncodeit.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();

		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);

		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}

		hm.forEach((x, y) -> System.out.println(x + " : " + y));

		System.out.println("Keys: " + hm.keySet());

		System.out.println("Values: " + hm.values());

		System.out.println("Entries: " + hm.entrySet());

		int value = hm.remove("c");
		System.out.println("Removed Value: " + value);

		System.out.println("Linked HashMap methods");
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();

		lhm.put("one", "Raghavendra");
		lhm.put("two", "Kumar");
		lhm.put("four", "Jakka");

		System.out.println(lhm);

		System.out.println("Getting value for key 'one': " + lhm.get("one"));

		System.out.println("Size of the map: " + lhm.size());

		System.out.println("Is map empty? " + lhm.isEmpty());

		System.out.println("Contains key 'two'? " + lhm.containsKey("two"));

		System.out.println("Contains value - Jakka ? " + lhm.containsValue("Jakka"));

		System.out.println("delete element 'one': " + lhm.remove("one"));

		System.out.println("Mappings of LinkedHashMap : " + lhm);

	}

}
