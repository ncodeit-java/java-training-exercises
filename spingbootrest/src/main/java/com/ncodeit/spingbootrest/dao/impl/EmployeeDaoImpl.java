package com.ncodeit.spingbootrest.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ncodeit.spingbootrest.dao.EmployeeDao;
import com.ncodeit.spingbootrest.domain.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employees=new ArrayList<>();
	
	public EmployeeDaoImpl() {
		
		Employee emp1=new Employee();
		emp1.setEmpId("1");
		emp1.setEmpName("emp1");
		emp1.setAddress("hyd");

		Employee emp2=new Employee();
		emp2.setEmpId("2");
		emp2.setEmpName("emp2");
		emp2.setAddress("hyd");		
		
		employees.add(emp1);
		employees.add(emp2);
	}

	@Override
	public Employee getEmployee(String id) {
		Optional<Employee> optEmployee= employees.stream()
				.filter(e-> e.getEmpId().equals(id)).findFirst();
		if(optEmployee.isPresent()) {
			return optEmployee.get();
		}
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public void createEmployee(Employee emp) {
		employees.add(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		Employee emp1=null;
		Optional<Employee> optEmployee= employees.stream()
				.filter(e-> e.getEmpId().equals(emp.getEmpId())).findFirst();
		if(optEmployee.isPresent()) {
			//simulating update by deleting and add
			emp1=optEmployee.get();
			employees.remove(emp1) ;
			employees.add(emp);
		}
	}

	@Override
	public void deleteEmployee(String empId) {
		Optional<Employee> optEmployee= employees.stream()
				.filter(e-> e.getEmpId().equals(empId)).findFirst();
		if(optEmployee.isPresent()) {
			Employee emp= optEmployee.get();
			employees.remove(emp) ;
		}		
	}

}
