package com.maciej.dto;

public class Person {
	private String name;
	private String lastname;
	private int salary;
	
	public Person(String name, String lastname, int salary) {
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
