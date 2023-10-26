package com.core;

public enum EmpType {
    FTE(20000),PTE(400);
    
	private int amount;
	
	EmpType(int amount) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
				
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	
	
	
	
	
}
