package com.ibm.emp;

public class TestEmployee1 {

	public static void main(String[] args) {
		Executive exec = new Executive("Mona",5000,2000);
		Manager mgr = new Manager("Jack",7000,4000);
		
		//Employee emp = mgr;
		
		showSalary(exec);
		showSalary(mgr);
	}
//	private static void showSalary(Employee emp) {
//		if(emp instanceof Manager)
//			System.out.println("Manager Salary : " + emp.getSalary());
//		else
//			System.out.println("Executive Salary : " + emp.getSalary());
//	}
	
	private static void showSalary(Manager mgr) {
		// TODO Auto-generated method stub
		System.out.println("Manager Salary : " + mgr.getSalary());
		
	}

	private static void showSalary(Executive exec) {
		// TODO Auto-generated method stub
		System.out.println("Executive Salary : " + exec.getSalary());
	}

}
