package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class GenericStack<T> {

	private ArrayList<T> list;

	public GenericStack() {
	
		list = new ArrayList<T>();
		
	}

	public GenericStack(int n) {
		//this.top = -1;
		this.list = new ArrayList<T>(n);
	}

//	public boolean isFull() {
////		ArrayList<Integer>
//		if (top == list.size() - 1)
//			return true;
//		return false;
//	}

	public boolean isEmpty() {
		if (this.list.size() == 0)
			return true;
		return false;
	}

	public void push(T n) throws Exception {
		
		list.add(0, n);
		
	}

	public T pop() throws Exception {

			if (this.isEmpty())
				  throw new Exception("Stack is empty"); 
            
		   T x = list.get(0);
		   list.remove(0);
		   return x;
	}

	public T peek() throws Exception {
		
			if (this.isEmpty()) {
				  throw new Exception("Stack is empty"); 
			}
		
		    return list.get(0);
	
	}

	public int getSize() {
		return this.list.size();
	}

	public void display() {
		for(T e :list) {
			System.out.print(e+" ");
		}
		System.out.println();
	}

}

public class Stack2 {

	public static void main(String[] args) throws Exception {

		GenericStack<Integer> s = new GenericStack<>();
		GenericStack<Double>  s1 = new GenericStack();

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
	       // System.out.println(s.isFull());
	        System.out.println(s.pop());
	        
	        s1.push(10.5);
	        s1.push(67.7);
	        s1.display();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	
		
		
	}

}
