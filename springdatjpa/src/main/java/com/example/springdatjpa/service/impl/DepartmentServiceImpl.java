package com.example.springdatjpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatjpa.dao.DepartmentDao;
import com.example.springdatjpa.entity.oneToMany.bidirectional.Department;
import com.example.springdatjpa.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public void saveDepartment(Department department) throws Exception {
		departmentDao.save(department);

	}

}
