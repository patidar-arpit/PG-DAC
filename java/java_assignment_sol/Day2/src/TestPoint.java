package src;
import java.util.*;

public class TestPoint{
  public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   
	   Point2D obj1=new Point2D(sc.nextInt(),sc.nextInt());
	   Point2D obj2=new Point2D(sc.nextInt(),sc.nextInt());
	   obj1.show();
	   obj2.show();
	   
	   double distance=obj1.calculateDistance(obj2);
	   System.out.println(distance);
	   System.out.println(obj1.isEqual(obj2));
	}
}
