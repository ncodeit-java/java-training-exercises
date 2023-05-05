package com.ncodeit.json.object2json;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class TestMovieStore {

	public static void main(String[] args) throws JsonProcessingException {
		MovieStore ms=new MovieStore();
		ms.setMovieStoreId(1);
		ms.setMovieStoreName("NetFlix");
		ms.setMovies(Arrays.asList("m1","m2"));
		
		ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        String jsonString= mapper.writeValueAsString(ms);
        System.out.println(jsonString); 

	}

}
