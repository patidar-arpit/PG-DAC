package com.stack;

import java.util.Scanner;

public class TesterStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Choose Fixed Stack");
		System.out.println("2.Choose Growable Stack");
		System.out.println("3.Push Data");
		System.out.println("4.Pop Data");
		System.out.println("5.show");
		System.out.println("6.getSize()");
		System.out.println("7.Exit");
		
		Stack f1 = null;
		int common =0 ;
		int flag1 = 0;
		int flag2 = 0;
		
		
	   while(true) {
		   System.out.println("Enter choice:");
		   switch (sc.nextInt()) {
				case 1:
				     
					 if((flag1 ==0 || flag1 ==1) &&  flag2!=2 ) {
						 flag1=1;
						 common = 1;
						 f1 = new FixedStack();
					 }
					 else {
						 System.out.println("You are already in Growable stack");
					 }
					
					 break;
				case 2:
					if((flag2 ==0 || flag2 ==2) &&  flag1!=1 ) {
						 flag2=2;
						 common = 1;
						 f1 = new VariableStack();
					 }
					 else {
						 System.out.println("You are already in Fixed  stack");
					 }
					
					break;
				case 3:
					
					if(common==0)
						System.out.println("Please choose stack first! No stack choosen");
					else {
						System.out.print("Enter customer details:");
						Customer c1 = new Customer(sc.nextInt(),sc.next(),sc.next());
						f1.push(c1);
					}
					
					break;
					
				case 4:
					if(common==0)
						System.out.println("Please choose stack first! No stack choosen");
					else
						System.out.println(f1.pop());
					
					break;
					
				case 5:
					if(common == 0)
						System.out.println("Please choose stack first! No stack choosen");
					else {
						f1.show();
					}
					
				    break;
				case 6:
					 System.out.println(f1.size());
					 break;
				case 7:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice.!");
		}
	   }

	}

}


//if(flag1 == 1 || count==0) {
//	f1 = new FixedStack();
//	flag1 =1;
//	}
//	else {
//		System.out.println("You are already in Grow");
//	}
//
//if(flag1==2 || count==0) {
//	f1 = new VariableStack();
//	flag1 =2;
//	}
//	else {
//		System.out.println("You are already in fixed");
//	}