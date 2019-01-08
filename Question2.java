package ProgrammingAssignment2;

import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {	
		
		BinarySearchTree BStree = new BinarySearchTree();
		 
		 Random rand = new Random();
		 
		//Create scanner
		Scanner input = new Scanner(System.in);  
		
		System.out.print("Enter the number of nodes in the tree(5 - 30): ");			//prompt for #
		
		int numOfNodes = input.nextInt();
		
		while (numOfNodes < 5 || numOfNodes > 30) {
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
		}
		 
		
		
		System.out.println("\nPrinting BT in order of nodes:");			//BT == array - print array 
		for (int i = 0; i < numOfNodes; i++) 
			System.out.print(array[i] + "  ");	
		
		int selection = 0;
		
		do {
		
		System.out.println("\n\nChoose a traversal technique: ");		//prompt
		System.out.println("1. Inorder");
		System.out.println("2. Preorder");
		System.out.println("3. Postorder");
		System.out.println("4. Break");

		selection = input.nextInt();
		
		if (selection == 1)			//inorder method
			BStree.inOrder(BStree.root);
				
		if (selection == 2)			//preorder method
			BStree.preOrder(BStree.root);
		
		if (selection == 3)			//postorder method
			BStree.postOrder(BStree.root);
			
		} while (selection != 4);	//end if selction = 4
		
		System.out.println("Ending Program.");
		
	}

}
