package com.scaler.dsa1.tree;

public class SizeOftree {

    Node root;

    SizeOftree(){
        root=null;
    }

    int sizeOfTree(Node node){
        if (node==null){
            return 0;
        }
        int ltree =sizeOfTree(node.left);
        int rtree =sizeOfTree(node.right);
        return 1+ltree+rtree;
    }

    int sizeOfTree(){
        return sizeOfTree(root);
    }

    public static void main(String[] args) {
        SizeOftree tree= new SizeOftree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The size of binary tree is : "
                + tree.sizeOfTree());
    }

}
