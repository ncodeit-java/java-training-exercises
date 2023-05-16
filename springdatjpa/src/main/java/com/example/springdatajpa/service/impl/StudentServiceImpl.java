package com.example.springdatajpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.dao.StudentDao;
import com.example.springdatajpa.dao.StudentRepo;
import com.example.springdatajpa.entity.unidirectional.Student;
import com.example.springdatajpa.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	
	@Autowired
	private StudentRepo repo;	

	@Override
	public void save(Student st) throws Exception {
		dao.save(st);
	}

	@Override
	public Student findStudent(int id) throws Exception {
		Optional<Student> optStudent=dao.findById(id);
		
		if(optStudent.isPresent()){
			return optStudent.get();
		}
		return null;
	}

	@Override
	public void saveAll(List<Student> students) throws Exception {
		dao.saveAll(students);
	}

	@Override
	public Student updateStudent(Student st) throws Exception {
		return dao.save(st);
	}

	@Override
	public void deleteStudent(Student st) throws Exception {
		dao.delete(st);
	}

	@Override
	public Student findByName(String name) throws Exception {
		return dao.findByStudentName(name);
	}

	@Override
	public Student getStudent(String name) throws Exception {
		return dao.getStudent(name);
	}

	@Override
	public Student getStudent(int id, String name) throws Exception {
		return dao.getStudent(id,name);
	}

	@Override
	public List<Student> getAllStudents(Pageable pageable) throws Exception {
		return repo.getAllStudents(pageable);
	}

}
