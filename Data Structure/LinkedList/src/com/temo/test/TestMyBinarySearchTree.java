package com.temo.test;
import com.demo.tree.*;
public class TestMyBinarySearchTree {
	public static void main(String[] args) {
		MyBinarySearchTree bst=new MyBinarySearchTree();
		bst.insertNode(31);
		bst.insertNode(15);
		bst.insertNode(17);
		bst.insertNode(18);
		System.out.println("Inorder");
		bst.inorder();
		System.out.println("preorder");
		bst.preOrder();
		System.out.println("postorder");
		bst.postOrder();
		
		bst.search(33);
	
		bst.search(38);
		
		bst.deleteNode(18);

		bst.deleteNode(32);
		bst.inorder();
		bst.deleteNode(15);
		bst.inorder();

	}

	
}
