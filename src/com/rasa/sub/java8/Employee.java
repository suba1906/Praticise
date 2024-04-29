package com.rasa.sub.java8;

import java.util.Objects;

public class Employee {

	private String name;

	private String gender;

	private String department;

	private int age;
	
	private String salary;


	


	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee(String name, String gender, String department, int age, String salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, String department, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", department=" + department + ", age=" + age
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, department, gender, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	

}
