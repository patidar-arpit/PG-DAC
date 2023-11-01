package com.core;

public class Queue{
	
	private int front;
	private int rear;
	private int [] queue;
	
	public Queue() {
		this.front = -1;
		this.rear =-1;
		
		this.queue = new int [5];
	}
	public Queue(int n) {
		this.front = -1;
		this.rear =-1;
		
		this.queue = new int [n];
	}
	
	public boolean isEmpty() {
		return this.rear == this.front;
		
	}
	public boolean isFull() { 
	      return this.rear == this.queue.length-1;
	}
	
	public void enqueue(int n) throws Exception {
		
		if(isFull())
			 throw new Exception("Quesue is full");
		
		if(front==-1)
			 front =0;
		queue[++rear] = n;	
	}
	
	public int dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		return queue[this.front++];
	}
	public int getSize() {
		return this.rear - this.front +1;
	}
	
	public void display() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		for(int i = front ;i<=rear ;i++) {
			System.out.print(queue[i]+" ");
		}
		
		System.out.println();
		
	}
	
	
	
}

