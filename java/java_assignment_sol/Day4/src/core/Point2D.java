package core;
import java.util.Scanner;
import java.lang.*;

public class Point2D
{
	double x;
	double y;
	
	public Point2D(double x_co,double y_co)
	{
		this.x = x_co;
		this.y = y_co;
	}
	
	public String show()
	{
		return ("For num : " + " x_co :" +  this.x + " y_co :" + this.y );
	}
	
	public boolean isEqual(Point2D num2)
	{
		if(this.x == num2.x && this.y==num2.y)
			return true;
		else
			return false;
	}
	
	public double distance(Point2D num2)
	{	
		double distance = Math.sqrt(Math.abs(((num2.x - this.x)*(num2.x - this.x)) - ((num2.y - this.y)*(num2.y - this.y))));
		return distance;
	}
	
	
}