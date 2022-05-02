package com.greatlearningBST;

import java.util.Scanner;


public class DriverBST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum ");
		int sum = sc.nextInt();
		
		BST_SUM.Node root = null;
		
		BST_SUM fp = new BST_SUM();
		
		root = fp.insert(root, 40);
	    root = fp.insert(root, 20);
	    root = fp.insert(root, 60);
	    root = fp.insert(root, 10);
	    root = fp.insert(root, 30);
	    root = fp.insert(root, 50);
	    root = fp.insert(root, 70);
	 
	    fp.findPair(root, sum);
	    
	    sc.close();

	}

}

	


