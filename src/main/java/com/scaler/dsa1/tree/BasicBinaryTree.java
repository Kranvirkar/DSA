package com.scaler.dsa1.tree;


public class BasicBinaryTree {

    Node root;
    BasicBinaryTree(int key){
        root=new Node(key);
    }
    BasicBinaryTree(){
        root=null;
    }

    public static void main(String[] args) {

        BasicBinaryTree tree =new BasicBinaryTree();
        tree.root=new Node(2);
        tree.root.left=new Node(3);
        tree.root.right=new Node(5);
    }
}
