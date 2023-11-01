package com.tester;

import java.util.Scanner;

import com.core.Array;

public class testerArray {

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		System.out.println("enter the elements of array:");
		int n= sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
	    
		while (true) {
			System.out.println("a. Display the array");
			System.out.println("b. Reverse the array");
			System.out.println("c. Replace the nth element from the array and println");
			System.out.println("d. Find the addition of all elements of the array");
			System.out.println("e. Find the maximum number from the array");
			System.out.println("f. println the average of all the elements from the array.");
			System.out.println("g. Display the even and odd number from the array separately.");

			
			System.out.println("Enter the choice:");
			
			switch (sc.next().charAt(0)) {
			case 'a':
				Array.display(arr);
				break;
				
			case 'b':
				Array.reverse(arr);
				break;
				
			case 'c':
				System.out.println("Enter the index and element you want  to replace");
				System.out.println(Array.replaceElem(sc.nextInt(),sc.nextInt(),arr));
				break;
			
			case 'd':
				System.out.println(Array.sumOfAll(arr));
				break;
			case 'e':
				System.out.println(Array.maxOfArray(arr));
				break;
			case 'f':
				System.out.println(Array.average(arr));
				break;
				
			case 'g':
				Array.displayEvenOdd(arr);
				break;
				
			default:
				System.out.println("Envalid choiice:");
				break;
			}
			
			
			
		}
 
	}

	

}
