package com.tester;

import java.util.Scanner;
import com.core.*;

public class TestStack {

	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
			System.out.println("enter the count");
			int n= sc.nextInt();
			Stack s = new Stack(n);
		    
			while (true) {
				System.out.println("a.Display the stack");
				System.out.println("b.Push the data on the stack");
				System.out.println("c.Pop the data on the stack");
				System.out.println("d.Check the size of stack");
				System.out.println("e.Stack is full or not");
				System.out.println("f.Stack is empty or not ?");

				System.out.println("Enter the choice:");
				
				try {
					switch (sc.next().charAt(0)) {
					case 'a':
						s.display();
						break;
						
					case 'b':
						System.out.println("Enter the element top be pushed");
						s.push(sc.nextInt());
						break;
						
					case 'c':
						
						System.out.println(s.pop());
						break;
					
					case 'd':
						System.out.println(s.getSize());
						break;
					case 'e':
						System.out.println(s.isFull());
						break;
					case 'f':
						System.out.println(s.isEmpty());
						break;
						
						
					default:
						System.out.println("Envalid choiice:");
						break;
					}
					
				} 
				
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
	 }
 
  }
}
