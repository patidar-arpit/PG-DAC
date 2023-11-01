package doubly_circular;

class Node{
	public  int data;
	public  Node next;
	public Node prev;
	
	public Node(int data) {
		this.data= data;
		this.next=null;
		this.prev = null;
	}
}

public class DoublyCircularLL {
	
	private Node head;
	private Node tail;
	private int size;
	
     public DoublyCircularLL() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = null;
	}
	
	public void addLast(int data) {
		
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			head.next=head;
			head.prev = head;
			tail = temp;
			
		}
		else {
			tail.next=temp;
			temp.prev = tail;
			temp.next=head;
			head.prev = temp;
			tail=temp;	
		}
		
		size++;
	}
	
	public void addFirst(int data) {
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			head.next=head;
			head.prev = head;
			tail = temp;
		}
		else {
			temp.next=head;
			head.prev = temp;
			
			tail.next = temp;
			temp.prev = tail;
			
			head = temp;
			tail.next = head;
		}
		size++;
		
	}
	
	public void insert(int pos,int data) {
		Node temp = new Node(data);
		
		if(pos <1 || pos >size)
			throw new RuntimeException("Invalid Size");
		
		if(pos==1) {
			addFirst(data);
			return;
		}
		
		else if(pos==size) {
			temp.next = tail;
			temp.prev = tail.prev;
			tail.prev.next = temp;
			tail.prev = temp;
			tail = temp;
			
		}
		
		else {
			Node currNode = head;
			int i = 1;
			while(i < pos) {
				currNode = currNode.next;
				i++;
			}
			
			temp.next =currNode;
			currNode.prev.next = temp;
			temp.prev = currNode.prev;
			currNode.prev = temp;
		}
		
		size++;
	}
	
	public int removeFirst() {
		if(head == null)
			 throw new RuntimeException("List is empty.!");
		
		int elem = head.data;
		
		
		tail.next = head.next;
		head.next.prev = tail;
		head = head.next;
		size--;
		return elem;
	}
	
	public int removeLast() {
		if(head == null)
			 throw new RuntimeException("List is empty.!");
		
		if(head ==tail) {
			int elem = head.data;
		    head = null;
		    tail = null;
		    size--;
		    return elem;
		}
				
		int elem = tail.data;
	
		head.prev = tail.prev;
		tail = tail.prev;
		tail.next = head;
		
		size--;
		return elem;
	}
	
	public int remove(int pos) {
		if(pos==1) 
			return removeFirst();
		
		
	     if(pos == size) {
			
			return removeLast();
		}
		
		Node currNode = head;
		int i =1;
		while(i<pos) {
			currNode = currNode.next;
			i++;
		}
		
		int elem = currNode.next.data;
		
		currNode.prev.next = currNode.next;
		currNode.next.prev =  currNode.prev;
		currNode.next =null;
		currNode.prev= null;
		size--;
		return elem;
		
	}
	
	
	public void  display() {
		
        Node currNode = head;
    	
    	do {
    		System.out.print(currNode.data+" ");
    		currNode=currNode.next;
    	}while(currNode != head);
    	
    	System.out.println();
	}
	
	public int getSize() {
		return this.size;
	}
	

}

