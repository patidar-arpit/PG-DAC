package tester;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the points");
		Point2D[] point = new Point2D[sc.nextInt()];
		while(true)
		{
		System.out.println("enter the index in which we want to enter the cordinates");
		int index=sc.nextInt();
		if(index>=0 && index<point.length)
		{
			if(point[index]==null)
			{
			point[index]=new Point2D(sc.nextDouble(),sc.nextDouble());
			}
			else
				System.out.println("point already exist on it");
		}
		else
			System.out.println("invalid point entry");
		
		
//		for(int i =0;i<point.length;i++)
//		{
//			System.out.println("enter the value of cordinates");
//			point[i]=new Point2D(sc.nextDouble(),sc.nextDouble());
//		}
		
		for(Point2D p: point)
		{
			//System.out.println("x and y for each point array"+ p);//this shows the address/reference of p
			if(p!=null)/* since the index values are entered by the user at diff positions so it may contain null values in between indices. so to overcome the NULL PTR EXCEPTION 
						we print only those values which dont have null as values.	*/
			{
			System.out.println(p.getData());
			}
		}

	}

}
}