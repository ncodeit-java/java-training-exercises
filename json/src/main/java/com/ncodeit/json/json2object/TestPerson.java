package com.ncodeit.json.json2object;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestPerson {

	public static void main(String[] args) throws IOException {
		TestPerson obj=new TestPerson();
		File file=obj.getFile("Person.json");
        
		ObjectMapper mapper=new ObjectMapper();
		Person ps=mapper.readValue(file, Person.class);
		System.out.println(ps.getFirstName());
		System.out.println(ps.getLastName());
		
		String personJson=mapper.writeValueAsString(ps);
		System.out.println(personJson);
	}
	
	  private File getFile(String fileName) throws IOException
	  {
		  URL url = this.getClass().getClassLoader().getResource(fileName);
	      return new File(url.getFile());
	  }		

}
