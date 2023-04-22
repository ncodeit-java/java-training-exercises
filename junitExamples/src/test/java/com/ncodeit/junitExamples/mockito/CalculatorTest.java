package com.ncodeit.junitExamples.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
	
	@Spy
	private AddService addService;
	
	@Mock
	private SubtractService subtractService;
	
	@InjectMocks
	private Calculator calc=new Calculator();
	
	@Test
	public void testAdd_withSuccess() {
		when(addService.add(anyInt(), anyInt())).thenReturn(5);
		int result=calc.add(3, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void testSubtract_withSuccess() {
		when(subtractService.subtract(anyInt(), anyInt())).thenReturn(2);
		int result=calc.subtract(4, 2);
		assertEquals(2, result);
		verify(subtractService,times(1)).subtract(4,2);
	}
	
	@Test
	public void testAdd1_withSuccess() {
		int result=calc.add(3, 3);
		assertEquals(6, result);
	}

}
