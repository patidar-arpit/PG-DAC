package com.core;

public class CircularQueue{
	
	private int front;
	private int rear;
	private int [] queue;
	
	public CircularQueue() {
		this.front = -1;
		this.rear =-1;
		
		this.queue = new int [5];
	}
	
	public CircularQueue(int n) {
		this.front = -1;
		this.rear =-1;
		
		this.queue = new int [n];
	}
	
	public boolean isEmpty() {
		
		return this.rear ==-1;
		
	}
	public boolean isFull() { 
	      return this.front == (rear+1)%this.queue.length;
	}
	
	public void enqueue(int n) throws Exception {
		
		if(isFull())
			 throw new Exception("Quesue is full");
		
		if(front==-1)
			front=0;
		
		rear = (rear +1)%queue.length;
		
		queue[rear] = n;
		
	}
	
	public int dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		int elem = queue[front];
        
		if(rear == front) {
			rear =-1;
			front =-1;
		}
		else
		{
			front = (front+1)%queue.length;
		}
		return elem;
			
	}
	
	public int peek() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		return queue[front];
	}
	
//	public int getSize() {
//		return this.rear - this.front +1;
//	}
	
	public void display() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		int i;
		for( i = front ;i!=rear ;i = (i+1)%queue.length) {
			//System.out.println("Hello");
			System.out.print(queue[i]+" ");
		}
		
	   System.out.println(queue[i]);
	   System.out.println();
//		System.out.println(front);
//		System.out.println(rear);
	}

	public int getSize() {
		if(front>rear)
			return ((queue.length-front)+1)+rear;
		else {
			return rear-front+1;
		}
	}
}
	
