package com.ncodeit.json.object2json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class TestCar 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        Car obj=new Car();
        obj.setBrand("BMW");
        obj.setEngineId(12);
        obj.setModel("SUV");
        obj.setAutomatic(true);
        
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        String jsonString= mapper.writeValueAsString(obj);
        System.out.println(jsonString);
    }
}
