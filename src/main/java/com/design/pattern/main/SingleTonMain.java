package com.design.pattern.main;

import com.design.pattern.model.Employee;

public class SingleTonMain {
	public static void main(String[] args) {

		// Employee emp=new Employee();-->gives compile time error.
		Employee emp = Employee.getEmployeeInstance();
		emp.show();
		
	}


}
