package ProgrammingAssignment2;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	class Node {
        int num;
        Node left, right;
 
        public Node(int a) {
            num = a;
            left = right = null;
        	}
    }
	
    Node root;			//root node
 

    BinaryTree(int a) {		//constructor that sets root to #
        root = new Node(a);
    }
 
    BinaryTree() {			//constructor that sets root to NULL
        root = null;
    }
	
	void insert(int a) {
		root = insertFunction(root, a);
	}
	
	Node insertFunction(Node root, int a) {
	    if (root == null) {			//If tree is empty, create node with # and set as root
	        root = new Node(a);
	        return root;
	    }
	 
	    if (root.left == null) 
	        root.left = new Node(a);		//if root.left isn't claimed - go left
	    else if (root.right == null) 
	        root.right = new Node(a);		//if root.right isn't claimed - go right
	    else 
	        return root;
	 
	    return root;
	}
	
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(" " + node.num);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right!= null) {
	            nodes.add(node.right);
	        }
	    }
	}
	
	
	
	
	
	
	
	
}//end of file
