package com.ibm.bank;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bank c=AccountFactory.openCurrent("Polo");
//		c.summary();
//		
//		c.withdraw(4000);
//		c.withdraw(6000);
//		c.summary();
//		
//		c.deposit(3000);
//		c.deposit(5000);
//		c.statement();
//		
		Bank s=AccountFactory.openSavings("Polo");
//		s.deposit(2000);
		try {
			s.withdraw(7000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
//		s.deposit(1000);
//		s.withdraw(1500);
//		s.statement();
	}

}
