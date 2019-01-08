package ProgrammingAssignment2;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	class Node {
        int num;
        Node left, right;
 
        public Node(int a) {
            num = a;
            left = right = null;
        	}
    }
 
    Node root;			//root node
 
    BinarySearchTree() { 		//constructor that sets root to NULL (empty)
        root = null; 
    }
 
    void insert(int a) {
       root = insertFunction(root, a);		//calls insertFinction and returns new root node
    }	
     
    Node insertFunction(Node root, int a) {	//recursive function for instertion of new node
        
        if (root == null) {			//If tree is empty, create node with # and set as root
            root = new Node(a);
            return root;
        	}
 
        if (a <= root.num)
            root.left = insertFunction(root.left, a);	//if # is < root - go left
        else if (a >= root.num)
            root.right = insertFunction(root.right, a);	//if # is > root - go right	
 
        return root;		//return new root node 
    }
 
    void inOrder(Node root)  {			//prints nodes in inOrder fashion

    	if (root != null) {
            inOrder(root.left);
            System.out.print(root.num + "  ");
            inOrder(root.right);
    		}
    }
    
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.num + "  ");
            preOrder(node.left);
            preOrder(node.right);
        	}
    }
    
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.num + "  ");
        	}
    }
    
    
    public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(node.num + "  ");
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right!= null) {
	            nodes.add(node.right);
	        }
	    }
	}
    
    
    
}//end of file

