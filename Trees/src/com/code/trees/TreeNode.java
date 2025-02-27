package com.code.trees;

public class TreeNode {
	
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

	public static void main(String[] args) {
		int temp = 4;
		TreeNode tn = new TreeNode(temp);
		System.out.println(tn);

	}

}
