package com.ncodeit.junitExamples;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"","p1","   "})
	public void testIsBlank(String input) {
		StringUtil obj=new StringUtil();
		boolean result=obj.isBlank(input);
		assertTrue(result);
	}

}
