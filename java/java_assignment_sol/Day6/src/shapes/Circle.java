package shapes;

public class Circle extends Shape {
	
	double radi;

	public Circle(int x, int y, double radi) {
		super(x, y);
		this.radi = radi;
	}
	
	@Override
	public String toString() {
		return "Circle:"+super.toString()+"radius="+this.radi;
	}
	
	@Override
	public double area() {
		return Math.PI*this.radi+this.radi;
	}

}
