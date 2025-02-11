package com.scaler.dsa1.tree;

public class PrintNodesAtKthDistance {
    Node root;

    PrintNodesAtKthDistance(){
        root=null;
    }

    void printKth(Node node,int k){
        if (node==null ||k<0){
            return;
        }
        if(k==0){
            System.out.println(node.key);
        }else {
            printKth(node.left,k-1);
            printKth(node.right,k-1);
        }
    }

    public static void main(String[] args) {
        PrintNodesAtKthDistance tree = new PrintNodesAtKthDistance();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);

        tree.printKth(tree.root, 2);
    }
}
