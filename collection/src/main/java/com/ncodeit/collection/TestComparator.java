package com.ncodeit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestComparator {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Vijay", 23, 100000));
		employeeList.add(new Employee(106, "Ajay", 27, 200000));
		employeeList.add(new Employee(105, "Jai", 21, 300000));

		Collections.sort(employeeList, new EmployeeComparator());
		Iterator<Employee> itr1 = employeeList.iterator();
		while (itr1.hasNext()) {
			Employee employee = (Employee) itr1.next();
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge());
		}

		// Java 8 Comparator using lambda
		System.out.println("Java 8 Comparator using lambda");
		Comparator<Employee> byNameComparator = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
		Collections.sort(employeeList, byNameComparator);
		Iterator<Employee> itr2 = employeeList.iterator();
		while (itr2.hasNext()) {
			Employee employee = (Employee) itr2.next();
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge());
		}

		// Java 8 Comparator using lambda and comparing
		System.out.println("Java 8 Comparator using lambda and comparing");
		Comparator<Employee> byNameComparator1 = Comparator.comparing(Employee::getName);
		Collections.sort(employeeList, byNameComparator1);
		Iterator<Employee> itr3 = employeeList.iterator();
		while (itr3.hasNext()) {
			Employee employee = (Employee) itr3.next();
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge());
		}

		System.out.println("Java 8 Comparator using stream sorting");
		List<Employee> sortedList = employeeList.stream().sorted(byNameComparator).collect(Collectors.toList());
		System.out.println(sortedList);
	
	}
}
