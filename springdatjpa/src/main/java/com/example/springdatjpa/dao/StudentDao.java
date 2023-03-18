package com.example.springdatjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springdatjpa.entity.unidirectional.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
	
	Student findByStudentName(String name) throws Exception;
	
	@Query("SELECT s FROM Student s WHERE LOWER(s.studentName) = LOWER(:name)")
	Student getStudent(@Param("name") String name) throws Exception;
	
	Student getStudent(int id,String name) throws Exception;	
	
}

