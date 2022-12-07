package com.nissan.model;

public class Employee {
	
	//instance variables
	private String empName;
	private Double salary;
	
	//default constructor
	public Employee(){
		
	}

	//parameterized constructor
	public Employee(String empName, Double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	
	

	//Getter Setter
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//toString
	@Override
	public String toString() {
		return "Employee :" + empName + " " + salary ;
	}
	
	


	
}
