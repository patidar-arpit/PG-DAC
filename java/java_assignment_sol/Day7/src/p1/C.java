package p1;

public class C implements A, B {

	 @Override
	  public double calculate(double a, double b) {		 
		System.out.println("A:"+A.SPEED+"B:"+B.SPEED);
		return a*b;	
	 }
	 
	 

}
