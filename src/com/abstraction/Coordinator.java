package com.abstraction;

//interface pure abstract class
interface ODOO{
	
	//public abstract
	void project();
}
interface TATA{
	void mainproject();
}
interface TCS extends TATA{
	
	//void app();
	void project();
}



public class Coordinator implements ODOO,TCS {

	@Override
	public void project() {
		
		System.out.println("coordinator called...*");
		
	}

	
	public static void main(String[] args) {
		
		ODOO o = new Coordinator();
		TCS t = new Coordinator();
		o.project();
		t.project();
		
	}


	@Override
	public void mainproject() {
		// TODO Auto-generated method stub
		
	}

	

}
