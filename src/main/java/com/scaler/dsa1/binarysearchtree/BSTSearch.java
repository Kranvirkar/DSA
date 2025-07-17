package com.scaler.dsa1.binarysearchtree;

public class BSTSearch {


    public static void main(String[] args) {
        BSTNode root = new BSTNode(10);
        root.left = new BSTNode(5);
        root.right = new BSTNode(20);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(7);

        BSTNode result = search1(root, 7);
        System.out.println(result != null ? "Found: " + result.data : "Not Found");
    }

    public static BSTNode search(BSTNode root, int key) {
        // Base Cases: root is null or key is present at root
        if (root==null || root.data==key)
            return root;

        // Key is greater than root's key
        if (root.data < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }
    //iterative approach
    public static BSTNode search1(BSTNode root, int key) {
        while (root!=null){
            if (root.data==key){
                return root;
            }else if (root.data<key){
                root=root.right;
            }else {
                root=root.left;
            }
        }
        return null;
    }
}
