package com.core;

import java.time.LocalDate;

public class Pen {
	
	private int ID;
	private Brand brdType;
	private Color clr;
	private String material;
	private String inkColor;
	private int avbStock;
	private LocalDate updateDate;
	private LocalDate listingDate;
	private double price;
	private int discount;
	private static int idGen;
	
	static {
		idGen=0;
	}
	public Pen(Brand brdType, Color clr, String material, String inkColor, LocalDate listingDate, int price) {
		this.brdType = brdType;
		this.clr = clr;
		this.material = material;
		this.inkColor = inkColor;
		this.listingDate = listingDate;
		this.price = price;
		this.ID = ++idGen;
		this.avbStock = this.brdType.getStock();
	    this.updateDate = this.listingDate;	
	    this.discount =0;
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Brand getBrdType() {
		return brdType;
	}
	public void setBrdType(Brand brdType) {
		this.brdType = brdType;
	}
	public Color getClr() {
		return clr;
	}
	public void setClr(Color clr) {
		this.clr = clr;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public int getAvbStock() {
		return avbStock;
	}
	public void setAvbStock(int avbStock) {
		this.avbStock = avbStock;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	public LocalDate getListingDate() {
		return listingDate;
	}
	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Pen [ID=" + ID + ", brdType=" + brdType + ", clr=" + clr + ", material=" + material + ", inkColor="
				+ inkColor + ", avbStock=" + avbStock + ", updateDate=" + updateDate + ", listingDate=" + listingDate
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
	
	
	

}
