package com.app.fruits;

class Apple extends Fruit {

	public Apple(String colour, double wieght, String name) {
		super(colour, wieght, name);

	}

	public void jam() {
		System.out.println("Making jam:");
		System.out.println(this.getName());
	}

	public String taste() {
		return "sweeet n sour";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
