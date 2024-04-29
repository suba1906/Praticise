package com.rasa.sub;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestSalaryPerson {

	public static void main(String[] args) {

		Employee e = new Employee("suba", 11, "it", 30000);
		Employee e1 = new Employee("lal", 12, "hr", 65000);
		Employee e2 = new Employee("rocky", 13, "it", 26000);
		Employee e3 = new Employee("john", 14, "hr", 45000);
		Employee e4 = new Employee("mahi", 15, "manager", 70000);
		Employee e5 = new Employee("kavi", 16, "it", 40000);

		List<Employee> emplist = new ArrayList<>();
		emplist.add(e);
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);

		Map<String, Optional<Employee>> list =emplist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(list);

	}

}
