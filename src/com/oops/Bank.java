package com.oops;

public class Bank {
	
	public int bankBal=2000;
	//bank class const
	
	public Bank() {
		System.out.println("default const of Bank class !");
	}
	
	public int checkBal() {
		
		System.out.println("check bal called !!");
		return bankBal;
	}

	public static void main(String[] args) {
		
		Bank b; //referance it has no cap to call const..
		//new Bank(); it will call const
		Bank elon = new Bank();
		Bank Mukesh = new Bank();
		Bank Mark = new Bank();
		
		System.out.println(elon.checkBal());
		System.out.println(Mukesh.checkBal());
		System.out.println(Mark.checkBal());
		
	}
}
