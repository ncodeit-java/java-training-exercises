package com.example.springdatajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.dao.DepartmentDao;
import com.example.springdatajpa.entity.oneToMany.bidirectional.Department;
import com.example.springdatajpa.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public void saveDepartment(Department department) throws Exception {
		departmentDao.save(department);

	}

}
