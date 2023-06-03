package com.ncodeit.springtransactions.service;

import java.util.List;

import com.ncodeit.springtransactions.domain.Person;


public interface AppService {
	
	public void savePersonsWithTransactionAnnotation(List<Person> persons) throws Exception;
	
	public void savePersonsWithDeclarativeTransaction(List<Person> persons) throws Exception;

}
