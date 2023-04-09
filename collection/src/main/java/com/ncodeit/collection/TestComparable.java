package com.ncodeit.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Vijay", 23, 100000));
		employeeList.add(new Employee(106, "Ajay", 27, 200000));
		employeeList.add(new Employee(105, "Jai", 21, 300000));
		Collections.sort(employeeList);
		for (Employee employee : employeeList) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge());
		}
	}
}
