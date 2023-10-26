package com.core;

public class Order {
	
	public int orderId;
	public int petId;
	public int quantity;
	public StatusOrder staus;
	public static int idGen;
	
	static {
		idGen=0;
	}

	public Order(int petId, int quantity) {
		
		this.petId = petId;
		this.quantity = quantity;
		this.orderId = ++idGen;
		this.staus = StatusOrder.PLACED;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public StatusOrder getStaus() {
		return staus;
	}

	public void setStaus(StatusOrder staus) {
		this.staus = staus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", staus=" + staus + "]";
	}
	
	
	
	

}
