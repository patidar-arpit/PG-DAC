
public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
		bst.insert(40);
		bst.insert(5);
		bst.insert(4);
		bst.insert(7);
		
		//10 20 30 40 5 4 7
		
		bst.preorder();
		bst.inorder();
		bst.postorder();
		
		bst.find(7);
	}

}
