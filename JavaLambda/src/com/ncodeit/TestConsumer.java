package com.ncodeit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<String> cityConsumer = t -> System.out.println(t.toUpperCase());
		//Stream<String> cities = Stream.of("Hyderabad", "Bangalore", "Pune");
		List<String> cities = Arrays.asList("Hyderabad", "Bangalore", "Pune");
		cities.forEach(cityConsumer);
	}

}
