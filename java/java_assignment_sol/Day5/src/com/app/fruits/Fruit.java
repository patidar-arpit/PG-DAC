package com.app.fruits;

public class Fruit {

	private String colour;
	private double wieght;
	private String name;
	private boolean fresh;

	public Fruit(String colour, double wieght, String name) {
		// TODO Auto-generated constructor stub
		this.colour = colour;
		this.wieght = wieght;
		this.name = name;
		this.fresh = true;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWieght() {
		return wieght;
	}

	public void setWieght(double wieght) {
		this.wieght = wieght;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String taste() {
		return "No Specific taste here..!";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.colour + " " + this.wieght;
	}

}
