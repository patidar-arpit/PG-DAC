package com.core;

public enum Brand {
	
	CELLO(0),PARKER(0),REYNOLDS(0),HAUSER(0),PENTONIC(0);
	
	private int Stock;
	
	private Brand(int Stock) {
		this.Stock = Stock;
	}
	
	public void setStock(int Stock) {
		this.Stock=Stock;
	}
	
	public int getStock() {
		return this.Stock;
	}
	
}
