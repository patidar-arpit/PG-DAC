package stack;

import java.util.Arrays;
import java.util.Stack;

class SimpleStack {

	private int top;
	private int[] stack;

	public SimpleStack() {
		this.top = -1;
		this.stack = new int[10];
	}

	public SimpleStack(int n) {
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
			throw new Exception("Stack is full.!");
		
		stack[++top] = n;
		
	}

	public int pop() throws Exception {

			if (this.isEmpty())
				  throw new Exception("Stack is empty"); 

		 
		   return stack[top--];
	}

	public int peek() throws Exception {
		
			if (this.isEmpty()) {
				  throw new Exception("Stack is empty"); 
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

public class Stack1 {

	public static void main(String[] args) throws Exception {

		SimpleStack s = new SimpleStack();

		try {
			s.push(10); // 10
			s.push(20); // 20 10
			s.push(20); // 20 20 10
			s.push(4); // 4 20 20 10
			s.push(50); // 50 4 20 20 10
			s.display(); // 50 4 20 20 10
			System.out.println(s.getSize()); // 5
			
			s.display();
	        System.out.println(s.pop());
	        System.out.println(s.pop());
	        
			System.out.println(s.getSize()); // 3
			System.out.println(s.peek()); //
			System.out.println(s.peek());
			s.display();
			System.out.println(s.getSize());
			System.out.println(s.pop());
			System.out.println(s.pop());
	        System.out.println(s.pop());
	        System.out.println(s.getSize());
	        System.out.println(s.isEmpty());
	        System.out.println(s.isFull());
	        System.out.println(s.pop());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		

	}

}
