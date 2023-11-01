package circular_linkedList;



class Node{
	public  int data;
	public  Node next;
	
	public Node(int data) {
		this.data= data;
		this.next=null;
	}
}

public class CircularLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void addLast(int data) {
		
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			head.next=head;
			tail = temp;
			
		}
		else {
			tail.next=temp;
			temp.next=head;
			tail=temp;
			
		}
		
		size++;
	}
	
	public void addFirst(int data) {
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			head.next=head;
			tail = temp;
		}
		else {
			temp.next=head;
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
			tail.next = temp;
			tail = temp;
			tail.next = head;
			
		}
		
		else {
			Node currNode = head;
			int i = 1;
			while(i < pos-1) {
				currNode = currNode.next;
				i++;
			}
			temp.next = currNode.next;
			currNode.next = temp;
		}
		
		size++;
	}
	
	public int removeFirst() {
		if(head == null)
			 throw new RuntimeException("List is empty.!");
		
		int elem = head.data;
		head = head.next;
		tail.next = head;
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
		Node currNode = head;
		while(currNode.next!=tail) {
			currNode = currNode.next;
		}
		currNode.next = head;
		tail = currNode;
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
		while(i<pos-1) {
			currNode = currNode.next;
			i++;
		}
		int elem = currNode.next.data;
		currNode.next = currNode.next.next;
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
