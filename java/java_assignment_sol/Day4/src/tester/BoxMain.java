package tester;
import java.util.*;

public class BoxMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of boxes you want to make");
		BoxArray[] boxes = new BoxArray[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the dimensions for the box"+(i+1));
			boxes[i] = new BoxArray(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		 for(BoxArray b:boxes)
		 {
		System.out.println("the volume of the box is"+(b.getVolume()));
		if(b.getVolume()>50)
		{
			System.out.println("increase the breadth to twice");
			b.setBreadth(b.getBreadth()*2);
		}
		 }
		

		 sc.close ();
	}

}
