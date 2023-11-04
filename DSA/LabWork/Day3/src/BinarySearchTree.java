class Node{
	int data;
	Node right;
	Node left;
	
	public Node(int data) {
		this.data =data;
		this.right = null;
		this.left = null;
	}
}

public class BinarySearchTree {
   
	private Node root;
	
	 public BinarySearchTree() {
		 this.root = null;
	 }
	 
	 public void insert(int data) {
		Node newNode = new Node(data);
		if(root == null)
			root = newNode;
		
		else {
			insert(root, newNode);
		}
	 }
	 
	 ////10 20 30 40 5 4 7
	 private void insert(Node root,Node newNode) {
		 
		 if(root == null)
			 return;
		  
		 if(newNode.data < root.data) {
				if(root.left ==null)
					root.left = newNode;
				
				else
					insert(root.left, newNode);
	     }
		 else {
			 
			   if(root.right ==null)
					root.right = newNode;
				
				else
					insert(root.right, newNode);
		 }
			 
	 }
	 
	 public void preorder() {
		 preorderTrav(root);
		 System.out.println();
	 }
	 
	 public void preorderTrav(Node root) {
		 
		 if(root ==null)
			 return;
		 
		 System.out.print(root.data+" ");
		 preorderTrav(root.left);
		 preorderTrav(root.right);
		 
	 }
	 
	 public void postorder() {
		 postorderTrav(root);
		 System.out.println();
	 }
	 
	 public void postorderTrav(Node root) {
		 
		 if(root ==null)
			 return;
		 
		 postorderTrav(root.left);
		 postorderTrav(root.right);
		 System.out.print(root.data+" ");
		 
	 }
	 
	 public void inorder() {
		 inorderTrav(root);
		 System.out.println();
	 }
	 
	 public void   inorderTrav(Node root) {
		 
		 if(root ==null)
			 return;
		 
		 inorderTrav(root.left);
		 System.out.print(root.data+" ");
		 inorderTrav(root.right);	 
	 }

	public void find(int target) {
		// TODO Auto-generated method stub
		
	     Node currNode = root;
		 
		  find(target ,currNode);
		
	}

	private void find(int target, Node root) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			System.out.println("False");
			return;
		}
			
		  
			
		if(root.data >target)
			
			 find(target, root.left);
	
		else if(root.data < target)
			
			 find(target, root.right);
		else
			System.out.println("True");
		
		
	}

	 
		
	
}
