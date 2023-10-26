package com.app.fruits;

class Orange extends Fruit {

	public Orange(String colour, double wieght, String name) {
		super(colour, wieght, name);

	}

	public String taste() {
		return "sour";
	}

	public void juice() {
		System.out.println("Extracting Juice..!");
		System.out.println(this.getName() + " " + this.getWieght());
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
