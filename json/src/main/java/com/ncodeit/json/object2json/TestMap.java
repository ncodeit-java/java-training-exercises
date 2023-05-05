package com.ncodeit.json.object2json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class TestMap {

	public static void main(String[] args) throws JsonProcessingException {
		
		Map<String,String> mp1=new HashMap<>();
		mp1.put("John", "25");
		mp1.put("Mike", "40");
		mp1.put("Maggy", "30");
		
		ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        String jsonString1= mapper.writeValueAsString(mp1);
        System.out.println(jsonString1); 
        
		Map<String,Employee> mp2=new HashMap<>();
		mp2.put("John", new Employee(1, "John", "Deere"));
		mp2.put("Mike", new Employee(2, "Mike", "Tony"));
		mp2.put("Maggy", new Employee(2, "Maggy", "Bite"));        
        String jsonString2= mapper.writeValueAsString(mp2);
        System.out.println(jsonString2);         
	}

}
