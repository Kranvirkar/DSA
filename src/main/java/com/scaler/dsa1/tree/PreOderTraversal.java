package com.scaler.dsa1.tree;

public class PreOderTraversal {
    Node root;

    PreOderTraversal(){
        root =null;
    }

    void printPreOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.key);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPreOrder(){
        printPreOrder(root);
    }

    public static void main(String[] args) {
        PreOderTraversal tree = new PreOderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreOrder();
    }
}
