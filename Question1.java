package ProgrammingAssignment2; 
import java.util.Scanner;
import java.util.Random;

public class Question1 {

	public static void main(String[] args) {	
	
		 BinarySearchTree BStree = new BinarySearchTree();
		 BinaryTree Btree = new BinaryTree();
		 
		 Random rand = new Random();
		 
		//Create scanner
		Scanner input = new Scanner(System.in);  
		
		System.out.print("Enter the number of nodes in the tree(10 - 30): ");			//prompt for #
		
		int numOfNodes = input.nextInt();
		
		while (numOfNodes < 10 || numOfNodes > 30) {
			System.out.print("Invalid number - try again: ");			//if invalid # entered - try again
			numOfNodes = input.nextInt();
		}
		
		int[] array = new int[numOfNodes];
		
		for (int i = 0; i < numOfNodes; i++) {			//fill array with random #s 
			array[i] = rand.nextInt((30 - 5) + 1) + 5;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j])				//check for repeative #s
					array[i] = rand.nextInt((30 - 5) + 1) + 5;}
		}
		
		for (int i = 0; i < numOfNodes; i++) {			//insert #s into BT and BST
			BStree.insert(array[i]);
			Btree.insert(array[i]);
		}
		 
		
		
		System.out.println("\nPrinting BT in order of nodes:");			//BT == array - print array 
		for (int i = 0; i < numOfNodes; i++) 
			System.out.print(array[i] + "  ");		
			
        System.out.println("\n\nPrinting BST in order of nodes: "); 		//print BST
        BStree.traverseLevelOrder();
	        
        System.out.println("\n\nEnding Program.");
	        
	    }//end of mail
}//end of file

