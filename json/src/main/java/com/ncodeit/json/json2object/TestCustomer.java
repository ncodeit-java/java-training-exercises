package com.ncodeit.json.json2object;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestCustomer {

	public static void main(String[] args) throws IOException {
		TestCustomer obj=new TestCustomer();
		File file=obj.getFile("customer.json");
 
        //2. Convert JSON to List of Customer objects
        //Define Custom Type reference for List<Customer> type
        TypeReference<List<Customer>> mapType = new TypeReference<List<Customer>>() {};
        
		ObjectMapper mapper=new ObjectMapper();
		List<Customer> custs=mapper.readValue(file, mapType);
	
		for(Customer cust:custs) {
			System.out.println(cust.getCustName());
		}

	}
	
	  private File getFile(String fileName) throws IOException
	  {
		  URL url = this.getClass().getClassLoader().getResource(fileName);
	      return new File(url.getFile());
	  }		

}
