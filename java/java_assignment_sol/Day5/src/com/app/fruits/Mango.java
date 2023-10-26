package com.app.fruits;

class Mango extends Fruit {

	public Mango(String colour, double wieght, String name) {
		super(colour, wieght, name);
	}

	public String taste() {
		return "sweet";
	}

	public void pulp() {
		System.out.println("Creating a  pulp..!");
		System.out.println(super.getName() + " " + super.getColour());
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
