package simple_linkedList;

class Node{
	public  int data;
	public  Node next;
	
	public Node(int data) {
		this.data= data;
		this.next=null;
	}
}

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void addLast(int data) {
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			tail = temp;
			
		}
		else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next=temp;
			tail = temp;
			
		}
		size++;
	}
	
	public void addFirst(int data) {
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			tail = temp;
		}
		else {
			temp.next=head;
			head = temp;
		}
		size++;
		
	}
	
	public void insert(int pos,int data) {
		Node temp = new Node(data);
		if(pos==1) {
			temp.next = head;
			head = temp;
			return;
		}
		
		Node currNode = head;
		int i = 1;
		while(i < pos-1) {
			currNode = currNode.next;
			i++;
		}
		temp.next = currNode.next;
		currNode.next = temp;
		size++;
	}
	
	public int removeFirst() {
		if(head == null)
			 throw new RuntimeException("List is empty.!");
		int elem = head.data;
		head = head.next;
		size--;
		return elem;
	}
	
	public int removeLast() {
		if(head == null)
			 throw new RuntimeException("List is empty.!");
		
		if(size==1) {
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
		currNode.next = null;
		tail = currNode;
		size--;
		return elem;
	}
	
	public int remove(int pos) {
		if(pos==1) {
			removeFirst();
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
		while(currNode != null) {
			System.out.print(currNode.data+" ");
			currNode  = currNode.next;
		}
		
		System.out.println();
		
	}
	
	public int getSize() {
		return this.size;
	}
	
	
	
	
	

}
