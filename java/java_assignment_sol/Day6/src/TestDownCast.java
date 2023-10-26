class A{
	public A() {
		//System.out.println("In A constructor");
	}
	
	public void show() {
		System.out.println("In A's Show");
	}
}

class B extends A{
	public B() {
		//System.out.println("In B's Constructor");
	}
	public void show() {
		//super.show();
		System.out.println("In B's Show");
	}
	
	public void personalShow() {
	   System.out.println("In Personal's B show");
	}
}

public class TestDownCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         A a = new A();
//         a.show();  // A show get Called
//         // a.personalShow(); //give error not defined in A class
//         B b = new B();
//         b.show(); // B show get called
//         b.personalShow(); // B personal show get called
//        
		
		
//	  A a =new  B();  // Upcasting implicitly;
//	  
//	  a.show();  // Runtime polymorphism at a ref is pointing to B object;
//	  //a.personalShow();  // give error that personalShow is not defined in the A class; we have to do the downcasting for that so do the downcast explicitly
//	  
//	  ((B)a).personalShow();  // now a is downcast to the B // B personalShow() get called;
//	  
//	  
		
		
		// Now creating the subclass ref directly refering to superclas object 
		
		
		//B a = new A();  // Give errror that typmismatch please do the downcasting explicitly // Narrowing
		
		//A a  =new A();
		//B b = a;
		
		A a = new B();
		B b =(B)a;  // We not do upcasting and directly do the downcasting
		
		b.show();
		b.personalShow();
		
		  
		
		
	  
	  
		
		
		
         
         
         
		
	}

}
