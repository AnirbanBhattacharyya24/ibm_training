package com.ibm.emp;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Polo",3000);
		e1.payslip();
		System.out.println(e1.getSalary());
		
		System.out.println("For Eecutive: ");
		Executive ex1 = new Executive("Mona",5000,2000);
		ex1.payslip();
		System.out.println(ex1.getSalary());
		
		System.out.println("For Manager: ");
		Manager mg1 = new Manager("Jack",4000,1500);
		mg1.payslip();
		System.out.println(mg1.getSalary());
	}

}
