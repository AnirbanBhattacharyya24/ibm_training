package com.ibm.bank;
/** This class represents generalized  bank account.
 * 
 * @author ANIRBAN
 *
 */
public abstract class Account implements Bank {
	protected int acntNo;
	private String holder;
	protected double balance;
	
	public static int autogen=INIT_ACNT_NO;
	
	protected Transaction[] txns;
	protected int idx;
	
	/**This is a default Constructor*/
	public Account() {
	}

	/**parameterized constructor.
	 * 
	 * @param holder
	 * @param balance
	 */
	public Account(String holder, double balance) {
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		
		txns= new Transaction[10];
	}
	
	public void summary() {
		System.out.println("A/C No : "+acntNo);
		System.out.println("Holder : "+holder);
		System.out.println("balance : "+balance);
	}
	public void deposit(double amount) {
		balance+=amount;
		txns[idx ++]=new Transaction("Cr", amount,balance);
	}
	public abstract void withdraw(double amount) throws BalanceException;
	public void statement() {
		System.out.println("Statement of A/C : "+acntNo);
		for(int i=0;i<idx;i++) {
			System.out.println(txns[i].print());
		}
	}
}
