package doubly_linkedList;

class Node{
	public int data;
	public Node next;
	public Node prev;
    
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {
	
	private Node head;
	private int size;
	private Node tail;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int data) {
		Node temp = new Node (data);
		if(head == null) {
			head = temp ;
			tail = temp ;
			size++;
		}
		
		else {
			
			temp.prev = tail;
			tail.next = temp;
			tail = temp; 
			size++;
		}
		
	}
	
	public void  addFirst(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			tail = temp ;
			size++;
			return ;
		}
		
		head.prev = temp;
		temp.next = head;
		head = temp;
		size++;
		
	}
	
	public void insert(int pos,int data) {
		Node temp  = new Node(data);
		if(pos<1 || pos>size)
			   throw new RuntimeException("Invalid Position");
		
		if(pos ==1)
			addFirst(data);
		else if(pos == size) {
			
			temp.next = tail;
			temp.prev = tail.prev;
			tail.prev.next = temp;
			tail.prev = temp;
			size++;
		}
		
		else {
			Node currNode = head;
			int i = 0;
			while(i<pos) {
				currNode = currNode.next;
				i++;
			}
			
			
			temp.next = currNode;
			temp.prev= currNode.prev;
			currNode.prev.next = temp;
			currNode.prev =temp;
			size++;
		}
		
	}
		
	
	public int removeLast() {
		if(head ==null)
			throw new RuntimeException("List is Empty.!");
//		
//		if(size==1) {
//			int elem = tail.data;
//			head.next = null;
//			tail.next = null;
//			head.prev = null;
//			tail.prev = null;
//			size--;
//			return elem;
//		}
		
		if(head ==tail) {
			int elem = tail.data;
			head = tail =null;
			size--;
			return elem;
			
		}
		
		else {
			int elem = tail.data;
			tail = tail.prev;
			tail.next = null;
			
			size--;
			return elem;
		}
					
	}
	
	public int removeFirst() {
		if(head ==null)
			throw new RuntimeException("List is Empty.!");
		
		int elem = head.data;
		head = head.next;
		size--;
		return elem;
		
	}
	
	public int remove(int pos) {
		if(pos<1 || pos>size)
			   throw new RuntimeException("Invalid Position");
		
		if(pos==1)
			return removeFirst();
		if(pos==size)
			return removeLast();
		
		int i = 1;
		Node currNode = head;
		
		while(i <pos) {
			currNode = currNode.next;
			i++;
		}
		
		int elem = currNode.data;
		currNode.prev.next=currNode.next;
		currNode.next.prev = currNode.prev;
		currNode.prev = null;
		currNode.next = null;
		size--;	
		return elem;
	}
	
	
    public void display() {
    	
    	Node currNode = head;
    	
    	while(currNode!=null) {
    		System.out.print(currNode.data+" ");
    		currNode = currNode.next;
    	}
    	System.out.println();
    }
    
    public  int getSize() {
    	return this.size;
    }
	

}
