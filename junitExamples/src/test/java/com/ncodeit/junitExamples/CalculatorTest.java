package com.ncodeit.junitExamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calc;

	@BeforeEach
	public void setup() {
		System.out.println("Before Each Method");
		calc=new Calculator();
	}
	
	@AfterEach
	public void removeObject() {
		System.out.println("After Each Method");
		calc=null;
	}
	
	@Test
	public void testAdd_withSuccess() {
		//Calculator calc=new Calculator();
		int result=calc.add(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void testSubtract_withSuccess() {
		//Calculator calc=new Calculator();
		int result=calc.subtract(5, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testMultiply_withSuccess() {
		//Calculator calc=new Calculator();
		int result=calc.multiply(2, 3);
		assertEquals(6, result);
	}
	
	@Test
	@Disabled
	public void testDivide_withException(){
		//Calculator calc=new Calculator();
		ArithmeticException arException= assertThrows(ArithmeticException.class, ()->calc.divide(5, 0));
		assertEquals("/ by zero", arException.getMessage());
	}

}
