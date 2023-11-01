package com.core;


public class Stack {

	private int top;
	private int[] stack;

	public Stack() {
		this.top = -1;
		this.stack = new int[10];
	}

	public Stack(int n) {
		this.top = -1;
		this.stack = new int[n];
	}

	public boolean isFull() {
		if (top == stack.length - 1)
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (this.top == -1)
			return true;
		return false;
	}

	public void push(int n) throws Exception {
		// System.out.println("Heloo");
		if (this.isFull())
			throw new RuntimeException("Stack is full.!");
		
		stack[++top] = n;
		
	}

	public int pop() throws Exception {

			if (this.isEmpty())
				throw new RuntimeException("Stack is Empty");

		    return stack[top--];
	}

	public int peek() throws Exception {
		
			if (this.isEmpty()) {
				throw new RuntimeException("Stack is Empty");
			}
		
		    return stack[top];
	
	}

	public int getSize() {
		return this.top + 1;
	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		// System.out.println(Arrays.toString(this.stack));
		System.out.println();
	}

}