package tester;
import shapes.*;
public class TetstAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape [] s = {
				  new Circle(10,20,3.5),
				  new Circle(20,30,4.5),
				  new Rectangle(5,5,10,20)
		};
		
		for(Shape sh:s) {
			System.out.println(sh);
			if(sh instanceof Circle)
				System.out.println(sh.area());
			else if(sh instanceof Rectangle)
				System.out.println(sh.area());
		}
	}

}
