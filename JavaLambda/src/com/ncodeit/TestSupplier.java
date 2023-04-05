package com.ncodeit;

import java.util.Optional;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {

		Supplier<Double> doubleSupplier1 = () -> Math.random();
		System.out.println(doubleSupplier1.get());

		// DoubleSupplier doubleSupplier2 = Math::random;
		// System.out.println(doubleSupplier2.getAsDouble());

		// Supplier<Double> doubleSupplier = () -> Math.random();
		// Optional<Double> optionalDouble = Optional.empty();
		// System.out.println(optionalDouble.orElseGet(doubleSupplier));
	}

}
