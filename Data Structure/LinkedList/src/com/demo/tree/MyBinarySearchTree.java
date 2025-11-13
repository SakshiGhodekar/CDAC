package com.demo.tree;

public class MyBinarySearchTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}	
	}
	public MyBinarySearchTree() {
		root=null;
	}
	
	public void insertNode(int key) {
		root=insertData(root,key);
	}
	
	public Node insertData(Node root,int key) {
		Node newNode=new Node(key);
		if(root==null) {
			root=newNode;
			return root;
		}else {
			if(key<root.data) {
				root.left=insertData(root.left,key);
			}else {
				root.right=insertData(root.right,key);
			}
			return root;
		}	
	}
	public void inorder() {
		inorderTravrsal(root);
		System.out.println();;
	}
	private void inorderTravrsal(Node root) {
		if(root!=null) {
			inorderTravrsal(root.left);
			System.out.println(root.data);
			inorderTravrsal(root.right);
		}
	}
	public void preOrder() {
		preOrderTraversal(root);
		System.out.println();
	}
	private void preOrderTraversal(Node root) {
		if(root!=null) {
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
			
		}
	}
	public void postOrder() {
		postOrderTraversal(root);
		System.out.println();
	}
	private void postOrderTraversal(Node root) {
		if(root!=null) {
			
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data);
			
			
		}
	}
	public void deleteNode(int key) {
		root=deleteData(root,key);
	}
	private Node deleteData(Node root,int key) {
		if(root==null) {
			return root;
		}
		if(key<root.data) {
			root.left=deleteData(root.left,key);
		}else if(key>root.data) {
			root.right=deleteData(root.right,key);
		}else {
			if(root.left==null&&root.right==null) {
				return null;
			}else if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
			root.data=minValue(root.right);
			root.right=deleteData(root.right,root.data);
		}
		return root;
		
	}
	private int minValue(Node root) {
		int min=root.data;
		while(root.left!=null) {
			min=root.left.data;
			root=root.left;
		}

		return min;
	}
	public boolean search(int key) {
		return searchBinaryTree(root,key);
	}
	public boolean searchNonRecussive(int key) {
		return searchBinaryTreeNonRecurssive(root,key);
	}
	private boolean searchBinaryTreeNonRecurssive(Node root, int key) {
		if(root!=null) {
			Node temp=root;
			while(temp!=null) {
				if(temp.data==key) {
					System.out.println(key+ " data found");
					return true;
				}else if(key<temp.data) {
					temp=temp.left;
				}else {
					temp=temp.right;
				}
			}
		}
		System.out.println(key +" not found");
		return false;
	}


public boolean searchBinaryTree(Node root,int key) {

	if(root!=null) {
		if(root.data==key) {
			System.out.println("data found");
			return true;
		}
		else if(key<root.data) {
			return searchBinaryTree(root.left,key);
			
		}else {
			return searchBinaryTree(root.right,key);
		}
	}
	System.out.println("not found");
	return false;
}
}

