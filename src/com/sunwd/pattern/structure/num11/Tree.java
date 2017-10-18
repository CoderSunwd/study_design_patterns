package com.sunwd.pattern.structure.num11;

import java.util.Enumeration;

public class Tree {
	
	TreeNode root = null;
	
	public Tree(String name){
		root = new TreeNode(name);
	}
	
	//遍历并打印树节点
	public static void showNodes(TreeNode node){
		System.out.println("当前节点的名称：" + node.getName());
		
		if (node.getChildren().hasMoreElements()){
			System.out.println("它的子节点有：");
		}
		
		Enumeration<TreeNode> elements = node.getChildren();
		for (Enumeration e=elements; e.hasMoreElements();){
			TreeNode temp = (TreeNode)e.nextElement();
			System.out.println("孩子节点：" + temp.getName());
		}
		
		Enumeration<TreeNode> nodes = node.getChildren();
		for (Enumeration e=nodes; e.hasMoreElements();){
			TreeNode temp = (TreeNode)e.nextElement();
			showNodes(temp);
		}
	}
	
	public static void main(String[] args){
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		TreeNode nodeD = new TreeNode("D");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		tree.root.add(nodeD);
		System.out.println("build the tree finished!");
		System.out.println("It's children :");
		
		showNodes(tree.root);
	}

}
