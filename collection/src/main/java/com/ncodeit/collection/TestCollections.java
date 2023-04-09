package com.ncodeit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {

		List list = Collections.EMPTY_LIST;
		Set set = Collections.EMPTY_SET;
		Map map = Collections.EMPTY_MAP;

		// list.add("test");
		// To show java.lang.UnsupportedOperationException as it is immutable

		List<String> immutableEmptyList = Collections.emptyList();
		Set<String> immutableEmptySet = Collections.emptySet();
		Map<String, String> immutableEmptyMap = Collections.emptyMap();

		// immutableEmptyList.add("test");
		// To show java.lang.UnsupportedOperationException as it is immutable

		// addAll method
		System.out.println("Collections addAll ::");
		List<String> names = new ArrayList<>();
		names.add("Ravi");
		names.add("Pavan");
		Collections.addAll(names, "Raghavendra");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}

		System.out.println(System.getProperty("line.separator"));
		// sort method
		Collections.sort(names);
		System.out.println("Collections sort ::");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}

		System.out.println(System.getProperty("line.separator"));
		// sort method in reverse order
		Collections.sort(names, Collections.reverseOrder());
		System.out.println("Collections sort in reverse order ::");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}

		System.out.println(System.getProperty("line.separator"));
		// binary search
		System.out.println("Collections binary search ::");
		Collections.sort(names);
		System.out.println(Collections.binarySearch(names, "Ravi"));
		System.out.println(Collections.binarySearch(names, "Raghavendra"));
		System.out.println(Collections.binarySearch(names, "Pavan"));

		System.out.println(System.getProperty("line.separator"));

		// copy method
		System.out.println("Collections copy ::");
		List<String> destination_List = new ArrayList<>();
		destination_List.add("Toys");
		destination_List.add("Horse");
		destination_List.add("Tiger");
		System.out.println("The Original Destination list is ");
		for (int i = 0; i < destination_List.size(); i++) {
			System.out.print(destination_List.get(i) + " ");
		}
		System.out.println();
		List<String> source_List = new ArrayList<>();
		source_List.add("Bat");
		source_List.add("Frog");
		source_List.add("Lion");
		Collections.copy(destination_List, source_List);
		System.out.println("The Destination List After copying is ");
		for (int i = 0; i < destination_List.size(); i++) {
			System.out.print(destination_List.get(i) + " ");
		}

		// disjoint method
		System.out.println(System.getProperty("line.separator"));
		System.out.println("Collections disjoint :: ");
		List<String> list1 = new ArrayList<>();
		list1.add("Shoes");
		list1.add("Toys");
		list1.add("Horse");
		list1.add("Tiger");
		List<String> list2 = new ArrayList<>();
		list2.add("Bat");
		list2.add("Frog");
		list2.add("Lion");
		System.out.println(Collections.disjoint(list1, list2));
	}
}
