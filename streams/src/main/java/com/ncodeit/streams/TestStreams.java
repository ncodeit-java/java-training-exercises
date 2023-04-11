package com.ncodeit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestStreams {

	private static Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0), new Employee(3, "Mark Zuckerberg", 300000.0) };

	public static void main(String[] args) {

		System.out.println("Stream of Array");
		Stream<Employee> streamOfArray = Stream.of(arrayOfEmps);
		streamOfArray.forEach(emp -> System.out.println(emp.getName()));

		System.out.println("Stream of Collection");
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		streamOfCollection.forEach(alphabet -> System.out.println(alphabet));

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Jeff Bezos", 100000.0));
		empList.add(new Employee(2, "Bill Gates", 200000.0));
		empList.add(new Employee(3, "Mark Zuckerberg", 300000.0));

		empList.stream()
				.forEach(emp -> System.out.println(emp.getName() + "'s Salary is : " + emp.getSalary() + " dollars"));

		System.out.println("Stream of Int primitives");
		IntStream intStream = IntStream.range(1, 3);
		intStream.forEach(num -> System.out.println(num));

		System.out.println("Stream of Long primitives");
		LongStream longStream = LongStream.rangeClosed(1, 3);
		longStream.forEach(num -> System.out.println(num));

		System.out.println("Stream of Double primitives");
		Random randomNum = new Random();
		DoubleStream doubleStream = randomNum.doubles(3);
		doubleStream.forEach(random -> System.out.println(random));

		System.out.println("Using Map, Filter and Collect in a stream of Strings");
		List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
				.collect(Collectors.toList());
		elements.forEach(alphabet -> System.out.println("after filtering : " + alphabet));

		List<String> alphabetStrings = Stream.of("a", "b", "c").collect(Collectors.toList());
		Optional<String> anyElement = alphabetStrings.stream().findAny();
		System.out.println("any : " + anyElement.get());
		Optional<String> firstElement = alphabetStrings.stream().findFirst();
		System.out.println("first : " + firstElement.get());

		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		long size = list.stream().map(element -> element.substring(0, 3)).count();
		System.out.println("size : " + size);

		System.out.println("Using Map, Filter and Collect in a stream of objects");
		List<Employee> newEmpList = empList.stream()
				.map(employee -> new Employee(employee.getId(), employee.getName().toUpperCase(), employee.getSalary()))
				.filter(employee -> employee.getName().contains("Z")).collect(Collectors.toList());
		newEmpList.forEach(emp -> System.out.println(emp.getName()));

		System.out.println("ToArray from stream");
		Employee[] employees = empList.stream().toArray(Employee[]::new);
		System.out.println(employees.length);
		for (Employee empl : employees) {
			System.out.println(empl.getName());
		}

		System.out.println("Using FlatMap from stream");
		List<List<String>> namesNested = Arrays.asList(Arrays.asList("Jeff", "Bezos"), Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));
		List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(namesNested.size());
		System.out.println(namesFlatStream.size());

		System.out.println("Using peek from stream");
		empList.stream().peek(e -> System.out.println(e.salaryIncrement(10.0))).collect(Collectors.toList());

		System.out.println("Using sorted from stream");
		List<Employee> employeesList = empList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		employeesList.forEach(emp -> System.out.println(emp.getName()));

		System.out.println("Using min max from stream");
		Employee firstEmp = empList.stream().min((e1, e2) -> e1.getId() - e2.getId())
				.orElseThrow(NoSuchElementException::new);
		System.out.println("First Employee : " + firstEmp.getId() + " with Name : " + firstEmp.getName());

		Employee maxSalEmp = empList.stream().max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out
				.println("Max Salary Employee is : " + maxSalEmp.getName() + " with Salary : " + maxSalEmp.getSalary());

		System.out.println("Using distinct from stream");
		List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
		List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
		distinctIntList.forEach(i -> System.out.println(i));

		System.out.println("Using allMatch anyMatch and noneMatch");
		List<Integer> inteList = Arrays.asList(2, 4, 5, 6, 8);
		boolean allEven = inteList.stream().allMatch(i -> i % 2 == 0);
		System.out.println(allEven);
		boolean oneEven = inteList.stream().anyMatch(i -> i % 2 == 0);
		System.out.println(oneEven);
		boolean noneMultipleOfThree = inteList.stream().noneMatch(i -> i % 3 == 0);
		System.out.println(noneMultipleOfThree);

		System.out.println("using mapToInt to get IntStream");
		Integer latestEmpId = empList.stream().mapToInt(Employee::getId).min().orElseThrow(NoSuchElementException::new);
		System.out.println("max emp Id : " + latestEmpId);

		System.out.println("using reduce operation");
		Double sumSal = empList.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
		System.out.println("Salary sum of all employees : " + sumSal);

		System.out.println("using collectors joining operation");
		String empNames = empList.stream().map(Employee::getName).collect(Collectors.joining(", ")).toString();
		System.out.println("list of all employees : " + empNames);

		System.out.println("using collectors toSet operation");
		Set<String> empNamesSet = empList.stream().map(Employee::getName).collect(Collectors.toSet());
		for (String empName : empNamesSet) {
			System.out.println(empName);
		}

		System.out.println("using collectors toCollection operation");
		Vector<String> empNamesVector = empList.stream().map(Employee::getName)
				.collect(Collectors.toCollection(Vector::new));
		for (String empName : empNamesVector) {
			System.out.println(empName);
		}

		System.out.println("using collectors summarizingDouble operation");
		DoubleSummaryStatistics stats = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Count " + stats.getCount());
		System.out.println("Sum " + stats.getSum());
		System.out.println("min " + stats.getMin());
		System.out.println("max " + stats.getMax());
		System.out.println("Average " + stats.getAverage());

		System.out.println("using collectors partitioningBy operation");
		List<Integer> integerList = Arrays.asList(2, 4, 5, 6, 8);
		Map<Boolean, List<Integer>> isEven = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("isEven : " + isEven);

		System.out.println("using collectors groupingBy operation");
		Map<Character, List<Employee>> groupByAlphabet = empList.stream()
				.collect(Collectors.groupingBy(e -> new Character(e.getName().charAt(0))));

		System.out.println(groupByAlphabet.get('B').get(0).getName());

		System.out.println("using collectors mapping operation");
		Map<Character, List<Integer>> idGroupedByAlphabet = empList.stream().collect(Collectors.groupingBy(
				e -> new Character(e.getName().charAt(0)), Collectors.mapping(Employee::getId, Collectors.toList())));

		System.out.println(idGroupedByAlphabet.get('B').get(0));

		System.out.println("using collectors reducing operation");
		Double percentage = 10.0;
		Double salIncrOverhead = empList.stream()
				.collect(Collectors.reducing(0.0, e -> e.getSalary() * percentage / 100, (s1, s2) -> s1 + s2));
		System.out.println(salIncrOverhead);

		System.out.println("using parallel streams");
		Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0), new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0) };
		List<Employee> employeeList = Arrays.asList(arrayOfEmps);
		employeeList.parallelStream().forEach(e -> System.out.println(e.salaryIncrement(10.0)));
		
		IntStream intStreamParallel = IntStream.range(1, 10).parallel();
		intStreamParallel.forEach(s -> System.out.println(s));
		boolean isParallel = intStreamParallel.isParallel();
		System.out.println("isParallel : "+isParallel);
		
	}

}
