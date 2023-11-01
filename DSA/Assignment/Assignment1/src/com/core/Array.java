package com.core;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Array {

	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.stream(arr)
		.forEach(i->System.out.print(i+" "));
		
		System.out.println();
	}

	public static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j] ;
			arr[j] =temp;
			i++;
			j--;
		}
		
//		To convert List to Integer arrays
		
//		List<Integer> list = Arrays.asList(arr);
//		Collections.reverse(list);
//		arr = new Integer[list.size()];
//		list.toArray(arr);
		
	}

	public static int replaceElem(int index, int value, int[] arr) {
		if(index> arr.length || index<0) {
			throw new RuntimeException("Index invalid..!");
		}
		
		int elem = arr[index];
		arr[index] = value;
		return elem;
		
		
		
	}

	public static int  sumOfAll(int[] arr) {
		// TODO Auto-generated method stub
		int sum = Arrays.stream(arr)
		.sum();
		return sum;
	}

	public static 	int maxOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum = Arrays.stream(arr).max().orElseThrow();
		return maxSum;
	}

	public static double average(int[] arr) {
		// TODO Auto-generated method stub
		return Arrays.stream(arr).average().orElseThrow();
	}

	

	public static void displayEvenOdd(int[] arr) {
		// TODO Auto-generated method stub
		System.out.print("Even Elements:");
		Arrays.stream(arr)
		.filter(i->i%2==0)
		.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		System.out.print("Odd Elements:");
		Arrays.stream(arr)
		.filter(i->i%2==1)
		.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		
	}

}
