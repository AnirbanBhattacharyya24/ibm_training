package com.ibm.emp;

public class Employee {
	private  static int empNo=1000;
	private String empName;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, double salary) {
		empNo++;
		this.empName = empName;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public void payslip() {
		System.out.println("Emp No: "+empNo);
		System.out.println("Emp Name: "+empName);
		System.out.println("Salary: "+salary);
	}
}
