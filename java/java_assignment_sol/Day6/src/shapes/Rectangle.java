package shapes;

public class Rectangle extends Shape {
	
	int breadth;
	int length;
	
	

	public Rectangle(int x, int y, int breadth, int length) {
		super(x, y);
		this.breadth = breadth;
		this.length = length;
	}

	public String toString() {
		return "Rectangle:"+super.toString()+"legnth:"+this.length+"breadth:"+this.breadth;
	}


	@Override
	public double area() {
		return this.length* this.breadth;
	}

}
