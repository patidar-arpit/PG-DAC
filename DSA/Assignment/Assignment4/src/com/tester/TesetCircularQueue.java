package com.tester;

import java.util.Scanner;

import com.core.CircularQueue;



public class TesetCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the count");
		int n= sc.nextInt();
		CircularQueue q = new CircularQueue(n);
	    
		while (true) {
			System.out.println("a.Display the CircularQueue");
			System.out.println("b.enQueue the data on the CircularQueue");
			System.out.println("c.deQueue the data ");
			System.out.println("d.Check the size of CircularQueue");
			System.out.println("e.CircularQueue is full or not");
			System.out.println("f.CircularQueue is empty or not ?\n");

			System.out.println("Enter the choice:");
			
			try {
				switch (sc.next().charAt(0)) {
				case 'a':
					q.display();
					break;
					
				case 'b':
					System.out.println("Enter the element top be pushed");
					q.enqueue(sc.nextInt());
					break;
					
				case 'c':
					
					System.out.println(q.dequeue());
					break;
				
				case 'd':
				    System.out.println(q.getSize());
					break;
				case 'e':
					System.out.println(q.isFull());
					break;
				case 'f':
					System.out.println(q.isEmpty());
					break;
					
					
				default:
					System.out.println("Envalid choiice:");//
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
