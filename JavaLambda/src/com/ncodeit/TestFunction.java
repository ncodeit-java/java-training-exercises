package com.ncodeit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestFunction {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John");
	    Function<String, Integer> nameMappingFunction = String::length;
	    //Function<String, Integer> nameMappingFunction = t -> t.length();
	    List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
	    System.out.println(nameLength);
	    //nameLength.forEach(t -> System.out.println(t));
	}

}
