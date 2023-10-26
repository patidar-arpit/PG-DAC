package tester;

import java.util.Scanner;

class MethodOverLoadingEasy {
	static void go(byte x)
		{ System.out.print("byte "); }
	
	
	 static void go(short x) { System.out.print("short "); }
	 
//	static void go(int x) {
//		System.out.print("int ");
//	}
//	
//	
     
	static void go(long x) {
		System.out.print("long ");
	}

	static void go(double x) {
		System.out.print("double ");
	}
	
	static void test(int a,double b)
	{
		System.out.println(1);
	}
	static void test(double a ,int b)
	{
		System.out.println(2);
	}
	
	static void test1(Object o)
	{
		System.out.println("in obj version");
	}
	static void test1(String o)
	{
		System.out.println("in string version");
	}
	static void test1(Scanner o)
	{
		System.out.println("in scanner version");
	}
	
	public static void main(String[] args) {
		int n =3;
		byte b = 5;
	    short s = 5;
		long l = 5;
		float f = 5.0f;
		go(b);   // int
		go(s);    //int
		go(l);    // long
		go(f);    // double
		go(n);   //  long
		
		
		test(2.3,1);  //2
		test(1,3.4);  //1
		// test(2,2);    //
		
		//test1(null);  ambigious error
  
	}
}
