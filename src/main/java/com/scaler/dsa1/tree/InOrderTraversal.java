package com.scaler.dsa1.tree;

public class InOrderTraversal {

    Node root;

    InOrderTraversal(){
        root=null;
    }

    void printInOrder(Node node){
        if(node==null){
            return;
        }
        printInOrder(node.left);
        System.out.println(node.key);
        printInOrder(node.right);
    }

    void printInOrder(){
        printInOrder(root);
    }

    public static void main(String[] args) {
        InOrderTraversal tree =new InOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInOrder();
    }
}
