package com.design.pattern.model;

public class Employee {
	public static Employee empObj=new Employee();
	private Employee()
	{
		
	}
	public static Employee getEmployeeInstance()
	{
		return empObj;
	}
	public void show()
	{
		System.out.println("Example of Singleton design pattern");
	}

}
