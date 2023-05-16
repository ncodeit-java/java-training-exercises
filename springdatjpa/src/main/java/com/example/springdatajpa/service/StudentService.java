package com.example.springdatajpa.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.springdatajpa.entity.unidirectional.Student;

public interface StudentService {
	
	void save(Student st) throws Exception;
	
	Student findStudent(int id) throws Exception; 
	
	void saveAll(List<Student> students) throws Exception;
	
	Student updateStudent(Student st) throws Exception;
	
	void deleteStudent(Student st) throws Exception;
	
	Student findByName(String name) throws Exception;
	
	Student getStudent(String name) throws Exception;
	
	Student getStudent(int id,String name) throws Exception;
	
	List<Student> getAllStudents(Pageable pageable) throws Exception;

}
