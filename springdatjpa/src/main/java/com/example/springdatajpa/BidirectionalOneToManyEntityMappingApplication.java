package com.example.springdatajpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springdatajpa.entity.oneToMany.bidirectional.Department;
import com.example.springdatajpa.entity.oneToMany.bidirectional.Employee;
import com.example.springdatajpa.service.DepartmentService;

@SpringBootApplication
public class BidirectionalOneToManyEntityMappingApplication implements CommandLineRunner{
	
	@Autowired
	private DepartmentService departmentService;
	
	public static void main(String[] args) {
		SpringApplication.run(BidirectionalOneToManyEntityMappingApplication.class, args);
	}	
	

	@Override
	public void run(String... args) throws Exception {
		
		Department department=new Department();
		department.setDeptName("HR");
		
		Employee employee1=new Employee();
		employee1.setEmployeeName("emp1");
		employee1.setDepartment(department);
	
		Employee employee2=new Employee();
		employee2.setEmployeeName("emp2");
		employee2.setDepartment(department);
		
		department.setEmployees(Arrays.asList(employee1,employee2));
		
		departmentService.saveDepartment(department);
		System.out.println("done");
		
	}

}
