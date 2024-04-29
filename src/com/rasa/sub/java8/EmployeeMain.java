package com.rasa.sub.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeMain {
	static int y = 10;
	static int z = 10;

	public static void main(String[] args) {

		int x = 10;
		
		
		Set<Character> set = new HashSet<>();

		System.out.println("before" + x + " " + y);
		changemethod(x, y);

		System.out.println("after" + x + " " + y);

		System.out.println(1 + 2 + "ONE" + 2 + 1 + "");

		String a = "subalakshimi";
		int len = a.length();
		if (a.length() >= 4)
			System.out.println(a.chars().mapToObj(l -> (char) l).map(l -> String.valueOf(l)).limit(len - 4)
					.collect(Collectors.joining("")));

		ArrayList<String> lis = new ArrayList<>();
		lis.add("ubds");
		lis.add("buki");
		lis.add("pipi");
		System.out.println(lis);


		a.chars().mapToObj(l -> (char) l).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(l -> l.getValue() > 1).forEach(l -> System.out.println(l));

		List<String> l1 = Arrays.asList("+91887987", "+9023121", "+91757858", "+7032378");

		List<String> l2 = Arrays.asList("apple", "banana", "orange", "kiwi", "jack");

		System.out.println(l2.stream().collect(Collectors.groupingBy(String::length)));

		System.out
				.println(l2.stream().map(s -> s.contains("an") ? s.replace("an", "") : s).collect(Collectors.toList()));

		System.out.println(l2.stream().collect(Collectors.joining(" ")));

		// System.out.println(l2.stream().flatMap( s-> s).Collect(Collectors.toList()));

		l1.stream().filter(s -> s.startsWith("+91")).forEach(s -> System.out.println(s));

		// printVal(1);
		List<Employee> employee = Arrays.asList(new Employee("suba", "female", "IT", 25, "25000"),
				new Employee("john", "male", "IT", 17, "15000"), new Employee("lal", "male", "IT", 18, "27000"),
				new Employee("opo", "male", "CSC", 25, "25000"), new Employee("kavi", "female", "IT", 31, "30000"),
				new Employee("mala", "female", "CSC", 18, "45000"), new Employee("john", "male", "MECH", 28, "22000"),
				new Employee("kali", "male", "MECH", 45, "67000"), new Employee("bala", "male", "CSC", 34, "45000"));

		System.out.println(employee);

		System.out.println(
				employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		System.out.println(employee.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

		// howmany male and female

		System.out
				.println(employee.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		// print all department
		System.out.println(employee.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList()));

		// average age of female and male
		System.out.println(employee.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));
		// get details of highesh paid employee
		System.out.println(employee.stream().max(Comparator.comparing(Employee::getSalary)).get());

		// count num of employee in each department

		System.out.println(employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingInt(k -> Integer.parseInt(k.getSalary())))));

		// youngest male employee in IT department
		System.out.println(employee.stream()
				.filter(l -> l.getDepartment().equalsIgnoreCase("IT") && l.getGender().equalsIgnoreCase("male"))
				.min(Comparator.comparing(Employee::getAge)));

		employee.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().forEach(e -> {
			System.out.println("**************" + e.getKey());

			List<Employee> l = e.getValue();

			for (Employee em : l) {
				System.out.println(em.getName());
			}
		});

		System.out.println(employee.stream().collect(Collectors.summarizingDouble(k -> Integer.parseInt(k.getSalary()))));

	}

	private static void printVal(int i) {

		if (i > 100)
			return;

		System.out.println(i);
		printVal(++i);
	}

	private static void changemethod(int x, int y) {
		z = 10;

		x = 20;
		y = 20;
	}

}
