package com.ncodeit.json.json2object;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMain1 {
	
	public static void main(String args[]) throws StreamReadException, DatabindException, IOException {
		
		
		TestMain1 obj=new TestMain1();
		File file=obj.getFile("student.json");
        
		ObjectMapper mapper=new ObjectMapper();
		Student st=mapper.readValue(file, Student.class);
		System.out.println(st.getStudentId());
		System.out.println(st.getStudentName());
		System.out.println(st.getCourses());
	}
	
	  private File getFile(String fileName) throws IOException
	  {
		  URL url = this.getClass().getClassLoader().getResource(fileName);
	      return new File(url.getFile());
	  }	

}
