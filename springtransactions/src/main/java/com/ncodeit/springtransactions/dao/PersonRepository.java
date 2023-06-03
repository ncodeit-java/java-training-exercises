package com.ncodeit.springtransactions.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ncodeit.springtransactions.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
