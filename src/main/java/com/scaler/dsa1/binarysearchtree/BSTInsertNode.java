package com.scaler.dsa1.binarysearchtree;

public class BSTInsertNode {

    public static BSTNode insert(BSTNode root,int key){
        if (root==null){
            return new BSTNode(key);
        }
        if (root.data<key){
            root.right=insert(root.right,key);
        }else {
            root.left=insert(root.left,key);
        }
        return root;
    }

    public BSTNode insertIterative(BSTNode root, int key) {
        BSTNode newNode = new BSTNode(key);

        if (root == null) return newNode;

        BSTNode current = root;
        BSTNode parent = null;

        while (current != null) {
            parent = current;
            if (key < current.data) {
                current = current.left;
            } else if (key > current.data) {
                current = current.right;
            } else {
                return root; // duplicate, do nothing
            }
        }

        if (key < parent.data) parent.left = newNode;
        else parent.right = newNode;

        return root;
    }
}
