package com.nissan.app;

import com.nissan.model.Employee;

public class DemoEmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empOne=new Employee("Sanjay",65000.0);
		Employee empTwo=new Employee("Ganga",75000.0);
		Employee empThree=new Employee("Radhika",85000.0);
		
		//print the output
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);

	}

}
