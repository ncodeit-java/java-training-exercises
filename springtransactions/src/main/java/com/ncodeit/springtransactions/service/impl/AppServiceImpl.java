package com.ncodeit.springtransactions.service.impl;

import java.util.List;

import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import com.ncodeit.springtransactions.dao.PersonRepository;
import com.ncodeit.springtransactions.domain.Person;
import com.ncodeit.springtransactions.service.AppService;

@Service
public class AppServiceImpl implements AppService {
	
	@Autowired
	private TransactionTemplate transactionTemplate;
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	//@Transactional
	@Transactional(rollbackOn = Exception.class)
	public void savePersonsWithTransactionAnnotation(List<Person> persons) throws Exception {
		
		int i=0;
		for(Person p:persons) {
			if(i==persons.size()-1) {
				//throw new RuntimeException(); //simulating use case - exception while saving the last element
				throw new Exception();
			}
			personRepository.save(p);
			i++;
		}
	}

	@Override
	public void savePersonsWithDeclarativeTransaction(List<Person> persons) throws Exception {
		transactionTemplate.execute(st->{
			int i=0;
			for(Person p:persons) {
				if(i==persons.size()-1) {
					//throw new RuntimeException(); //simulating use case - exception while saving the last element
					personRepository=null;
				}
				personRepository.save(p);
				i++;
			}			
			return null;
		});
		
	}

}
