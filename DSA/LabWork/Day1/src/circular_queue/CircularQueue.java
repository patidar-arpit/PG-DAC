package circular_queue;


class Queue{
	
	private int front;
	private int rear;
	private int [] queue;
	
	public Queue() {
		this.front = 0;
		this.rear =0;
		
		this.queue = new int [5];
	}
	public Queue(int n) {
		this.front = 0;
		this.rear =0;
		
		this.queue = new int [n];
	}
	
	public boolean isEmpty() {
		return ((this.front==0 && this.rear==0));
		
	}
	public boolean isFull() { 
		
	      return (rear+1)%queue.length == front;
	}
	
	public void enqueue(int n) throws Exception {
		
		if(isFull())
			 throw new Exception("Quesue is full");
		
		queue[rear] = n;
		
		rear = (rear +1)%queue.length;
		
			
	}
	
	public int dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		int eleme = queue[this.front];
		front = (front + 1)%queue.length;
		
		return eleme;
	}
	
	public int peek() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		return queue[this.front];
	}
	
	public int getSize() {
		if(rear>front) {
			return rear-front+1;
		}
		else
			return queue.length-front+rear+1;
	}
	
	public void display() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		for(int i = front ;i<=rear ;i = ((i+1)%queue.length)) {
			System.out.print(queue[i]+" ");
		}
		
		System.out.println();
//		System.out.println(front);
//		System.out.println(rear);
	}
	
	
	
}

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue sq = new Queue();
		try {
			sq.enqueue(10);  // 10
			sq.enqueue(20);  // 10 20
			sq.enqueue(30);  // 10 20 30 
			sq.enqueue(40);  // 10 20 30 40 
			sq.enqueue(50);  // 10 20 30 40 50 
			sq.display();    // 10 20 30 40 50 
			//sq.enqueue(10); //queue is full bhai.!
			
			System.out.println(sq.getSize());  //5
			System.out.println(sq.dequeue());  // 10
			System.out.println(sq.dequeue());  // 20
			System.out.println(sq.dequeue()); //30
			sq.display();        //   40 50 
			System.out.println(sq.getSize());  // 2
			System.out.println(sq.isFull());  // false
			
			sq.enqueue(100);
			sq.enqueue(200);
			System.out.println(sq.getSize());  //4
			sq.display();               //   40 50   100 200 
			System.out.println(sq.peek());   // 40
			System.out.println(sq.getSize()); //2
			sq.display();              
			System.out.println(sq.dequeue()); //40
			System.out.println(sq.dequeue()); // 50
			System.out.println(sq.getSize());//2
			System.out.println(sq.isEmpty()); // false
			System.out.println(sq.dequeue()); // 100
			System.out.println(sq.dequeue());  //200
			System.out.println(sq.getSize()); // 0
			
			System.out.println(sq.dequeue());  // queue is empty
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
