package com.ncodeit.lambdas.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
	public static void main(String args[]) {

		List<String> cities = Arrays.asList("Bangalore", "Bombay", "Hyderabad", "Chennai");
		Predicate<String> predicate = s -> s.startsWith("B");
		for (String city : cities) {
			if (predicate.test(city))
				System.out.println(city);
		}
		//cities.stream().filter(predicate).forEach(System.out::println);
	}
}
