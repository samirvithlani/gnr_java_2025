package com.abstraction;

interface Car{
	
	void security();
}

class Lock implements Car{
	
	@Override
	public void security() {
		// TODO Auto-generated method stub
		
	}
}


public class Key extends Lock {

}
