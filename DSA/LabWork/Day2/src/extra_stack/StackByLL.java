package extra_stack;


class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	public void add(int data) {
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
	public int remove() {
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
	
}

class Stack{
	
	private int top =-1;
	LinkedList li = new LinkedList();
	
	public void push(int data) {
	   
		li.add(data);
		top++;	
	}
	
	public int pop() {
		
		return li.remove();
	}
	
}
public class StackByLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(10);
		

	}

}
