package com.example.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.entity.unidirectional.Student;
import com.example.springdatajpa.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/student",method = RequestMethod.POST
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createStudent(@RequestBody Student student) {
		try {
			studentService.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/student/{studentId}",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Student getStudent(@PathVariable("studentId") int studentId) {
		Student student=null;
		try {
			student= studentService.findStudent(studentId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)
	public List<Student> getStudents(@RequestParam(required = false) String id) {
		List<Student> students=null;
		PageRequest pr=PageRequest.of(0, 2,Sort.by("studentName").descending());
		try {
			students= studentService.getAllStudents(pr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.POST
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createStudents(@RequestBody List<Student> students) {
		try {
			studentService.saveAll(students);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.PUT
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void updateEmployee(@RequestBody Student student) {
		try {
			studentService.updateStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/student/{studentId}",method = RequestMethod.DELETE)	
	public void deleteEmployee(@PathVariable("studentId") String studentId) {
		try {
			Student student=new Student();
			student.setStudentId(studentId);			
			studentService.deleteStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@RequestMapping(value = "/student/{studentName}",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Student getStudentByName(@PathVariable("studentName") String studentName) {
		Student student=null;
		try {
			student= studentService.findByName(studentName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}	

}
