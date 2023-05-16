package com.example.springdatajpa.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.springdatajpa.entity.unidirectional.Student;

public interface StudentRepo extends PagingAndSortingRepository<Student,Integer> {
	
	@Query("SELECT s FROM Student s")
	List<Student> getAllStudents(Pageable pageable);

}
