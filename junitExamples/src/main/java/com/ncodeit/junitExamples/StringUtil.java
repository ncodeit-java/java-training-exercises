package com.ncodeit.junitExamples;

public class StringUtil {
	
	public boolean isBlank(String s) {
		if(s==null || s.trim().length()==0) {
			return true;
		}
		return false;
	}

}
