package com.stack;

public class VariableStack implements Stack {

	int top =-1;
	int s = 0;
	Customer[] cpp =new Customer[STACK_SIZE];
	 int newSize = STACK_SIZE;
	@Override
	public void push(Customer c1) {
		if(s==newSize) {
		  newSize = newSize*3;
		  Customer [] ncpp = new Customer[newSize];
		  for(int i = 0 ; i < s ; i++) {
			  ncpp[i] = cpp[i];			  
		  }
		  cpp = ncpp; // copy of references;
	    }
		cpp[s] = c1;
		s++;
		top++;
	}

	@Override
	public Customer pop() {
		Customer c =new Customer(0,null,null);
		if(s!=0) {
		    c= cpp[top];
			top--;
			s--;
			return c;
		}	
		else {
			System.out.println("Stack is empty");
		}
		return c;
		
	}
	
	public void show() {
		for(int i =top;i>=0;i--) {
			if(cpp[i] != null)
			  System.out.println(cpp[i].toString());
		}
	}
	
	public int size() {
		return s;
	}

}
